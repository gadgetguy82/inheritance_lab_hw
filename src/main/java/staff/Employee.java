package staff;

public class Employee {
  private String name, niNumber;
  private double salary;

  public Employee(String name, String niNumber, double salary) {
    this.name = name;
    this.niNumber = niNumber;
    this.salary = salary;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name != null) {
      this.name = name;
    }
  }

  public String getNINumber() {
    return this.niNumber;
  }

  public double getSalary() {
    return this.salary;
  }

  public void raiseSalary(double salary) {
    if (salary > 0) {
      this.salary += salary;
    }
  }

  public double payBonus() {
    return Math.round(this.salary * 0.01 * 100) / 100;
  }
}
