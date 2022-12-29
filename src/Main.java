import controller.DepartmentController;
import controller.EmployeeController;
import entities.Employee;

import java.util.List;
import java.util.Scanner;

public class Main {
//    viết chương trình quản lý nhân viên có các chức năng sau:
//    1.cho người dùng tạo 1 nhân viên mới có các thông tin: tên,năm sinh,mã nhân viên,tên cty sau đó thêm nhân viên này vào 1 ds nhân sự
//    2.cho người dùng xóa 1 nhân viên ra khỏi dsnv
//    3.cho người dùng sửa thông tin 1 nhân viên
//    4.in ra danh sách tất cả nhân viên
//    5.cho phép người dùng thêm nhân viên vào 1 trong 3 phòng ban:NhanSu,Sale,DevTeam
//    6. in ra danh sách nhân sự của 1 phòng ban
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        EmployeeController employeeController=new EmployeeController(scanner);
        DepartmentController departmentController=new DepartmentController(scanner);
//        employeeController.addEmployee();
//       employeeController.getLstEmployee();

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
}