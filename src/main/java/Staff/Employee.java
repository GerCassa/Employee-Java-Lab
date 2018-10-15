package Staff;

public abstract class Employee {

    private String name;
    private int ni;
    private double salary;

    public Employee(String name, int ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) this.name = name;
    }

    public int getNi() {
        return ni;
    }

    public void setNi(int ni) {
        this.ni = ni;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise) {
        if(raise > 0) this.salary = salary + raise;
    }

    public double payBonus() {
       double bonus = salary / 100;
       return bonus;
    }
}
