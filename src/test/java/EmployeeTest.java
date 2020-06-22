import org.junit.Test;
import staff.Employee;
import staff.Manager;
import staff.techStaff.Developer;

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

    @Test
    public void canGetDeveloperName() {
    employee = new Developer("Eugene", "123ABC", 12000);
    assertEquals("Eugene", employee.getName());
    }

    @Test
    public void canGetDeveloperNINumber() {
        employee = new Developer("Eugene", "125ABC", 12000);
        assertEquals("125ABC", employee.getNINumber());

    }


}
