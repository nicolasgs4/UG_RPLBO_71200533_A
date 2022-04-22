package com.UG8;

public abstract class Character {
    protected int damage;
    protected String name;
    protected int health;

    public Character(String nama,int dmg,int hp){
        this.name = nama;
        this.damage = dmg;
        this.health = hp;
    }

    public void showCharacterInfo(){
        System.out.println( "\nHero     : " + name +
                "\nHealth   : " + health +
                "\nDamage   : " + damage);
    }

    public boolean isDie(){
        if (this.health <= 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void attacked(int atk) {
        if (atk <= 0) {
            return;
        }
        if (health >= atk) {
            this.health = this.health - atk;
        }
        else {
            health = 0;
        }
    }
}
