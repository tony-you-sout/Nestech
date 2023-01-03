package beans;


import repositories.EmployeeRepository;
import repositories.EmployeeRepositoryImpl;
import sevices.EmployeeService;
import sevices.EmployeeServiceimpl;

public class IocContainer {
    private static EmployeeService employeeService=null;
    private static EmployeeRepository employeeRepository=null;
    public static Object getBean(String beanName){
        switch (beanName){
            case "employeeService":
                return getEmployeeService();
            case "employeeRepository":
                return getEmployeeRepository();
            default:
                return null;
        }

    }

    private static EmployeeRepository getEmployeeRepository() {
        return employeeRepository==null?new EmployeeRepositoryImpl():employeeRepository;
    }

    public static EmployeeService getEmployeeService(){
        return employeeService==null?new EmployeeServiceimpl():employeeService;
    }
}
