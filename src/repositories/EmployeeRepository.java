package repositories;

import entities.Employee;

import java.util.LinkedList;
import java.util.List;

public interface EmployeeRepository {
//    lưu trữ data->kết nối vào csdl
    List<Employee> lstEmployee=new LinkedList<>();

    void addEmployee(Employee e);

    List<Employee> getListEmployee();

    void removeEmployee(Employee e);
}
