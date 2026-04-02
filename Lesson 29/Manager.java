public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary); // initialize name and salary
        this.bonus = bonus;  // initialize bonus
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnualIncome() {
        return getSalary() + bonus; // salary + bonus
    }
}
