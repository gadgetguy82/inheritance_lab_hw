import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
  Manager manager;

  @Before
  public void setUp() {
    manager = new Manager("Alan", "AB123456C", 80000.50, "Sales");
  }

  @Test
  public void hasName() {
    assertEquals("Alan", manager.getName());
  }

  @Test
  public void hasNINumber() {
    assertEquals("AB123456C", manager.getNINumber());
  }

  @Test
  public void hasSalary() {
    assertEquals(80000.50, manager.getSalary(), 0.01);
  }

  @Test
  public void canIncreaseSalary() {
    manager.raiseSalary(50.32);
    assertEquals(80050.82, manager.getSalary(), 0.01);
  }

  @Test
  public void canGetPayBonus() {
    assertEquals(800.00, manager.payBonus(), 0.01);
  }

  @Test
  public void hasDeptName() {
    assertEquals("Sales", manager.getDeptName());
  }
}
