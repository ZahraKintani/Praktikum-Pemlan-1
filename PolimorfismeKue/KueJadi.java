package PolimorfismeKue;

public class KueJadi extends Kue {
    private double jumlah;

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double hitungHarga() {
        return super.getHarga() * jumlah * 2;
    }
}
