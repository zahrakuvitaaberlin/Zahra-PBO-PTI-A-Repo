package Bonus;


public class Main {
    public static void main(String[] args) {

        PermanentEmployee permanentEmployee = new PermanentEmployee(1, "lala", 5000.0, "Manager");
        InternEmployee internEmployee = new InternEmployee(2, "nana", 6);
        

        permanentEmployee.work();
        System.out.println("Permanent Employee Salary: " + permanentEmployee.getSalary());
        System.out.println("Permanent Employee Position: " + permanentEmployee.getPosition());
        
        internEmployee.work();
        internEmployee.attendTrainingSession();
        internEmployee.trackContractDuration();
        System.out.println("Intern Employee Duration: " + internEmployee.getDuration());
        System.out.println("Intern Employee Salary: " + internEmployee.calculateSalary());
    }
}

