package com.ug7.game;


public class App {
    public static void main(String[] args) {
        Player P_71190480 = new Player("bantolostd", "prakrplboasik");
        Player P_71200533 = new Player("Nicolas Gabrian", "Password Kamu");
        Ninja A_71190480 = new Ninja(P_71190480);
        Penyihir A_71200533 = new Penyihir(P_71200533);
        System.out.println("\n========== AWAL ==========");
        A_71190480.getInfo();
        A_71200533.getInfo();
        System.out.println("\n========== NORMAL ATTACK #1 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.normalAttack(A_71200533);
        System.out.println("\n========== BELI SENJATA #1 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.buyWeapon(2);
        System.out.print("[" + A_71200533.getPlayer().getUsername() + "] - ");
        A_71200533.buyWeapon(4);
        System.out.println("\n========== BELI SENJATA #2 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.buyWeapon(1);
        System.out.print("[" + A_71200533.getPlayer().getUsername() + "] - ");
        A_71200533.buyWeapon(3);
        System.out.println("\n========== NORMAL ATTACK #2 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.normalAttack(A_71200533);
        System.out.print("[" + A_71200533.getPlayer().getUsername() + "] - ");
        A_71200533.normalAttack(A_71190480);
        System.out.println("\n========== ABILITY ATTACK #1 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.abilityAttack(A_71200533);
        System.out.print("[" + A_71200533.getPlayer().getUsername() + "] - ");
        A_71200533.abilityAttack(A_71190480);
        System.out.println("\n========== WALKING AND NORMAL ATTACK #1 ==========");
        A_71190480.walk(true);
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.normalAttack(A_71200533);
        A_71200533.walk(true);
        System.out.print("[" + A_71200533.getPlayer().getUsername() + "] - ");
        A_71200533.normalAttack(A_71190480);
        System.out.println("\n========== ABILITY ATTACK #2 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.abilityAttack(A_71200533);
        System.out.print("[" + A_71200533.getPlayer().getUsername() + "] - ");
        A_71200533.abilityAttack(A_71190480);
        System.out.println("\n========== WAR #1 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.walk(false);
        System.out.print("[" + A_71200533.getPlayer().getUsername() + "] - ");
        A_71200533.walk(false);
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.normalAttack(A_71200533);
        System.out.print("[" + A_71200533.getPlayer().getUsername() + "] - ");
        A_71200533.normalAttack(A_71190480);
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.abilityAttack(A_71200533);
        System.out.println("\n========== AKHIR ==========");
        A_71190480.getInfo();
        A_71200533.getInfo();
    }
}

