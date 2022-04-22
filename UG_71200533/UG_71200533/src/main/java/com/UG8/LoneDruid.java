package com.UG8;

public class LoneDruid extends Hero implements Upgradeable,Summoner{
    protected int killCreep;
    protected int level;

    public LoneDruid() {
        super("LoneDruid", 140, 1800);

    }

    @Override
    public void showCharacterInfo() {
        super.showCharacterInfo();
    }

    public void upgrade() {
        if (killCreep >= 3){
            this.level = this.level + 1;
            this.killCreep = this.killCreep - 3;
            name = name + this.level;
            damage = damage + 20;
        }
    }

    public SpiritBear summon() {

        return null;
    }

    @Override
    public void attack(Creep creep) {
        creep.attacked(damage);
        if(creep.isDie() == true){
            this.killCreep = this.killCreep + 1;
        }
    }
}
