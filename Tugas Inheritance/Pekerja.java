import java.time.LocalDate;
import java.time.Period;
public class Pekerja extends Manusia {

    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    
    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        int tahunKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahunKerja <= 5) {
            return gaji * 0.05;
        } else if (tahunKerja <= 10) {
            return gaji * 0.1;
        } else {
            return gaji * 0.15;
        }
    }

    public double getTotalGaji() {
        return gaji + getBonus() + (getJumlahAnak() * 20);
    }

    public double getPendapatan() {
        return super.getPendapatan() + getTotalGaji();
    }
    
    public String toString() {
        return super.toString() + "\nTahun Masuk: " + getTahunMasuk() + "\nJumlah Anak: " + getJumlahAnak() + "\nGaji: $" + getGaji();
    }
}

