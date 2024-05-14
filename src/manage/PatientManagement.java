package manage;

import model.Patient;
import readAndWrite.RWPatients;

import java.util.List;

public class PatientManagement implements IManage<Patient> {
    private List<Patient> patientList;
    private RWPatients rwPatients = new RWPatients();
    public PatientManagement() {
        patientList = rwPatients.readFile();
    }


    @Override
    public void add(Patient patient) {
        patientList.add(patient);
        rwPatients.writeFile(patientList);
    }

    @Override
    public boolean delete(int id) {
        return false;
        //rwPatients.writeFile(patientList);
    }

    @Override
    public int findById(int id) {
        return 0;
    }

//    public Patient findById(String id) {
//        for (Patient patient : patientList) {
//            if (patient.getPatientCode() == id) {
//                return patient;
//            }
//        }
//        return ;
//    }

    @Override
    public List<Patient> findAll() {
        return patientList;
    }
}
