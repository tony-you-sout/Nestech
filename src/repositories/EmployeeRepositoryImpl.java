package repositories;

import entities.Employee;

import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public void addEmployee(Employee e) {
        lstEmployee.add(e);
    }

    @Override
    public List<Employee> getListEmployee() {
        return lstEmployee;
    }

    @Override
    public void removeEmployee(Employee e) {
        lstEmployee.remove(e);
        System.out.println("đã xóa");
        System.out.println("-------------------------");
    }
}
