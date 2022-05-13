package com.ihsan.rolegame;

import com.ihsan.rg.assets.Player;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Player p1 = new Player("Ihsan", 120, 10);
        Player p2 = new Player("Dimas", 100, 15);

        while (p1.getHealth() > 0 && p2.getHealth() > 0) {
            System.out.println("----------------");
            System.out.println(p1.getName() + " attacked " + p2.getName());
            p2.attacked(p1.attack());
            System.out.println(p2.getName() + " attacked " + p1.getName());
            p1.attacked(p2.attack());
            System.out.println("----------------");
        }

        if (p1.getHealth() == 0) {
            System.out.println("The winner is " + p2.getName());
        } else if (p2.getHealth() == 0) {
            System.out.println("The winner is " + p1.getName());
        }

    }
}
