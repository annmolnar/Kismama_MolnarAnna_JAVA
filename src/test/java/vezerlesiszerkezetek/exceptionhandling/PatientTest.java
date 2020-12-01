package vezerlesiszerkezetek.exceptionhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {
    @Test
    public void patientTest(){
        Patient patient = new Patient("Anna", "092259324", 1991);
        SsnValidator ssnValidator = new SsnValidator();

        assertEquals("Anna", patient.getName());
        assertEquals(true, ssnValidator.isValidSsn(patient.getSocialSecurityNumber()));

    }
}
