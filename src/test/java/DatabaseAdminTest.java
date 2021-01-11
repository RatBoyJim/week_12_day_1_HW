import org.junit.Before;
import org.junit.Test;

import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Michael Anderson", "JH557885B", 25000.00);
    }

    @Test
    public void employeeHasName() {
        assertEquals("Michael Anderson", databaseAdmin.getName());
    }

    @Test
    public void employeeHasnINumber() {
        assertEquals("JH557885B", databaseAdmin.getnINumber());
    }

    @Test
    public void employeeHasSalary() {
        assertEquals(25000.00, databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(26000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(250, databaseAdmin.payBonus(), 0.01);
    }

}
