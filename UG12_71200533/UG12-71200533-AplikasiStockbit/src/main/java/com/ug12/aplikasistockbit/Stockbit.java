package com.ug12.aplikasistockbit;

import java.util.ArrayList;

public class Stockbit {
    public Investor investor;
    public ArrayList<Investor> arrInvestor;


    public Stockbit() {
        arrInvestor =  new ArrayList<Investor>();
    }
    public void register(Investor investor){
        arrInvestor.add(investor);
        System.out.println("Resgistrasi akun anda " + investor.getNama() + " sukses!");
    }

    public void login(String username, String password) {
        boolean login = false;
        for (Investor i : arrInvestor) {
            if (i.getUsername().equals(username) && i.getPassword().equals(password)) {
                this.investor = i;
                System.out.println("Login berhasil");
                login = true;
                break;
            } else {
                System.out.println("Username/password anda salah!!");
                break;
            }
        }
    }
    public void orderBeli(Saham saham, int lot){
            investor.getPortfolio().put(saham, lot);
        }

    public void printPortfolio(){
        System.out.println("=====PORTOFOLIO CLIENT=====");
        System.out.println("Client : " + investor.getNama());
        System.out.println("No.\tKode saham\tjumlah Lot\tHarga\tSub total");
        int x = 1;
        int total = 0;
        for (Saham key : investor.getPortfolio().keySet()){
            int subtotal = (int) (investor.getPortfolio().get(key)*key.getHarga()*100);
            total = total + subtotal;
            System.out.println(x + "\t" + key.getKode() + "\t\t" + investor.getPortfolio().get(key) + "x\t\t" + key.getHarga() + "\t" + subtotal);
            x++;
        }
        System.out.println("Total invest: Rp" + total);
    }
    public void orderJual(Saham saham, int lot){
        if (lot == investor.getPortfolio().get(saham)) {
            investor.getPortfolio().remove(saham);
            System.out.println("Order Jual " + saham.getKode() + " sebanyak " + lot + " lot sukses!");
        } else if (lot < investor.getPortfolio().get(saham)) {
            investor.getPortfolio().put(saham, investor.getPortfolio().get(saham) - lot);
            System.out.println("Order Jual " + saham.getKode() + " sebanyak " + lot + " lot sukses!");
        } else {
            System.out.println("Order Jual Gagal!");
        }
    }
}

