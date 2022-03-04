package com.ug4.soal1;
import java.time.LocalDate;

public class Pohon {
    private int daun;
    private int akar;
    private int dahan;
    private int umur;
    private Buah buah;
    private Musim musim;
    private LocalDate tanggalMusim;

    public Pohon(int daun, int akar, int dahan, int umur) {
        this.setDaun(daun);
        this.setAkar(akar);
        this.setDahan(dahan);
        this.setUmur(umur);
    }

    public int getDaun() {
        return this.daun;
    }

    private void setDaun(int daun) {
        this.daun = daun;
    }

    public int getAkar() {
        return this.akar;
    }

    private void setAkar(int akar) {
        this.akar = akar;
    }

    public int getDahan() {
        return this.dahan;
    }

    private void setDahan(int dahan) {
        this.dahan = dahan;
    }

    public static int getMasahidup() {
        return 10;
    }

    public int getUmur() {
        return this.umur;
    }

    private void setUmur(int umur) {
        this.umur = umur;
    }

    public Buah getBuah() {
        return this.buah;
    }

    private void setBuah(Buah buah) {
        this.buah = buah;
    }

    public Musim getMusim() {
        return this.musim;
    }

    public void setMusim(Musim musim) {
        this.musim = musim;
        String nama;
        byte masaPanen;
        byte lamaBertahan;
        byte rentangBerbuah;
        int jumlahBuah;
        if (this.musim.getName().equalsIgnoreCase("kemarau")) {
            nama = "Apel";
            masaPanen = 1;
            lamaBertahan = 7;
            rentangBerbuah = 5;
            jumlahBuah = musim.getHari() / masaPanen * rentangBerbuah;
            this.setBuah(new Buah(nama, jumlahBuah, masaPanen, lamaBertahan));
            this.setTanggalMusim(LocalDate.now());
        } else if (this.musim.getName().equalsIgnoreCase("penghujan")) {
            nama = "Pisang";
            masaPanen = 10;
            lamaBertahan = 5;
            rentangBerbuah = 10;
            jumlahBuah = musim.getHari() / masaPanen * rentangBerbuah;
            this.setBuah(new Buah(nama, jumlahBuah, masaPanen, lamaBertahan));
            this.setTanggalMusim(LocalDate.now());
        } else if (this.musim.getName().equalsIgnoreCase("dingin")) {
            nama = "Jeruk";
            masaPanen = 20;
            lamaBertahan = 13;
            rentangBerbuah = 20;
            jumlahBuah = this.musim.getHari() / masaPanen * rentangBerbuah;
            this.setBuah(new Buah(nama, jumlahBuah, masaPanen, lamaBertahan));
            this.setTanggalMusim(LocalDate.now());
        } else {
            System.out.println("Musim yang kamu masukan tidak benar");
        }

    }

    public LocalDate getTanggalMusim() {
        return this.tanggalMusim;
    }

    public void setTanggalMusim(LocalDate tanggalMusim) {
        this.tanggalMusim = tanggalMusim;
    }
}
