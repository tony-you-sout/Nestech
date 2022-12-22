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
//        employeeController.addEmployee();
//       employeeController.getLstEmployee();

        while (true){
            printMenu();
            System.out.println("enter option");
            int option=Integer.parseInt(scanner.nextLine());;
                if(option<1||option>6)
                    return;
                switch (option){
                    case 1:
                        System.out.println("chon1");
                        break;
                    default:
                        System.out.println("chon sai");
                }
        }


    }

    public static void printMenu(){
        System.out.println("0. stop chuongư trình");
        System.out.println("1.Thêm nhân viên");
        System.out.println("2.Xóa nhân viên");
        System.out.println("3.Sửa thông tin nhân viên");
        System.out.println("4.In ra danh sách nhân viên");
        System.out.println("5.Thêm nhân viên vào 1 phòng ban");
        System.out.println("6.In ra ds nhân sự 1 phòng ban");

    }
}