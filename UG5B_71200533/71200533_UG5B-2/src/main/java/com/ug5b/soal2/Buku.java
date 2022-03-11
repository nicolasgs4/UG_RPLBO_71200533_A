package com.ug5b.soal2;

public class Buku {

    private String kode;
    private static int nextNum;
    private String judul;
    private String penulis;
    private long harga;
    private int stok;

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
    public Buku(String argJudul,String argPenulis,long argHarga,int argStok){
        judul = argJudul;
        penulis = argPenulis;
        harga = argHarga;
        nextNum++;
        stok = argStok;
        kode = "NV24510" + nextNum;
    }
}
