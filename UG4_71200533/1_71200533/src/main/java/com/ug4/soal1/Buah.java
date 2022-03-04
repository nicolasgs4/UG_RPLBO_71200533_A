package com.ug4.soal1;

public class Buah {
    private String name;
    private int jumlah;
    private int masaPanen;
    private int lamaBertahan;

    public Buah(String name, int jumlah, int masaPanen, int lamaBertahan) {
        this.setName(name);
        this.setJumlah(jumlah);
        this.setMasaPanen(masaPanen);
        this.setLamaBertahan(lamaBertahan);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    private void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getMasaPanen() {
        return this.masaPanen;
    }

    private void setMasaPanen(int masaPanen) {
        this.masaPanen = masaPanen;
    }

    public int getLamaBertahan() {
        return this.lamaBertahan;
    }

    private void setLamaBertahan(int lamaBertahan) {
        this.lamaBertahan = lamaBertahan;
    }
}

