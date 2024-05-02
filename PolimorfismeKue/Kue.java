package PolimorfismeKue;

public abstract class Kue {
    private String nama;
    private double harga;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public abstract double hitungHarga();

    public String toString() {
        return "Nama Kue: " + nama + "\nHarga Kue: " + harga;
    }
}
