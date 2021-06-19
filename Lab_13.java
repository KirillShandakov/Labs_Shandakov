package com.company;

class TheWitcher{
    private static TheWitcher TheWitcher = new TheWitcher();
    private int weapon;

    private TheWitcher(){ //конструктор
        this.weapon = 4;
    }

    public static TheWitcher getInstance(){
        return TheWitcher;
    }

    public int getweapon(){
        return weapon;
    }

    public void setweapon(int weapon){
        this.weapon = weapon;
    }
}

public class Lab_13{
    public static void main(String[] args) {
        TheWitcher WeaponWitcher = TheWitcher.getInstance();
        System.out.println("Оружие: " + WeaponWitcher.getweapon());
        WeaponWitcher.setweapon(3);
        TheWitcher WeaponWitcher2 = TheWitcher.getInstance();
        System.out.println("Зелья: " + WeaponWitcher2.getweapon());
        WeaponWitcher.setweapon(1);
        TheWitcher WeaponWitcher3 = TheWitcher.getInstance();
        System.out.println("Лошадь: " + WeaponWitcher3.getweapon());
    }
}