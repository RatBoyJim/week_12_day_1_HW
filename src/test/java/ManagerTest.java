import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Michael Anderson", "JH557885B", 25000.00, "Awesome");
    }

    @Test
    public void employeeHasName() {
        assertEquals("Michael Anderson", manager.getName());
    }

    @Test
    public void employeeHasnINumber() {
        assertEquals("JH557885B", manager.getnINumber());
    }

    @Test
    public void employeeHasSalary() {
        assertEquals(25000.00, manager.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000.00);
        assertEquals(26000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryByNegativeAmount() {
        manager.raiseSalary(-50.00);
        assertEquals(25000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250, manager.payBonus(), 0.01);
    }

    @Test
    public void managerHasDeptName() {
        assertEquals("Awesome", manager.getDeptName());
    }

    @Test
    public void managerCanChangeEmployeeName() {
        manager.setName("Andy Anderson");
        assertEquals("Andy Anderson", manager.getName());
    }

    @Test
    public void managerCannotChangeEmployeeNameToNull() {
        manager.setName(null);
        assertEquals("Michael Anderson", manager.getName());
    }
}
