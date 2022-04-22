package com.UG8;

public abstract class Hero extends Character implements AttackingCreep {
    public Hero(String name, int damage, int health) {
        super(name, damage, health);
    }
}
