package MateriOop;

public class Mobil {
    public String nama;
    public String platNomor;
    public int tahun;
    public String transmisi;
    public String merk;

    // harus ada setter getter kalau field nya private!!!
    // public void setMerk(String merk) { // untuk memberikan value
    //     this.merk = merk;
    // }
    // public String getMerk() { // untuk mengambil nilai 
    //     return merk;
    // }

    public void maju(){
        System.out.printf("Mobil %s dengan plat nomor %s bergerak maju\n", merk, platNomor);
    }
    
    public void mundur(){
        System.out.printf("Mobil %s dengan plat nomor %s bergerak mundur\n", merk, platNomor);
    }

}
