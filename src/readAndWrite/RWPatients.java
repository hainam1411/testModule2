package readAndWrite;

import model.Patient;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RWPatients {
    private File file = new File("src/data/medical_record.csv");

    public void writeFile(List<Patient> patients) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Patient patient : patients) {
                line += patient.getData();
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Patient> readFile() {
        List<Patient> books = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                books.add(new Patient(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4], data[5]));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return books;
    }
}
