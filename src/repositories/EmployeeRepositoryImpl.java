package repositories;

import entities.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public void addEmployee(Employee e) {
        lstEmployee.add(e);
    }
}
