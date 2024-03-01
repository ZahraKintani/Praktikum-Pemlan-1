package MateriOop;

class Class {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();

        mobil1.merk = "Range Rover";
        mobil1.platNomor = "N 7412 AH";
        mobil1.tahun = 2020;
        mobil1.transmisi = "Automatic";

        mobil1.maju();
        mobil1.mundur();
        
        System.out.println();

    }
}
