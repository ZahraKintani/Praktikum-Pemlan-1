public class Manusia {
    private String nama;
    private boolean jenisKelamin; 
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        if (isMenikah()) {
            if (true == isJenisKelamin()) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return "Nama: " + getNama() + "\nNIK: " + getNik() + "\nJenis Kelamin: " + (isJenisKelamin() ? "Laki-laki" : "Perempuan") + "\nPendapatan: $" + getPendapatan();
    }
    
}