package entities;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Department {
    private String departmentName;
    private Employee headOfDepartment;
    List<Employee> lstEmployee=new LinkedList<>();

    public void addEmployeeToDepartment(Employee e){
        lstEmployee.add(e);
    }
    public void printLstEmployee(){
        for(Employee e:lstEmployee){
            System.out.println("------------------------------------");
            System.out.printf("MANV:%s\n", e.getMaNV().toString());
            System.out.printf("Name:%s\n",e.getName());
            System.out.printf("DateOFBirth %s\n",e.getDateOfBirth());
            System.out.println("------------------------------------");

        }
    }


}
