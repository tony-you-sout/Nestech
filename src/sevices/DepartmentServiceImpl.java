package sevices;

import entities.DevTeamDepartment;
import entities.Employee;
import entities.HumanResourceDepartmant;
import entities.SaleDepartment;
import repositories.DepartmentRepository;
import repositories.DepartmentRepositoryImpl;
import repositories.EmployeeRepository;
import repositories.EmployeeRepositoryImpl;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class DepartmentServiceImpl implements DepartmentService{
    SaleDepartment saleDepartment=new SaleDepartment();
    DevTeamDepartment devTeamDepartment=new DevTeamDepartment();
    HumanResourceDepartmant humanResourceDepartmant=new HumanResourceDepartmant();
    Scanner scanner=new Scanner(System.in);
DepartmentRepository departmentRepository=new DepartmentRepositoryImpl();
EmployeeRepository employeeRepository=new EmployeeRepositoryImpl();

    @Override
    public void addEmployee(UUID uid) {
                System.out.println("Bạn muốn thêm nhân viên vào phòng ban nào");
        System.out.println("1.Sale 2.HR 3.Dev");
        int option=Integer.parseInt(scanner.nextLine());
        List<Employee> lstEmployee=employeeRepository.getListEmployee();
        switch (option){
            case 1:
                for(Employee e:lstEmployee){
                   if(e.getMaNV().equals(uid)){
//                       saleDepartment.addEmployeeToDepartment(e);
//                       departmentService.addEmployeeToDepartment(e);
                        departmentRepository.addEmployeeToDepartment(1,e);
                       System.out.println("đã thêm");
                       return;
                   }
            }
                System.out.println("Không có nhân viên này");
                break;
            case 2:
                for(Employee e:lstEmployee){
                    if(e.getMaNV().equals(uid)){
                        departmentRepository.addEmployeeToDepartment(2,e);
                        System.out.println("đã thêm");
                        return;
                    }
                }
                System.out.println("Không có nhân viên này");
                break;
            case 3:
                for(Employee e:lstEmployee){
                    if(e.getMaNV().equals(uid)){
                        departmentRepository.addEmployeeToDepartment(3,e);
                        System.out.println("đã thêm");
                        return;
                    }
                }
                System.out.println("Không có nhân viên này");
                break;
            default:
                System.out.println("Không có phòng ban này");

        }
    }

    @Override
    public void printListEmployee(int option) {
        List<Employee> lstEmployee=null;
                switch (option){
            case 1:
//                 saleDepartment.printLstEmployee();
                lstEmployee= departmentRepository.printListEmployee(1);
                for(Employee e:lstEmployee){
                    System.out.printf("ID:%s\n",e.getMaNV().toString());
                    System.out.printf("Name:%s\n",e.getName());
                    System.out.printf("Năm sinh:%s\n",e.getDateOfBirth());

                }
                break;
            case 2:
                lstEmployee= departmentRepository.printListEmployee(2);
                for(Employee e:lstEmployee){
                    System.out.printf("ID:%s\n",e.getMaNV().toString());
                    System.out.printf("Name:%s\n",e.getName());
                    System.out.printf("Năm sinh:%s\n",e.getDateOfBirth());

                }
                break;
            case 3:
                lstEmployee= departmentRepository.printListEmployee(3);
                for(Employee e:lstEmployee){
                    System.out.printf("ID:%s\n",e.getMaNV().toString());
                    System.out.printf("Name:%s\n",e.getName());
                    System.out.printf("Năm sinh:%s\n",e.getDateOfBirth());

                }
                break;
            default:
                System.out.println("Không có lựa chọn này");

        }
    }
}
