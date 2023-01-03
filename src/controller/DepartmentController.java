package controller;

import bean.IoCContainer;
import entities.DevTeamDepartment;
import entities.Employee;
import entities.HumanResourceDepartmant;
import entities.SaleDepartment;
import sevices.DepartmentService;
import sevices.DepartmentServiceImpl;
import sevices.EmployeeService;
import sevices.EmployeeServiceimpl;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class DepartmentController {
    Scanner scanner;

    private DepartmentService departmentService;
    private EmployeeService employeeService;
    public DepartmentController(Scanner scanner){

        this.scanner=scanner;
        employeeService=(EmployeeService) IoCContainer.getBean("employeeService");
        departmentService =(DepartmentService) IoCContainer.getBean("departmentService");
//        this.saleDepartment=new SaleDepartment();
//        this.devTeamDepartment=new DevTeamDepartment();
//        this.humanResourceDepartmant=new HumanResourceDepartmant();
    }


    public void addEmployee(){
        System.out.println("Nhập mã nhân viên ");
        UUID uid=UUID.fromString(scanner.nextLine());
        departmentService.addEmployee(uid);
//        System.out.println("Bạn muốn thêm nhân viên vào phòng ban nào");
//        System.out.println("1.Sale 2.HR 3.Dev");
//        int option=Integer.parseInt(scanner.nextLine());
//        switch (option){
//            case 1:
//                for(Employee e:lstEmployee){
//                   if(e.getMaNV().equals(uid)){
////                       saleDepartment.addEmployeeToDepartment(e);
//                       departmentService.addEmployeeToDepartment(e);
//                       System.out.println("đã thêm");
//                       return;
//                   }
//            }
//                System.out.println("Không có nhân viên này");
//                break;
//            case 2:
//                for(Employee e:lstEmployee){
//                    if(e.getMaNV().equals(uid)){
//                        humanResourceDepartmant.addEmployeeToDepartment(e);
//                        System.out.println("đã thêm");
//                        return;
//                    }
//                }
//                System.out.println("Không có nhân viên này");
//                break;
//            case 3:
//                for(Employee e:lstEmployee){
//                    if(e.getMaNV().equals(uid)){
//                        devTeamDepartment.addEmployeeToDepartment(e);
//                        System.out.println("đã thêm");
//                        return;
//                    }
//                }
//                System.out.println("Không có nhân viên này");
//                break;
//            default:
//                System.out.println("Không có phòng ban này");
//
//        }
    }

    public void printLstEmployee() {
        System.out.println("Chọn phòng ban");
        System.out.println("1.sale 2.HR 3.Dev");
        int option=Integer.parseInt(scanner.nextLine());
        departmentService.printListEmployee(option);
//
//        switch (option){
//            case 1:
//                saleDepartment.printLstEmployee();
//
//                break;
//            case 2:
//                humanResourceDepartmant.printLstEmployee();
//                break;
//            case 3:
//                devTeamDepartment.printLstEmployee();
//                break;
//            default:
//                System.out.println("Không có lựa chọn này");
//
//        }
    }
}
