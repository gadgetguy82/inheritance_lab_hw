import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
  Developer developer;

  @Before
  public void setUp() {
    developer = new Developer("Jason", "DF348572J", 100500.30);
  }

  @Test
  public void hasName() {
    assertEquals("Jason", developer.getName());
  }

  @Test
  public void hasNINumber() {
    assertEquals("DF348572J", developer.getNINumber());
  }

  @Test
  public void hasSalary() {
    assertEquals(100500.30, developer.getSalary(), 0.01);
  }

  @Test
  public void canIncreaseSalary() {
    developer.raiseSalary(50.32);
    assertEquals(100550.62, developer.getSalary(), 0.01);
  }

  @Test
  public void canGetPayBonus() {
    assertEquals(1005.00, developer.payBonus(), 0.01);
  }
}
