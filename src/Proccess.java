import controller.DepartmentController;
import controller.EmployeeController;

import java.util.Scanner;

public class Proccess {
    static Scanner scanner=new Scanner(System.in);
    static EmployeeController employeeController=new EmployeeController(scanner);
    static DepartmentController departmentController=new DepartmentController(scanner);
    public static void printMenu(){
        System.out.println("---------MENU----------");
        System.out.println("0.stop chương trình");
        System.out.println("1.Thêm nhân viên");
        System.out.println("2.Xóa nhân viên");
        System.out.println("3.Sửa thông tin nhân viên");
        System.out.println("4.In ra danh sách nhân viên");
        System.out.println("5.Thêm nhân viên vào 1 phòng ban");
        System.out.println("6.In ra ds nhân sự 1 phòng ban");
        System.out.println("7.thăng chức cho 1 nv");
        System.out.println("8. tính tiền lương của 1 nv");
        System.out.println("--------------------------");
    }
    public static void handleRequest(){

        while (true){
                printMenu();
            System.out.println("enter option");
            int option=Integer.parseInt(scanner.nextLine());;
            switch (option){
                case 0:
                    System.out.println("bạn chọn dừng chương trình");
                    return;
                case 1:
                    System.out.println("bạn chọn thêm nhân viên");
                    employeeController.addEmployee();
                    break;
                case 2:
                    System.out.println("bạn chọn xóa 1 nhân viên");
                    employeeController.deleteEmployee();
                    break;
                case 3:
                    System.out.println("Bạn đã chọn sửa thông tin nhân viên");
                    employeeController.changeEmployee();
                case 4:
                    System.out.println("bạn chọn in ra danh sách nhân viên");
                    employeeController.printLstEmployee();
                    break;
                case 5:
                    System.out.println("Bạn đã chọn thêm nhân viên vào 1 phòng ban");
                    departmentController.addEmployee(employeeController.getLstEmployee());
                    break;
                case 6:
                    System.out.println("Bạn đã chọn in ra danh sách nhn viên của 1 phòng ban");
                    departmentController.printLstEmployee();
                    break;
                case 7:
                    System.out.println("Bạn đã chọn thăng chức cho 1 nv");
                    employeeController.promote();
                    break;
                case 8:
                    System.out.println("Bạn đã chọn tính tiền luương của 1 nhân viên ");
                    employeeController.caculateSalary();
                    break;
                default:
                    System.out.println("chon sai");
            }
        }


    }
}
