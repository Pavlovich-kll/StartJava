package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private int number;
    private int masNumb;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number < 0 || number > 100) {
            System.out.println("некорректное число");
        } else {
            this.number = number;
        }
    }

    public int getMasNumb() {
        return masNumb;
    }

    public int setMasNumb(int masNumb) {
        this.masNumb = masNumb;
        return masNumb;
    }
}

