package controller;

import entities.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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
    public void getLstEmployee(){
        for(Employee e:lstEmployee){
            System.out.println(e.getName());
        }
    }
}
