package sevices;

import bean.IoCContainer;
import entities.Director;
import entities.Employee;
import entities.Manager;
import repositories.EmployeeRepository;
import repositories.EmployeeRepositoryImpl;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class EmployeeServiceimpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    private Scanner scanner=new Scanner(System.in);
    public EmployeeServiceimpl(){
        employeeRepository=(EmployeeRepository) IoCContainer.getBean("employeeRepository");
    }


    @Override
    public void addEmpployee(String name, String dateOfBirth) {
        Employee e = new Employee(name, dateOfBirth);
//        lstEmployee.add(e);
        employeeRepository.addEmployee(e);
    }

    @Override
    public void printLstEmployee() {
        for (Employee e : employeeRepository.getListEmployee()) {
            System.out.printf("MANV:%s\n", e.getMaNV().toString());
            System.out.printf("Tên:%s\n", e.getName());
            System.out.printf("Năm sinh %s\n", e.getDateOfBirth());
            System.out.printf("Position:%s\n", e.getPosition());
            System.out.printf("Salary:%d\n", e.caculateSalary());
            System.out.println("---------------------------------");
        }

    }

    @Override
    public void deleteEmployee(UUID uid) {
        for (Employee e : employeeRepository.getListEmployee()) {
            if (e.getMaNV().equals(uid)) {
                System.out.println("Bạn có chắc muốn xóa Y/N");
                String confirmation = scanner.nextLine();
                if (confirmation.equals("y") || confirmation.equals("Y")) {
                    employeeRepository.removeEmployee(e);
                    return;
                }
                return;
            }
        }
    }

    @Override
    public void changeEmployee(UUID uid) {
                for(Employee e:employeeRepository.getListEmployee()){
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
    }

    @Override
    public void promote(UUID uid) {
        List<Employee> lstEmployee=employeeRepository.getListEmployee();
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

    @Override
    public void caculateSalary(UUID uid) {
        List<Employee> lstEmployee=employeeRepository.getListEmployee();
                for (Employee e:lstEmployee){
            if(e.getMaNV().equals(uid)){
                System.out.printf("Name:%s\n",e.getName());
                System.out.printf("Salary:%d\n",e.caculateSalary());
                System.out.println("------------------------------");
                return;
            }
        }
    }
}
