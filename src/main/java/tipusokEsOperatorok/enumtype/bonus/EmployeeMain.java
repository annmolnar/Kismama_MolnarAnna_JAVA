package tipusokEsOperatorok.enumtype.bonus;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee employee = new Employee("Anna", 120000, Position.ASSISTANT);
        for(Employee emp: employees){
            if(emp.getPosition()==Position.BOSS){
                System.out.println("Bonus 100000");
            }else if (emp.getPosition()== Position.ASSISTANT){
                System.out.println("Bonus 50000");
            }
        }
    }
}
