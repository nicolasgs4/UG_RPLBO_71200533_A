package com.ug13.sakitrumah;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Pendaftaran {
    private String nama;

    public Pendaftaran(String nama) {
        this.nama = nama;
    }

    public Pengunjung registrasi() throws IOException {
        Scanner nama = new Scanner(System.in);
        String namaPengunjung;
        System.out.print("Masukkan nama anda : ");
        namaPengunjung = nama.nextLine();

        Scanner usia = new Scanner(System.in);
        int usiaPengunjung;
        System.out.print("Masukkan usia anda : ");
        usiaPengunjung = usia.nextInt();

        Scanner alamat = new Scanner(System.in);
        String alamatPengunjung;
        System.out.print("Masukkan alamat anda : ");
        alamatPengunjung = alamat.nextLine();

        Scanner sakit = new Scanner(System.in);
        String penyakitPengunjung;
        System.out.print("Masukkan penyakit anda : ");
        penyakitPengunjung = sakit.nextLine();
        Pengunjung pengunjung = new Pengunjung (namaPengunjung,usiaPengunjung,alamatPengunjung,penyakitPengunjung);
        System.out.println("==========Proses Registrasi Anda Berhasil!==========");
        return pengunjung;

    }
    public void mengaturJadwal(Pengunjung pengunjung, Pemeriksa pemeriksa, Jadwal jadwal) {
        if (!pengunjung.getStatus()){
            jadwal.setPengunjung(pengunjung);
            jadwal.setPemeriksa(pemeriksa);
            jadwal.setStatusDaftar(true);
            System.out.println("================Proses Pengaturan Jadwal Berhasil================");
        } else {
            System.out.println("================Pasien tidak sakit================");
        }
    }
}
