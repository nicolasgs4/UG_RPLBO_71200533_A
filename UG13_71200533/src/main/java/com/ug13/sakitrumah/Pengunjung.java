package com.ug13.sakitrumah;

import java.io.Serializable;

public class Pengunjung implements Serializable {
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit = 4;
    private Boolean status = false;

    public Pengunjung(String nama, int usia, String alamat, String penyakit) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = penyakit;
    }

    public Pengunjung(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

    public boolean getStatus() {
        return status;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}

