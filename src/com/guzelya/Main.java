package com.guzelya;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setHealth(700);
        boss.setDamage(50);
        boss.setTypeOfDefence("Magical");

        System.out.println(boss.getHealth());
        System.out.println(boss.getDamage());
        System.out.println(boss.getTypeOfDefence());
    }

}
