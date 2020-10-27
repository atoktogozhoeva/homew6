package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon M1911 = new Weapon("M1911", "Automatic Pistol");
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(100);
        boss.setM1911(M1911);
        System.out.println("Boss Damage: " + boss.getDamage() + "\nBoss Health: " + boss.getHealth() + "\nWeapon of Boss: " + boss.getM1911().getName()+"\nType : "+ boss.getM1911().getType());


    }
}
