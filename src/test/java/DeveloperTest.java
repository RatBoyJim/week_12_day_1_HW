import org.junit.Before;
import org.junit.Test;

import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Michael Anderson", "JH557885B", 25000.00);
    }

    @Test
    public void employeeHasName() {
        assertEquals("Michael Anderson", developer.getName());
    }

    @Test
    public void employeeHasnINumber() {
        assertEquals("JH557885B", developer.getnINumber());
    }

    @Test
    public void employeeHasSalary() {
        assertEquals(25000.00, developer.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000.00);
        assertEquals(26000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(250, developer.payBonus(), 0.01);
    }

}
