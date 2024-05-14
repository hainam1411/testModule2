package menu;

import manage.PatientManagement;
import model.Patient;

import java.util.Date;
import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    PatientManagement patientManagement = new PatientManagement();
    public void displayMenu() {
        boolean exit = true;

        do {
            try {
                int choice = showMenuOption(scanner);
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        showMenuAdd();
                        break;
                    case 2:
                        showMenuDelete();
                        break;
                    case 3:
                        showList();
                        break;
                    case 4:
                        exit = false;
                        System.out.println("Good bye!");
                        break;
                    default:
                        System.err.println("HÃy nhập từ 1 đến 4");
                }
            }catch (Exception e){
                System.err.println("Không sử dụng chữ cái hoặc kí tự đặc biêt");
                scanner.nextLine();
            }

        } while (exit);
    }
    private int showMenuOption(Scanner scanner){
        System.out.println("------------CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN-------------");
        System.out.println("Chọn chức năng theo số (để tiếp tục):");
        System.out.println("1. Thêm mới");
        System.out.println("2. Xóa");
        System.out.println("3. Xem danh sách bệnh án");
        System.out.println("4. THoát");
        System.out.print("Your choice is: ");
        return scanner.nextInt();
    }
    private void showMenuAdd(){
        System.out.println("=====THÊM MỚI BỆNH ÁN =====");
        try {
            System.out.print(" Nhp số thứ tự: ");
            int mumericalOrder = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập mã bệnh nhân: ");
            String patientCode = scanner.nextLine();
            System.out.println("Nhập tên bênh nhân: ");
            String patientName = scanner.nextLine();
            System.out.print("Nhập ngày vào: ");
            String dayIn= scanner.nextLine();
            System.out.print("Nhập ngày ra: ");
            String dayOut= scanner.nextLine();
            System.out.print("Lí do nhập viện: ");
            String reason = scanner.nextLine();
            Patient patient = new Patient( mumericalOrder,patientCode,patientName, dayIn, dayOut,reason);
            patientManagement.add(patient);
            System.out.println("thêm thành công");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    private void showMenuDelete(){}
    private void showList(){}
}
