package com.ug14.rumahsakit;

public class Jadwal {
    private int idPemeriksaan;
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private Boolean statusDaftar = false;
    private Boolean statusScreening = false;


    public boolean getStatusDaftar() {
        return statusDaftar;
    }

    public void setStatusScreening(boolean b) {
        this.statusScreening = statusScreening;
    }
}
