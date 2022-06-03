package com.ug13.sakitrumah;



public class Perawat {
    private String nama;

    public Perawat(String nama) {
        this.nama = nama;
    }

    public void screening(Pengunjung pengunjung, Jadwal jadwal)  {
        if (pengunjung.getPenyakit() == null){
            System.out.println("================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PENDAFTARAN================");
        } else {
            jadwal.setStatusScreening(true);
        }
    }
}

