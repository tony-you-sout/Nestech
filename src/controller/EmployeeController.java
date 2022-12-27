package controller;

import entities.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class EmployeeController {
    List<Employee> lstEmployee=new LinkedList<>();
    private Scanner scanner;
    public EmployeeController(Scanner scanner){
        this.scanner=scanner;

    }

    public void addEmployee(){

        System.out.println("Nhập tên nhân viên");
        String name=scanner.nextLine();
        System.out.println("nhập năm sinh");
        String dateOfBirth=scanner.nextLine();
        Employee e=new Employee(name,dateOfBirth);
        lstEmployee.add(e);

    }
    public void printLstEmployee(){
        for(Employee e:lstEmployee){
            System.out.printf("MANV:%s\n", e.getMaNV().toString());
            System.out.printf("Tên:%s\n",e.getName());
            System.out.printf("Năm sinh %s\n",e.getDateOfBirth());
            System.out.println("---------------------------------");
        }
    }
    public List<Employee> getLstEmployee(){
        return this.lstEmployee;
    }

    public void deleteEmployee() {
        System.out.println("Nhập mã nhân viên muốn xóa");
        UUID uid=UUID.fromString(scanner.nextLine());
        for(Employee e:lstEmployee){
            if(e.getMaNV().equals(uid)){
                System.out.println("Bạn có chắc muốn xóa Y/N");
                String confirmation=scanner.nextLine();
                if(confirmation.equals("y") || confirmation.equals("Y")){
                    lstEmployee.remove(e);
                    System.out.println("đã xóa");
                    System.out.println("-------------------------");
                    return;
                }
                return;

            }
        }
        System.out.println("Không có nhân viên này");
        System.out.println("----------------------------------");
    }

    public void changeEmployee() {
        System.out.println("nhập MANV muốn thay đổi");
        UUID uid=UUID.fromString(scanner.nextLine());
        for(Employee e:lstEmployee){
            if(e.getMaNV().equals(uid)){
                System.out.println("Nhập tên nhân viên");
                e.setName(scanner.nextLine());
                System.out.println("Nhập năm sinh");
                e.setDateOfBirth(scanner.nextLine());
                System.out.println("Đã lưu");
                System.out.println("----------------------------");
                return;
            }
        }
        System.out.println("Kooong có nhân viên này");
        System.out.println("----------------------------------");
    }
}
