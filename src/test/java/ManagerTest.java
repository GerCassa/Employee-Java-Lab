import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest{

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Juan", 343434, 200.00, "Management");
    }

    @Test
    public void hasName() {
        assertEquals("Juan", manager.getName());
    }

    @Test
    public void hasNI() {
        assertEquals(343434, manager.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(200.00, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetRaise() {
        manager.raiseSalary(100.00);
        assertEquals(300.00, manager.getSalary(), 0.1);
    }

    @Test
    public void getPayBonus() {
        assertEquals(2.00, manager.payBonus(), 0.1);
    }
}
