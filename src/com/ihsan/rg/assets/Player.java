package com.ihsan.rg.assets;

public class Player {
    private String name;
    private int health = 100;
    private int attackPower = 15;

    public Player(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int attack() {
        return (int) (Math.random() * (this.attackPower - 1));
    }

    public void attacked(int attackPoint) {

        if (this.health - attackPoint <= 0) {
            System.out.println(this.getName() + " defeated");
            this.health = 0;
        } else {
            this.health = this.health - attackPoint;
            System.out.println("Health remaining for " + this.name + " is " + this.health);
        }
    }
}
