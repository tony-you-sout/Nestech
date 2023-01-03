package sevices;

import entities.Employee;
import repositories.EmployeeRepository;
import repositories.EmployeeRepositoryImpl;

import java.util.Scanner;
import java.util.UUID;

public class EmployeeServiceimpl implements EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    private Scanner scanner=new Scanner(System.in);


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
}
