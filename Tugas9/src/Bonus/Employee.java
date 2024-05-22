package Bonus;


public abstract class Employee {
    private int id;
    private String name;
    
    public Employee() {
      
    }
    
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    abstract void work();
    
    public static void hire() {
   
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}

