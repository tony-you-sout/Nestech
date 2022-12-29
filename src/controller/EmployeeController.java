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
    List<Employee> lstEmployee=new LinkedList<>();
    private EmployeeService employeeService=new EmployeeServiceimpl();
    private Scanner scanner;
    public EmployeeController(Scanner scanner){
        this.scanner=scanner;

    }

    public void addEmployee(){

        System.out.println("Nhập tên nhân viên");
        String name=scanner.nextLine();
        System.out.println("nhập năm sinh");
        String dateOfBirth=scanner.nextLine();

        employeeService.addEmpployee(name,dateOfBirth);

    }
    public void printLstEmployee(){
        for(Employee e:lstEmployee){
            System.out.printf("MANV:%s\n", e.getMaNV().toString());
            System.out.printf("Tên:%s\n",e.getName());
            System.out.printf("Năm sinh %s\n",e.getDateOfBirth());
            System.out.printf("Position:%s\n",e.getPosition());
            System.out.printf("Salary:%d\n",e.caculateSalary());
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

    public void promote() {
        System.out.println("Nhập mã nhân viên");
        UUID uid=UUID.fromString(scanner.nextLine());
        for(Employee e:lstEmployee){
            if(e.getMaNV().equals(uid)){
                System.out.println("1.Director 2.Manager");
                int option=Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                        Director d=new Director(e.getName(),e.getDateOfBirth(),e.getMaNV());
                        d.setPosition("Director");//set lại thuộc tinhs position thành director
                        lstEmployee.set(lstEmployee.indexOf(e),d);
                        System.out.println("đã save");
                        return;
                    case 2:
                        Manager m=new Manager(e.getName(),e.getDateOfBirth(),e.getMaNV());
                        m.setPosition("Manager");
                        lstEmployee.set(lstEmployee.indexOf(e), m);
                        System.out.println("đã save");
                        return;
                    default:
                        System.out.println("không có lựa chọn này");
                }

            }
        }

    }

    public void caculateSalary() {
        System.out.println("Nhập manv");
        UUID uid=UUID.fromString(scanner.nextLine());
        for (Employee e:lstEmployee){
            if(e.getMaNV().equals(uid)){
                System.out.printf("Name:%s\n",e.getName());
                System.out.printf("Salary:%d\n",e.caculateSalary());
                System.out.println("------------------------------");
                return;
            }
        }
        System.out.println("Nhân viên này không tồn tại");
    }
}
