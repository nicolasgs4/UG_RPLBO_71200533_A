package com.ug11.kalkulasipersentase;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String text = input.nextLine();

        String[] isi = text.split("\\s+");
        String rincian = "";
        String persen = "";
        float total = 0;

        for (String i : isi) {
            String Check = String.valueOf(i.charAt(i.length()-1));

            if (Check.equals("%")) {
                rincian = rincian + i + " + ";
                for (int j = 0; j < i.length() ; j++) {
                    char karakter = i.charAt(j);
                    if (karakter == '%'){
                        break;
                    } else if (Character.isDigit(karakter)) {
                        persen = persen + karakter;
                    } else if (String.valueOf(karakter).equals(".")) {
                        persen = persen + karakter;
                    };
                }
                if (persen != null){
                    total += Float.parseFloat(persen);
                }
                else{
                    System.out.print("Tidak boleh kosong!");
                }
                persen = "";
            }

        }
        System.out.println("Rincian perhitungan: "+ rincian.substring(0,rincian.length()-3));
        System.out.println("Total kenaikan (Dalam Persen): " + total + "%");
    }
}
