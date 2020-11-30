package introjunit;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee findEmployeeByName(String name){
        for(Employee employee: employees){
            if(employee.getName().equals(name)){
                return employee;
            }
        }
        return null;
    }

}
