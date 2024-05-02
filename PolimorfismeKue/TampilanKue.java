package PolimorfismeKue;

public class TampilanKue{
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];

        kueArray[0] = new KuePesanan("Brownies", 9000, 0.5);
        kueArray[1] = new KueJadi("Kue Lapis", 15000, 3);
        kueArray[2] = new KuePesanan("Kue Kering", 5000, 0.2);
        kueArray[3] = new KueJadi("Kue Bolu", 20000, 2);
        kueArray[4] = new KuePesanan("Kue Coklat", 30000, 0.5);
        kueArray[5] = new KueJadi("Kue Keju", 25000, 4);
        kueArray[6] = new KuePesanan("Kue Kacang", 15000, 0.2);
        kueArray[7] = new KueJadi("Kue Pandan", 50000, 5);
        kueArray[8] = new KuePesanan("Kue Nastar", 10000, 0.5);
        kueArray[9] = new KueJadi("Kue Kastengel", 15000, 6);
        kueArray[10] = new KuePesanan("Kue Matcha", 8000, 0.2);
        kueArray[11] = new KueJadi("Kue Red Velvet", 40000, 7);
        kueArray[12] = new KuePesanan("Kue Stroberi", 35000, 0.5);
        kueArray[13] = new KueJadi("Kue Coklat Keju", 45000, 8);
        kueArray[14] = new KuePesanan("Kue Meses", 8000, 0.2);
        kueArray[15] = new KueJadi("Kue Kismis", 5000, 9);
        kueArray[16] = new KuePesanan("Kue ChocoPandan", 10000, 0.5);
        kueArray[17] = new KueJadi("Kue Tiramisu", 55000, 10);
        kueArray[18] = new KuePesanan("Kue Oreo", 5000, 0.2);
        kueArray[19] = new KueJadi("Kue Keju Tiramisu", 55000, 11);

        System.out.println("---------- Daftar Kue ----------");
        System.out.println();
        for (Kue kue : kueArray) {
            System.out.println("Nama Kue: " + kue.getNama());
            System.out.println("Harga Kue: Rp " + kue.getHarga());
            System.out.println("Jenis Kue: " + kue.getClass().getSimpleName());
            System.out.println();
        }

        double totalHarga = 0;
        for (Kue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("=====================================");
        System.out.println("Total Harga Semua Kue: Rp " + totalHarga);

        double totalHargaPesanan = 0;
        double totalBerat = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println();
        System.out.println("Total Harga Kue Pesanan: Rp " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBerat + " gram");

        double totalHargaJadi = 0;
        double totalJumlah = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println();
        System.out.println("Total Harga Kue Jadi: Rp " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlah + " buah");

        double hargaTerbesar = 0;
        Kue kueTerbesar = null;
        for (Kue kue : kueArray) {
            if (kue.getHarga() > hargaTerbesar) {
                hargaTerbesar = kue.getHarga();
                kueTerbesar = kue;
            }
        }
        System.out.println();
        System.out.println("Kue dengan Harga Terbesar: ");
        System.out.println("    Berdasarkan Jenis : " + kueTerbesar.getClass().getSimpleName());
        System.out.println("    Berdasarkan Nama Kue : " + kueTerbesar.getNama());
    }
}