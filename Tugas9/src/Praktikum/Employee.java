package Praktikum;

class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Koperasi NV. Meneer \n").append("Employee Details - Registration Number: ").append(registrationNumber)
                .append(", Name: ").append(name)
                .append(", Salary Per Month: ").append(salaryPerMonth)
                .append(", Total Salary After Deduction: ").append(getPayableAmount()).append("\n");
        sb.append("Invoices Details:\n");
        for (Invoice invoice : invoices) {
            sb.append(invoice.toString()).append("\n");
        }
        return sb.toString();
    }
}
