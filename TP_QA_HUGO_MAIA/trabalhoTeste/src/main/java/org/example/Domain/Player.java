package org.example.Domain;

public class Player {

    private int number;
    private String name;
    private int age;
    private String nationality;
    private int defenceRanking;
    private int attackRanking;
    private int value;

    public Player(int number, String name, int age, String nationality, int defenceRanking, int attackRanking, int value) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.defenceRanking = defenceRanking;
        this.attackRanking = attackRanking;
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public int getDefenceRanking() {
        return defenceRanking;
    }

    public int getAttackRanking() {
        return attackRanking;
    }

    public int getValue() {
        return value;
    }
}
