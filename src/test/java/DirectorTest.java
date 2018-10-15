import Management.Director;
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("German", 343434, 400.00, "Management", 1000.00);
    }

    @Test
    public void hasBudget() {
        assertEquals(1000.00, director.getBudget(),0.1);
    }

    @Test
    public void canGetRaise() {
        director.raiseSalary(100.00);
        assertEquals(500.00, director.getSalary(),0.1);
    }

    @Test
    public void canChangeName() {
        director.setName("Marcos");
        assertEquals("Marcos", director.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        director.setName(null);
        assertEquals("German", director.getName());
    }

    @Test
    public void payBonusIs2Percent() {
        assertEquals(8.00, director.payBonus(),0.1);
    }
}
