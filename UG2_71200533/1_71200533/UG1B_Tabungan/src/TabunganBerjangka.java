public class TabunganBerjangka {
    System.out.println("Pilihan :")
    int Penyetoran = 1;
    int Penarikan = 2;
    int LihatSaldo = 3;

    int K_71200533 = 0;
    int I_71200533 = 0;

    {
        Scanner inp = new Scanner(System.in);
        int pilihanuser = inp.nextInt("Masukkan pilihan anda : ");
        if (pilihanuser == 1) {
            System.out.println("Processing Penyetoran");
            System.out.println(K_71200533 + 200000 + " di setor sebanyak 200.000 ke tabungan K_71200533");
            System.out.println(I_71200533 + 1000000 + " di setor sebanyak 1.000.000 ke tabungan I_71200533");
        } else if (pilihanuser == 2) {
            System.out.println("Processing Penarikan");
            System.out.println(K_71200533 - 50000 + " ditarik uang sebanyak 50000 dari tabungan K_71200533");
        } else if (pilihanuser == 3) {
            System.out.println("Processing Check Saldo");
            System.out.println("Jumlah tanbungan K_71200533 adalah : " + K_71200533);
            System.out.println("Jumlah tanbungan I_71200533 adalah : " + I_71200533);
        }
    }
}
}   if (pilihanuser == 1) {
        String K_71200533;
        double saldo = 200000;

    String getK_71200533() { return K_71200533; }

    void getSaldo() {
        System.out.println(saldo);
    }

    void penarikan(double jumlah){
        System.out.println("-----Tabungan Berjangka-----");
        System.out.println("Belum jatuh tempo");
    }

    void penyetoran(double jumlah) {
        if (jumlah > 0)  saldo = saldo + jumlah;
        System.out.println("-----Tabungan Berjangka-----");
        System.out.println("Penyetoran Rp." + jumlah);
    }
}
