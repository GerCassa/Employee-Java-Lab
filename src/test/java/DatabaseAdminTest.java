import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Carlos", 1234, 100.00);
    }

    @Test
    public void hasSalary() {
        assertEquals(100.00, databaseAdmin.getSalary(),0.1);
    }

    @Test
    public void raiseSalary() {
        databaseAdmin.raiseSalary(50.00);
        assertEquals(150.00, databaseAdmin.getSalary(),0.1);
    }

    @Test
    public void getBonusPay() {
        assertEquals(1.0, databaseAdmin.payBonus(),0.1);
    }
}
