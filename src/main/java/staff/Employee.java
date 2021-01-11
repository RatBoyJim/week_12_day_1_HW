package staff;

public abstract class Employee {
    private String name;
    private String nINumber;
    private Double salary;

    public Employee(String name, String nINumber, Double salary){
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getnINumber() {
        return nINumber;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double increase) {
        if (increase > 0){
        this.salary += increase;}
    }

    public Double payBonus() {
        return salary / 100;
    }
}
