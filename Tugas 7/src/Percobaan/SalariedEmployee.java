package Percobaan;

// import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double weeklySalary; //gaji/minggu
    public SalariedEmployee(String name, String noKTP, double salary) {
    super(name, noKTP);
    

    setWeeklySalary(salary);
    }
    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public double earnings() {
        return getWeeklySalary();
    }
    public String toString() {
        return String.format("Salaried employee: " + super.toString() + "\nweekly salary:" + getWeeklySalary());
    }


    // NOMOR 4
    //  private double monthlySalary; // gaji/bulan

    // public SalariedEmployee(String name, String noKTP, double salary, LocalDate birthDate) {
    //     super(name, noKTP, birthDate);
    //     setMonthlySalary(salary);
    // }

    // public void setMonthlySalary(double salary) {
    //     monthlySalary = salary;
    // }

    // public double getMonthlySalary() {
    //     return monthlySalary;
    // }

    // @Override
    // public double earnings() {
    //     double earnings = getMonthlySalary();
    //     LocalDate today = LocalDate.now();
    //     if (getBirthDate().getMonth() == today.getMonth() && getBirthDate().getDayOfMonth() == today.getDayOfMonth()) {
    //         earnings += 100000; // Menambah bonus jika hari ulang tahun
    //     }
    //     return earnings;
    // }

    // @Override
    // public String toString() {
    //     return String.format("Salaried employee: %s\nmonthly salary: $%.2f", super.toString(), getMonthlySalary());
    // }
}
   
