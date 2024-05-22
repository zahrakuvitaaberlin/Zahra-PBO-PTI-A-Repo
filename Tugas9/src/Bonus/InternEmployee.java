package Bonus;


public class InternEmployee extends Employee implements Contract {
    private int duration;
    
    public InternEmployee(int id, String name, int duration) {
        super(id, name);
        this.duration = duration;
    }
    
    @Override
    void work() {
       
    }
    
    @Override
    public void attendTrainingSession() {

    }
    
    @Override
    public void trackContractDuration() {

    }
    
    public int getDuration() {
        return duration;
    }
    
    public double calculateSalary() {
        
        return 0.0; 
    }
}

