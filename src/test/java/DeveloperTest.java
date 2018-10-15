import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Mario", 4321, 150.00);
    }

    @Test
    public void hasSalary() {
        assertEquals(150.00, developer.getSalary(),0.1);
    }

    @Test
    public void canGetRaise() {
        developer.raiseSalary(50.00);
        assertEquals(200.00, developer.getSalary(),0.1);
    }

    @Test
    public void getBonusPay() {
        developer.raiseSalary(50.00);
        assertEquals(2.00, developer.payBonus(),0.1);
    }

    @Test
    public void cannotGetNegativeRaise() {
        developer.raiseSalary(-100.00);
        assertEquals(150.00, developer.getSalary(),0.1);
    }
}
