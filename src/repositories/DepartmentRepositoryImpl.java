package repositories;

import entities.Employee;

import java.util.List;

public class DepartmentRepositoryImpl implements DepartmentRepository{


    @Override
    public void addEmployeeToDepartment(int option,Employee e) {
        switch (option){
            case 1:
                lstSaleEmployee.add(e);
                break;
            case 2:
                lstHrEmployee.add(e);
                break;
            case 3:
                lstDevEmployee.add(e);
            default:
                break;
        }
    }

    @Override
    public List<Employee> printListEmployee(int option) {
        switch (option){
            case 1:
                return lstSaleEmployee;
            case 2:
                return lstHrEmployee;
            case 3:
                return lstDevEmployee;
            default:
                return null;

        }
    }
}
