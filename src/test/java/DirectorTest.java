import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Michael Anderson", "JH557885B", 25000.00, "Awesome", 5000000.50);
    }

    @Test
    public void employeeHasName() {
        assertEquals("Michael Anderson", director.getName());
    }

    @Test
    public void employeeHasnINumber() {
        assertEquals("JH557885B", director.getnINumber());
    }

    @Test
    public void employeeHasSalary() {
        assertEquals(25000.00, director.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000.00);
        assertEquals(26000.00, director.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(500, director.payBonus(), 0.01);
    }

    @Test
    public void managerHasDeptName() {
        assertEquals("Awesome", director.getDeptName());
    }

    @Test
    public void directorHasBudget() {
        assertEquals(5000000.50, director.getBudget(), 0.01);
    }
}
