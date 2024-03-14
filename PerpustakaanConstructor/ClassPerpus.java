package PerpustakaanConstructor;

import java.util.Scanner;

public class ClassPerpus {
    private String teknologi[][];
    private String filsafat[][];
    private String sejarah[][];
    private String agama[][];
    private String psikologi[][];
    private String politik[][];
    private String fiksi[][];

    public ClassPerpus (String [][] teknologi, String [][] filsafat, String [][] sejarah, String [][] agama, String [][] psikologi, String [][] politik, String [][] fiksi){
        this.teknologi = teknologi;
        this.filsafat = filsafat;
        this.sejarah = sejarah;
        this.agama = agama;
        this.psikologi = psikologi;
        this.politik = politik;
        this.fiksi = fiksi;
    }

    public void ListBuku(String[][] kategori, String kategoriNama) {
        System.out.println("Buku dalam kategori ini:");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". Judul: " + kategori[i][0]);
            System.out.println("   Penulis: " + kategori[i][1]);
            System.out.println("   Jumlah Halaman: " + kategori[i][2]);
            System.out.println("   Tahun Terbit: " + kategori[i][3]);
            System.out.println("   Penerbit: " + kategori[i][4]);
            System.out.println("   Sinopsis: " + kategori[i][5]);
            int kataSinopsis = HitungSinopsis(kategori[i][5]);
            System.out.println("   Jumlah kata pada sinopsis buku ini adalah: " + kataSinopsis);
            System.out.println();
        }
    }

    public int HitungSinopsis (String sinopsis){
        String [] kata = sinopsis.split("\\s+");
        return kata.length;
    }

    public void OutputListBuku(String kategoriNama){
        ListBuku(teknologi, "Teknologi");
        ListBuku(filsafat, "Filsafat");
        ListBuku(sejarah, "Sejarah");
        ListBuku(agama, "Agama");
        ListBuku(psikologi, "Psikologi");
        ListBuku(politik, "Politik");
        ListBuku(fiksi, "Fiksi");
    }

    public void tampilkanTotalBuku() {
        int total = teknologi.length + filsafat.length + sejarah.length + agama.length + psikologi.length + politik.length + fiksi.length;
        System.out.println("Total buku yang tersedia: " + total);
    }

    public void pilihBuku(int pilih) {
        
        do {
            Scanner scn = new Scanner(System.in);
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
            pilih = scn.nextInt();
        
            switch (pilih) {
                    case 1:
                        ListBuku(teknologi, "Teknologi");
                        System.out.println();
                        break;
                    case 2:
                        ListBuku(filsafat, "Filsafat");
                        System.out.println();
                        break;
                    case 3:
                        ListBuku(sejarah, "Sejarah");
                        System.out.println();
                        break;
                    case 4:
                        ListBuku(agama, "Agama");
                        System.out.println();
                        break;
                    case 5:
                        ListBuku(psikologi, "Psikologi");
                        System.out.println();
                        break;
                    case 6:
                        ListBuku(politik, "Politik");
                        System.out.println();
                        break;
                    case 7:
                        ListBuku(fiksi, "Fiksi");
                        System.out.println();
                        break;
                    case 8:
                        tampilkanTotalBuku();
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
        } while (pilih != 9); 
    }
}
