package Bonus;


public class PermanentEmployee extends Employee {
    private double salary;
    private String position;
    
    public PermanentEmployee(int id, String name, double salary, String position) {
        super(id, name);
        this.salary = salary;
        this.position = position;
    }
    
    @Override
    void work() {

    }
    
    public double getSalary() {
        return salary;
    }
    
    public String getPosition() {
        return position;
    }
}

