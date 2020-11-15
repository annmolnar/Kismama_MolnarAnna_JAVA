package osztalyokEsObjektumok.methods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Amma",2001, 100000);
        employee.raiseSalary(20000);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getHiringYear());
    }


}
