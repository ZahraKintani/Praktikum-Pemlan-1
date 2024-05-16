package Interface;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getPayableAmount() {
        int totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public void displayEmployeeInfo() {
        System.out.println("\nNama: " + name);
        System.out.println("Nomor Registrasi: " + registrationNumber);
        System.out.println("Gaji Bulanan: Rp " + salaryPerMonth);
    }

    public void displayInvoiceDetails() {
        System.out.println("\nDetail Belanja:");
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }
}

