package com.UG8;

public class Warlock extends Hero implements Summoner {
    private int numbOfSummon;
    private Summoner Warlock;

    public Warlock() {
        super("Warlock", 80, 700);
    }

    @Override
    public void attack(Creep creep) {
        creep.attacked(damage);
    }

    @Override
    public Golem summon() {
        this.numbOfSummon = this.numbOfSummon + 1;
        Golem gl = new Golem(Warlock);
        return gl;
    }
}
