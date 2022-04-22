package com.UG8;


public class Main {
    public static void main(String[] args) {
        Creep creep1 = new Creep("creep1",100,1000);
        Creep creep2 = new Creep("creep2",200,1800);
        Creep creep3 = new Creep("creep3",300,2000);

        LoneDruid lone_druid = new LoneDruid();
        Warlock warlock = new Warlock();

        SpiritBear sb = new SpiritBear(lone_druid);
        Golem glm = new Golem(warlock);

        sb.attack(creep1);
        lone_druid.attack(creep1);
        warlock.attack(creep1);
        glm.attack(creep1);
        glm.attack(creep2);

        Golem miniGolem = new Golem(glm);


        lone_druid.showCharacterInfo();
        sb.showCharacterInfo();
        miniGolem.showCharacterInfo();






    }
}
