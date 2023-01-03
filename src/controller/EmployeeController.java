package controller;

import entities.Director;
import entities.Employee;
import entities.Manager;
import sevices.EmployeeService;
import sevices.EmployeeServiceimpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class EmployeeController {
//    tiếp nhận request và trả về response cho user


    private Scanner scanner;
    public EmployeeController(Scanner scanner){
        this.scanner=scanner;

    }
    private EmployeeService employeeService=new EmployeeServiceimpl();

    public void addEmployee(){

        System.out.println("Nhập tên nhân viên");
        String name=scanner.nextLine();
        System.out.println("nhập năm sinh");
        String dateOfBirth=scanner.nextLine();

        employeeService.addEmpployee(name,dateOfBirth);

    }
    public void printLstEmployee(){

        employeeService.printLstEmployee();
    }


    public void deleteEmployee() {
        System.out.println("Nhập mã nhân viên muốn xóa");
        UUID uid=UUID.fromString(scanner.nextLine());
        employeeService.deleteEmployee(uid);
        System.out.println("Không có nhân viên này");
        System.out.println("----------------------------------");
    }


    public void changeEmployee() {
        System.out.println("nhập MANV muốn thay đổi");
        UUID uid=UUID.fromString(scanner.nextLine());
        employeeService.changeEmployee(uid);
        System.out.println("Kooong có nhân viên này");
        System.out.println("----------------------------------");
    }


    public void promote() {
        System.out.println("Nhập mã nhân viên");
        UUID uid=UUID.fromString(scanner.nextLine());
        employeeService.promote(uid);


    }

    public void caculateSalary() {
        System.out.println("Nhập manv");
        UUID uid=UUID.fromString(scanner.nextLine());
        employeeService.caculateSalary(uid);
        System.out.println("Nhân viên này không tồn tại");
    }
}

