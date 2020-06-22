import org.junit.Test;
import staff.Employee;
import staff.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private Employee employee;

    @Test
    public void canRaiseSalary() {
        employee = new Manager("Colin", "123ABC", 10000, "CodeClan");
        assertEquals(11000, employee.raiseSalary(1.10),0.2) ;
    }

    @Test
    public void canGetBonus() {
        employee = new Manager("Colin", "123ABC", 10000, "CodeClan");
        assertEquals(100, employee.getBonus(), 0.2);
    }


}
