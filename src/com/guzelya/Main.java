package com.guzelya;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static  String[] array = new String[3];

    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setHealth(700);
        boss.setDamage(50);
        boss.setTypeOfDefence("Magical");

        System.out.println(boss.getHealth());
        System.out.println(boss.getDamage());
        System.out.println(boss.getTypeOfDefence());

        for (int i = 0; i < array.length; i++) {
            System.out.println(hero1.getHealth());
        }

    }

    public String[] createHeroes(){
        Hero hero1 = new Hero(260, 20, "kinetic");
        Hero hero2 = new Hero(250,25);
        Hero hero3 = new Hero(270,30,"physical");
        array[0] = String.valueOf(hero1);
        array[1] = String.valueOf(hero2);
        array[2] = String.valueOf(hero3);
        return array;
    }
}
