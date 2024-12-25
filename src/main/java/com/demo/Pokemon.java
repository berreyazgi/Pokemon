package com.demo;

public class Pokemon {
    private int Number;
    private String name;
    private String Type1;
    private String Type2;
    private int Total;
    private int HP;
    private int Attack;
    private int Defense;
    private int SpAtk;
    private int SpDef;
    private int Speed;
    private int Generation;
    private Boolean Legendary;

    public Pokemon() {}
    // Constructor
    public Pokemon(int number, String name, String Type1, String Type2, int Total, int HP, int Attack, int Defense, int SpAtk, int SpDef, int Speed, int Generation, boolean Legendary) {
        this.Number = number;
        this.name = name;
        this.Type1 = Type1;
        this.Type2 = Type2;
        this.Total = Total;
        this.HP = HP;
        this.Attack = Attack;
        this.Defense = Defense;
        this.SpAtk = SpAtk;
        this.SpDef = SpDef;
        this.Speed = Speed;
        this.Generation = Generation;
        this.Legendary = Legendary;
    }

    // Getters
    public int getNumber() {
        return Number;
    }
    public String getName() {
        return name;
    }

    public String getType1() {
        return Type1;
    }

    public String getType2() {
        return Type2;
    }

    public int getTotal() {
        return Total;
    }

    public int getHP() {
        return HP;
    }

    public int getAttack() {
        return Attack;
    }

    public int getDefense() {
        return Defense;
    }

    public int getSpAtk() {
        return SpAtk;
    }

    public int getSpDef() {
        return SpDef;
    }

    public int getSpeed() {
        return Speed;
    }

    public int getGeneration() {
        return Generation;
    }

    public Boolean getLegendary() {
        return Legendary;
    }

    // Setters
    public void setNumber(int number) {
        this.Number = number;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setType1(String Type1) {
        this.Type1 = Type1;
    }

    public void setType2(String Type2) {
        this.Type2 = Type2;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setAttack(int Attack) {
        this.Attack = Attack;
    }

    public void setDefense(int Defense) {
        this.Defense = Defense;
    }

    public void setSpAtk(int SpAtk) {
        this.SpAtk = SpAtk;
    }

    public void setSpDef(int SpDef) {
        this.SpDef = SpDef;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    public void setGeneration(int Generation) {
        this.Generation = Generation;
    }

    public void setLegendary(Boolean Legendary) {
        this.Legendary = Legendary;
    }
    @Override
    public String toString() {
        return "Pokemon{" +
                "number=" + Number +
                "name='" + name + '\'' +
                ", Type1='" + Type1 + '\'' +
                ", Type2='" + Type2 + '\'' +
                ", Total=" + Total +
                ", HP=" + HP +
                ", Attack=" + Attack +
                ", Defense=" + Defense +
                ", SpAtk=" + SpAtk +
                ", SpDef=" + SpDef +
                ", Speed=" + Speed +
                ", Generation=" + Generation +
                ", Legendary='" + Legendary + '\'' +
                '}';
    }


}
