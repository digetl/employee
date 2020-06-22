import org.junit.Before;
import org.junit.Test;
import staff.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Cameron", "723BHIO", 75000, "Cyber Security");
    }

    @Test
    public void managerHasName() {
        assertEquals("Cameron", manager.getName());
    }

    @Test
    public void managerHasNINumber() {
        assertEquals("723BHIO", manager.getNINUmber());
    }
}
