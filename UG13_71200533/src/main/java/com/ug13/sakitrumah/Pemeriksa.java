package com.ug13.sakitrumah;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pemeriksa {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung, Jadwal jadwal) {
        if (jadwal.getStatusScreening()){
            if (pengunjung.getLevelPenyakit() == 0){
                pengunjung.setStatus(true);
            } else {
                pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit() - 1);
            }
        } else {
            System.out.println("================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PENDAFTARAN================");
        }
    }

    public void cekStatus(Pengunjung pengunjung){
        if (pengunjung.getLevelPenyakit()==0){
            System.out.println("================SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT================");
        } else {
            System.out.println("================PASIEN ANDA MASIH SAKIT================");
        }
    }
}




