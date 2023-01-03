package bean;

import entities.Department;
import repositories.DepartmentRepository;
import repositories.DepartmentRepositoryImpl;
import repositories.EmployeeRepository;
import repositories.EmployeeRepositoryImpl;
import sevices.DepartmentService;
import sevices.DepartmentServiceImpl;
import sevices.EmployeeService;
import sevices.EmployeeServiceimpl;

public class IoCContainer {
    private static DepartmentService departmentService=null;
    private static EmployeeService employeeService=null;
    private static DepartmentRepository departmentRepository=null;
    private static EmployeeRepository employeeRepository=null;
    public static Object getBean(String beanName){
        switch (beanName){
            case "employeeService":
                return getEmployeeService();
            case "employeeRepository":
                return getEmployeeRepository();
            case "departmentService":
                return getDepartmentService();
            case "departmentRepository":
                return getDepartmentRepository();
            default:
                return null;
        }



    }

    private static DepartmentService getDepartmentService(){
        return departmentService==null?new DepartmentServiceImpl():departmentService;
    }
    private static DepartmentRepository getDepartmentRepository(){
        return departmentRepository==null?new DepartmentRepositoryImpl():departmentRepository;
    }
    private static EmployeeService getEmployeeService(){
        return employeeService==null?new EmployeeServiceimpl():employeeService;
    }
    private static EmployeeRepository getEmployeeRepository(){
        return employeeRepository==null?new EmployeeRepositoryImpl():employeeRepository;
    }



}
