package com.ug7.game;

public class Ninja extends Karakter {
    private boolean isAbilityReady;

    public Ninja(Player player) {
        super(player);
    }
    public void buyWeapon(int weapon) {
        System.out.println("Daftar senjata:\n1. Pisau\n2. Tongkat Sihir\n3. Tongkat\n4. Katana");
        System.out.println("Pilihan senjata: " + weapon);
        if (weapon != 1 && weapon != 4) {
            System.out.println("Sebagai ninja kamu hanya boleh membeli pisau/katana!");
        } else {
            super.buyWeapon(weapon);
        }
    }

    public void abilityAttack(Karakter karakter) {
        if (this.isAbilityReady) {
            int damage = karakter.getHP() / 2;
            if (!this.isWalk()) {
                damage = karakter.getHP();
            }
            System.out.println("Rasakan ini, " + karakter.getPlayer().getUsername() + "!");
            karakter.receiveDamage(damage);
            if (karakter.getHP() == 0) {
                this.getPlayer().levelUp();
            }
        } else {
            System.out.println("Ability belum aktif!");
        }
    }
    public void normalAttack(Karakter karakter) {
        if (this.getWeapon() == 0) {
            System.out.println("Maaf, " + this.getPlayer().getUsername() + "... Silakan beli senjata terlebih dahulu!");
        } else {
            if (!this.isWalk()) {
                int damage;
                switch(this.getWeapon()) {
                    case 1:
                        damage = 20;
                        break;
                    case 2:
                        damage = 60;
                        break;
                    case 3:
                        damage = 25;
                        break;
                    case 4:
                        damage = 50;
                        break;
                    default:
                        damage = 0;
                }
                damage = (int)((double)damage * 1.5D);
                karakter.receiveDamage(damage);
                if (karakter.getHP() < 50) {
                    this.isAbilityReady = true;
                }
                if (karakter.getHP() == 0) {
                    this.getPlayer().levelUp();
                }
            } else {
                super.normalAttack(karakter);
            }

        }
    }
    public void walk(boolean type) {
        if (!type) {
            System.out.println(this.getPlayer().getUsername() + " menghilang! (Lari)");
        }
        super.walk(type);
    }
    public void getInfo() {
        System.out.println("[Karakter Ninja]");
        super.getInfo();
    }
}
