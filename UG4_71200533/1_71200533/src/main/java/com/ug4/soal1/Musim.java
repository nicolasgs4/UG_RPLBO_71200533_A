package com.ug4.soal1;


public class Musim {
    private String name;
    private int day;

    public Musim(String name, int day) {
        this.setName(name);
        this.setDay(day);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHari() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
