package com.ug11.channelsahamukdw;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Channel {
    private String email;
    private String namaDepan;
    private String namaBelakang;
    private int totalTag;



    public void login(String l)throws EmailException{
        this.email=l;
        try {
            if (this.email.matches("(.*)@students.ukdw.ac.id") == false) {
                throw new EmailException(1);
            } else if (l.matches("[.]@(.*)")==false){
                throw new EmailException(2);
            } else {
                System.out.println("login berhasil");
            }
        } catch (EmailException e){
            System.out.println("Error: "+e.getErrorMessage());
        }
    }


    public void bagikanIde (String totalTag){
        int total = 0;
        String tag = "";
        System.out.println("Ide: " + totalTag);
        StringBuilder build = new StringBuilder();
        String[] array = totalTag.split(" ");
        for (String x : array) {
            Pattern att = Pattern.compile("^#(.+)");
            Matcher menti = att.matcher(x);
            if (menti.matches() == true) {
                build.append(tag);
                tag = ", ";
                build.append(x);
                this.totalTag += 1;
                total++;
            }
        }
        if (this.totalTag < 1) {
            System.out.println("Saham yang anda mention: -");
            System.out.println("Total saham yang anda tag: " + total);

        } else {
            System.out.println("Saham yang anda mention: " + build.toString().trim());
            System.out.println("Total saham yang anda tag: " + total);
        }
    }


    public void printInfo(){
        String[] spareemail=this.email.split("@");
        String[] splitnama= spareemail[0].split("[.]");
        this.namaDepan=splitnama[0];
        this.namaBelakang=splitnama[1];
        System.out.println("Nama depan: " + splitnama[0].toUpperCase());
        System.out.println("Nama belakang: " + splitnama[1].toUpperCase());
        System.out.println("Email: "+ email);
        System.out.println("Total tag: "+ totalTag);
    }
}



