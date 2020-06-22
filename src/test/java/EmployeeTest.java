import org.junit.Test;
import staff.Employee;
import staff.Manager;
import staff.techStaff.DatabaseAdmin;
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

    @Test
    public void canGetDeveloperSalary() {
        employee = new Developer("Eugene", "125ABC", 14000);
        assertEquals(14000, employee.getSalary());
    }

    @Test
    public void canGetDatabaseAdminName() {
        employee = new DatabaseAdmin("Hannah", "123ABC", 12000);
        assertEquals("Hannah", employee.getName());
    }

    @Test
    public void canGetDatabaseNINumber() {
        employee = new DatabaseAdmin("Eugene", "126ABC", 12000);
        assertEquals("126ABC", employee.getNINumber());
    }

    @Test
    public void canGetDatabaseSalary() {
        employee = new DatabaseAdmin("Eugene", "125ABC", 16000);
        assertEquals(16000, employee.getSalary());
    }


}
