package com.UG8;

public class Golem extends SummonCharacter implements Summoner {

    private int kill;

    public Golem(Summoner summon) {
        super("Golem", 120, 1000, "Warlock");
    }

    public int getKill() {
        return kill;
    }

    public void setKill(int kill) {
        this.kill = this.kill;
    }


    @Override
    public Golem summon() {
        if (this.kill > 0) {
            this.kill = this.kill - 1;
        }
        return null;
    }


    @Override
    public void attack(Creep creep) {
        creep.attacked(damage);
        if (creep.isDie() == true) {
            this.kill = this.kill + 1;
        }
    }
}

