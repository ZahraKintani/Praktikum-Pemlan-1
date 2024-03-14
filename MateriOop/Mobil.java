package MateriOop;

public class Mobil {
    public String nama;
    public String platNomor;
    public int tahun;
    public String transmisi;
    public String merk;

    // harus ada setter getter kalau field nya private!!!
    // public void setMerk(String merk) { // UNTUK MEMBERIKAN VALUE
    //     this.merk = merk;
    // }
    // public String getMerk() { // UNTUK MENGAMBIL NILAI
    //     return merk;
    // }

    // constructor. instansiasi sebuah objek
    public Mobil(){
        this.merk = "pajero";
        this.platNomor = "N 1010 OY";
        this.tahun = 2020;
    }

    // bisa juga langsung di assign atribut
    // public Mobil(String merk, String platNomor, int tahun){ //harus urut yeah
    //     this.merk = merk;
    //     this.platNomor = platNomor;
    //     this.tahun = tahun;
    // }

    //constructor overloading. sama tapi parameternya beda
    // public Mobil(String merk, String platNomor){
    //     this.merk = merk;
    //     this.platNomor = platNomor;
    // }

    public void maju(){
        System.out.printf("Mobil %s dengan plat nomor %s bergerak maju\n", merk, platNomor);
    }
    
    public void mundur(){
        System.out.printf("Mobil %s dengan plat nomor %s bergerak mundur\n", merk, platNomor);
    }

    // method (behaviour)
    public void Maju(){
        System.out.printf("%s bergerak maju", this.merk);
    }

    //method override, to String
    public String toString(){
        return String.format("\nNama\t\t: %s\nPlatNomor\t: %s\nTahun\t\t: %d\nTransmisi\t: %s", merk, platNomor, tahun, transmisi);
    }
}
