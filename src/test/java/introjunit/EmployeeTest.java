package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    @Test
    public void createEmployee(){
        Employee employee = new Employee("John", 1987);
        assertEquals("John", employee.getName());
        assertEquals(1987, employee.getYearOfBirth());
    }
}
