package com.UG8;

public abstract class SummonCharacter extends Hero{
    protected String owner;

    public SummonCharacter(String name, int damage, int health, Summoner summon) {
        super(name, damage, health,summon);
        this.owner = owner.name;
    }



}
