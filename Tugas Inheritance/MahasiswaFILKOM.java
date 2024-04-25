public class MahasiswaFILKOM extends Manusia {

    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, String nama, boolean jenisKelamin, String nik, double ipk) {
        super(nama, jenisKelamin, nik, false);
        this.nim = nim;
        this.ipk = ipk;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public String getStatus() {
        String prodi = "";
        int angkatan = Integer.parseInt(getNim().substring(0, 2));
        int kodeProdi = Integer.parseInt(Character.toString(getNim().charAt(6)));

        switch (kodeProdi) {
            case 2:
                prodi = "Teknik Informatika";
                break;
            case 3:
                prodi = "Teknik Komputer";
                break;
            case 4:
                prodi = "Sistem Informasi";
                break;
            case 6:
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case 7:
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Prodi tidak dikenal";
        }

        return prodi + "," + angkatan;
    }

    public double getBeasiswa() {
        if (getIpk() >= 3 && getIpk() < 3.5) {
            return 50;
        } else if (getIpk() >= 3.5 && getIpk() <= 4) {
            return 75;
        } else {
            return 0;
        }
    }

    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }
    
    public String toString() {
        return super.toString() + "\nNIM: " + getNim() + "\nIPK: " + getIpk() + "\nStatus: " + getStatus();
    }
}