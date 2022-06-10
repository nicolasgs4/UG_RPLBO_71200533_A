package com.ug14.rumahsakit;

public class Suster {
    private int idSuster;
    private String nama;

    public Suster(String nama){
        this.nama = nama;
    }

    public void screening(Pasien pasien, Jadwal jadwal){
        boolean True = false;
        if(jadwal.getStatusDaftar() == True){
            jadwal.setStatusScreening(true);
            System.out.println("=====Proses Screening Berhasil!=====");

        }else {
            System.out.println("=====Proses Screening Gagal!=====");
        }
    }
}
