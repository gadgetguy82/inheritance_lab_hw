import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
  Director director;

  @Before
  public void setUp() {
    director = new Director("Kevin", "IW384505Q", 150000.00, "Finance", 1000000.00);
  }

  @Test
  public void hasName() {
    assertEquals("Kevin", director.getName());
  }

  @Test
  public void hasNINumber() {
    assertEquals("IW384505Q", director.getNINumber());
  }

  @Test
  public void hasSalary() {
    assertEquals(150000.00, director.getSalary(), 0.01);
  }

  @Test
  public void canIncreaseSalary() {
    director.raiseSalary(1000.00);
    assertEquals(151000.00, director.getSalary(), 0.01);
  }

  @Test
  public void canGetPayBonus() {
    assertEquals(3000.00, director.payBonus(), 0.01);
  }

  @Test
  public void hasDeptName() {
    assertEquals("Finance", director.getDeptName());
  }

  @Test
  public void hasBudget() {
    assertEquals(1000000.00, director.getBudget(), 0.01);
  }
}
