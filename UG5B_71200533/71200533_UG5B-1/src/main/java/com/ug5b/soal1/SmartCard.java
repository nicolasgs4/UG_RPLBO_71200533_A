package com.ug5b.soal1;

public class SmartCard {

    private String nama;
    private long saldo;


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void topUp(Voucher vch) {
        if (vch.getKode() == "VC"){
            System.out.println("Kode Voicher: VC || Top up gagal! Kode voucher tidak valid");
        }
        else {
            this.saldo += Long.parseLong(vch.getKode().substring(2));
            System.out.println("Kode Voucher:" + vch.getKode() + "|| Top up sukses!");
        }
    }
}
