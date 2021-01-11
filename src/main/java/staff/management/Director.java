package staff.management;

public class Director extends Manager{

    private Double budget;

    public Director(String name, String nINumber, Double salary, String deptName, Double budget) {
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return this.budget;
    }

    @Override
    public Double payBonus() {
        Double salary = getSalary();
        return (salary / 100) * 2;
    }
}
