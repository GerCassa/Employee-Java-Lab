package Management;

public class Director extends Manager{

    private double budget;

    public Director(String name, int ni, double salary, String deptName, double budget) {
        super(name, ni, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double payBonus() {
        double bonus = (getSalary() / 100) * 2;
        return bonus;
    }
}
