package management;

public class Director extends Manager {
  private double budget;

  public Director(String name, String niNumber, double salary, String deptName, double budget) {
    super(name, niNumber, salary, deptName);
    this.budget = budget;
  }

  public double getBudget() {
    return this.budget;
  }

  public double payBonus() {
    return Math.round(getSalary() * 0.02 * 100) / 100;
  }
}
