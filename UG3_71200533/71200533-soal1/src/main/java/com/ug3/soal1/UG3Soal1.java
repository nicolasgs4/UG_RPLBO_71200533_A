package com.ug3.soal1;
import java.text.DateFormat;
import java.time.;
import java.time.format.DateTimeFormatter;
import java.util.;

public class UG3Soal1 {
    public static void main(String[] args) {
        System.out.println("======absensi karyawan======");
        Scanner absensi = new Scanner(System.in);
        System.out.println("Masukkan nama Karyawan ; ");

        String nama_karyawan = absensi.nextLine();
        System.out.println("Berhasil absensi");
        System.out.println("Atas nama : " + nama_karyawan);
        System.out.println();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        DateTimeFormatter timeNow = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime dthrs= LocalDateTime.now();
        System.out.println("Pada tanggal : " + formatDate.format(dthrs));
        System.out.println("Pukul : " + timeNow.format(dthrs));
    }
}