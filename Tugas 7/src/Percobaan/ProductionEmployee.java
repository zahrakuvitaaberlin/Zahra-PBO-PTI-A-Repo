package Percobaan;

import java.time.LocalDate;
public class ProductionEmployee extends Employee {
    private double productionPerWeek; // banyaknya barang yang diproduksi per minggu
    private double wagePerItem; // upah per barang

    public ProductionEmployee(String name, String noKTP, double productionPerWeek, double wagePerItem, LocalDate birthDate) {
        super(name, noKTP);
        setProductionPerWeek(productionPerWeek);
        setWagePerItem(wagePerItem);
    }

    public void setProductionPerWeek(double productionPerWeek) {
        this.productionPerWeek = productionPerWeek;
    }

    public double getProductionPerWeek() {
        return productionPerWeek;
    }

    public void setWagePerItem(double wagePerItem) {
        this.wagePerItem = wagePerItem;
    }

    public double getWagePerItem() {
        return wagePerItem;
    }

    @Override
    public double earnings() {
        return getProductionPerWeek() * getWagePerItem();
    }

    @Override
    public String toString() {
        return String.format("Production employee: %s\nproduction per week: %.2f\nwage per item: $%.2f", super.toString(), getProductionPerWeek(), getWagePerItem());
    }
}
