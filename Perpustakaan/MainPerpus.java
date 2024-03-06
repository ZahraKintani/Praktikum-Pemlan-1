package Perpustakaan;
import java.util.Scanner;

class MainPerpus {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Kelas perpus = new Kelas();
        int pilihBuku;

        do {
            System.out.println("=======[Perpustakaan]=======");
            System.out.println("Masukkan pilihan untuk melihat buku berdasarkan kategori:");
            System.out.println("1. Teknologi");
            System.out.println("2. Filsafat");
            System.out.println("3. Sejarah");
            System.out.println("4. Agama");
            System.out.println("5. Psikologi");
            System.out.println("6. Politik");
            System.out.println("7. Fiksi");
            System.out.println("8. Tampilkan total buku yang tersedia");
            System.out.println("9. Keluar dari program");

            System.out.print("Pilihan anda: ");
            pilihBuku = scn.nextInt();
            
            switch (pilihBuku) {
                case 1:
                    perpus.ListBuku(perpus.teknologi);
                    System.out.println();
                    break;
                case 2:
                    perpus.ListBuku(perpus.filsafat);
                    System.out.println();
                    break;
                case 3:
                    perpus.ListBuku(perpus.sejarah);
                    System.out.println();
                    break;
                case 4:
                    perpus.ListBuku(perpus.agama);
                    System.out.println();
                    break;
                case 5:
                    perpus.ListBuku(perpus.psikologi);
                    System.out.println();
                    break;
                case 6:
                    perpus.ListBuku(perpus.politik);
                    System.out.println();
                    break;
                case 7:
                    perpus.ListBuku(perpus.fiksi);
                    System.out.println();
                    break;
                case 8:
                    perpus.tampilkanTotalBuku();
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Terima kasih atas kunjungan Anda.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Mohon pilih sesuai dengan opsi yang diberikan. Silakan pilih lagi.");
                    System.out.println();
            }
        } while (pilihBuku != 9);         
    }
}

