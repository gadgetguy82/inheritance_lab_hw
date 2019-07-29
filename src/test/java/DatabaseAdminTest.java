import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
  DatabaseAdmin databaseAdmin;

  @Before
  public void setUp() {
    databaseAdmin = new DatabaseAdmin("Liam", "JH383658L", 60000.00);
  }

  @Test
  public void hasName() {
    assertEquals("Liam", databaseAdmin.getName());
  }

  @Test
  public void hasNINumber() {
    assertEquals("JH383658L", databaseAdmin.getNINumber());
  }

  @Test
  public void hasSalary() {
    assertEquals(60000.00, databaseAdmin.getSalary(), 0.01);
  }

  @Test
  public void canIncreaseSalary() {
    databaseAdmin.raiseSalary(100.50);
    assertEquals(60100.50, databaseAdmin.getSalary(), 0.01);
  }

  @Test
  public void canGetPayBonus() {
    assertEquals(600.00, databaseAdmin.payBonus(), 0.01);
  }
}
