import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
  Employee employee;

  @Before
  public void setUp() {
    employee = new Manager("Alan", "AB123456C", 80000.50, "Sales");
  }

  @Test
  public void hasName() {
    assertEquals("Alan", employee.getName());
  }

  @Test
  public void hasNINumber() {
    assertEquals("AB123456C", employee.getNINumber());
  }

  @Test
  public void hasSalary() {
    assertEquals(80000.50, employee.getSalary(), 0.01);
  }

  @Test
  public void canIncreaseSalary() {
    employee.raiseSalary(50.32);
    assertEquals(80050.82, employee.getSalary(), 0.01);
  }

  @Test
  public void cannotIncreaseSalaryWithNegativeValue() {
    employee.raiseSalary(-200.00);
    assertEquals(80000.50, employee.getSalary(), 0.01);
  }

  @Test
  public void canGetPayBonus() {
    assertEquals(800.00, employee.payBonus(), 0.01);
  }

  @Test
  public void canChangeName() {
    employee.setName("Harry");
    assertEquals("Harry", employee.getName());
  }
}
