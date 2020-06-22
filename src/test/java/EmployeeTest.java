import org.junit.Test;
import staff.Employee;
import staff.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private Employee employee;

    @Test
    public void canRaiseSalary() {
        employee = new Manager("Colin", "123ABC", 10000, "CodeClan");
        assertEquals(0.10, employee.raiseSalary());
    }


}
