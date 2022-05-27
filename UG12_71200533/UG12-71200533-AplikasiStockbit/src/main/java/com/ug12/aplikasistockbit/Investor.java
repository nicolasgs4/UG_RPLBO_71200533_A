package com.ug12.aplikasistockbit;

import java.util.HashMap;

public class Investor {
    private String username;
    private String password;
    private HashMap<Saham, Integer> portofolio;
    private String nama;

    public Investor(String nama, String username, String password) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.portofolio = new HashMap<Saham, Integer>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public HashMap<Saham, Integer> getPortfolio() {
        return portofolio;
    }

    public String getNama() {
        return nama;
    }
}
