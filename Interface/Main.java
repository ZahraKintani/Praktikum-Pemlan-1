package Interface;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n============ Selamat Datang =============\n");

        System.out.print("Nomor Registrasi Karyawan: ");
        int registrationNumber = input.nextInt();
        input.nextLine(); 

        System.out.print("Nama Karyawan: ");
        String name = input.nextLine();

        System.out.print("Gaji Karyawan Per Bulan: ");
        int salaryPerMonth = input.nextInt();
        input.nextLine();

        System.out.println("\n============ Koperasi Perusahaan =============\n");

        System.out.print("Total Invoice Karyawan: ");
        int numOfInvoices = input.nextInt();
        input.nextLine();

        Invoice[] invoices = new Invoice[numOfInvoices];

        for (int i = 0; i < numOfInvoices; i++) {
            System.out.println("\nInvoice ke-" + (i + 1));
            
            System.out.print("Nama Barang: ");
            String productName = input.nextLine();

            System.out.print("Jumlah: ");
            int quantity = input.nextInt();
            input.nextLine(); 

            System.out.print("Harga Barang: ");
            int pricePerItem = input.nextInt();
            input.nextLine();

            if (pricePerItem <= 0) {
                System.out.println("Harga tidak valid, masukkan harga yang benar.");
                i--;
                continue;
            }

            invoices[i] = new Invoice(productName, quantity, pricePerItem);

            if (pricePerItem < 5000) {
                System.out.println("Kategori: Murah");
            } else if (pricePerItem <= 20000) {
                System.out.println("Kategori: Sedang");
            } else {
                System.out.println("Kategori: Mahal");
            }
        }
        System.out.println("Informasi Karyawan:");
        employee.displayEmployeeInfo();
        System.out.println("\nTotal Gaji Setelah Dikurangi Belanjaan: Rp " + employee.getPayableAmount() + 
        "\nDetail Belanjaan:");
        employee.displayInvoiceDetails();
    }
}
