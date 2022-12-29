package sevices;

import entities.Employee;

public class EmployeeServiceimpl implements EmployeeService{

    @Override
    public void addEmpployee(String name, String dateOfBirth) {
                Employee e=new Employee(name,dateOfBirth);
//        lstEmployee.add(e);
    }
}
