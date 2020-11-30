package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyTest {
    @Test
    public void testAddEmployee(){
        Company company = new Company();

        company.addEmployee(new Employee("Jane", 2000));
        company.addEmployee(new Employee("Bill", 2001));

        assertEquals(2, company.getEmployees().size());
        assertEquals("Jane", company.getEmployees().get(0).getName());
    }

    @Test
    public void findEmployeeByNameTest(){
        Company company = new Company();

        company.addEmployee(new Employee("Jane", 2000));
        company.addEmployee(new Employee("Bill", 2001));

        Employee result = company.findEmployeeByName("Bill");
        assertEquals("Bill", result.getName());
        assertEquals(2001, result.getYearOfBirth());
    }
}
