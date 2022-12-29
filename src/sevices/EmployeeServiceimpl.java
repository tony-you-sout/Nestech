package sevices;

import entities.Employee;
import repositories.EmployeeRepository;
import repositories.EmployeeRepositoryImpl;

public class EmployeeServiceimpl implements EmployeeService{
    private EmployeeRepository employeeRepository=new EmployeeRepositoryImpl();

    @Override
    public void addEmpployee(String name, String dateOfBirth) {
                Employee e=new Employee(name,dateOfBirth);
//        lstEmployee.add(e);
        employeeRepository.addEmployee(e);
    }

    @Override
    public void printLstEmployee() {
                for(Employee e:employeeRepository.getListEmployee()){
            System.out.printf("MANV:%s\n", e.getMaNV().toString());
            System.out.printf("Tên:%s\n",e.getName());
            System.out.printf("Năm sinh %s\n",e.getDateOfBirth());
            System.out.printf("Position:%s\n",e.getPosition());
            System.out.printf("Salary:%d\n",e.caculateSalary());
            System.out.println("---------------------------------");
        }

    }
}
