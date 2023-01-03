package sevices;

import java.util.UUID;

public interface EmployeeService {
//    xử lý logic code nghiệp vuk
    public void addEmpployee(String name,String dateOfBirth);

    void printLstEmployee();

    void deleteEmployee(UUID uid);

    void changeEmployee(UUID uid);

    void promote(UUID uid);
}
