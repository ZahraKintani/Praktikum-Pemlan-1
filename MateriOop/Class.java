package MateriOop;

class Class {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Range Rover";
        mobil1.platNomor = "N 7412 AH";
        mobil1.tahun = 2020;
        mobil1.transmisi = "Automatic";
        System.out.println("Merk mobil anda: " + mobil1.merk + "\nPlat nomor: " + mobil1.platNomor + "\nKeluaran tahun: " + mobil1.tahun + "\ntransmisinya: " + mobil1.transmisi);

        mobil1.maju();
        mobil1.mundur();

        // instance method
        mobil1.Maju();

        // manggil toString
        System.out.println(mobil1.toString());

        // manggil constructor 
        // Mobil mobil1 = new Mobil("Pajero", "N 1000 OY", 2020);
        // System.out.println(mobil1.merk);
        // System.out.println(mobil1.platNomor);
        // System.out.println(mobil1.tahun);

        // Mobil mobil2 = new Mobil("Honda Jazz", "DK 5353 RA");
        // System.out.println(mobil2.merk);
        // System.out.println(mobil2.platNomor);
        
        // System.out.println();

    }
}
