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
}
