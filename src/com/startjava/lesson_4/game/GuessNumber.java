package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player pl1;
    private Player pl2;
    private int compNumber = (int) (Math.random() * (100 + 1));
    private int size = 10;

    public GuessNumber(Player pl1, Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    public void startGame() {
        int[] obj1 = new int[size];
        int[] obj2 = new int[size];
        int i1 = 0;
        int i2 = 0;
        do {
            System.out.println("Ходит игрок " + pl1.getName());
            obj1[i1] = pl1.setMasNumb(scan.nextInt());
            if (obj1[i1] == compNumber) {
                System.out.println("Вы победили!");
                System.out.println("Игрок " + pl1.getName() + " угадал число " + compNumber +  " с " + (i1 + 1)  + " попытки.");
                i2 = i2 - 1;
                break;
            } else if (i1 == 9) {
                System.out.println("Число попыток закончилось!");
                break;
            } else if (obj1[i1] < compNumber) {
                System.out.println("Увеличь число");
            } else if (obj1[i1] > compNumber) {
                System.out.println("Уменьши число");
            }
            i1++;
            System.out.println("Ходит игрок " + pl2.getName());
            obj2[i2] = pl2.setMasNumb(scan.nextInt());
            if (obj2[i2] == compNumber) {
                System.out.println("Вы победили!");
                System.out.println("Игрок " + pl2.getName() + " угадал число " + compNumber +  " с " + (i2 + 1) + " попытки.");
                i1 = i1 - 1;
                break;
            } else if (i2 == 9) {
                System.out.println("Число попыток закончилось!");
                break;
            } else if (obj2[i2] < compNumber) {
                System.out.println("Увеличь число");
            } else if (obj2[i2] > compNumber) {
                System.out.println("Уменьши число");
            }
            i2++;
        } while (true);
        int[] copiObj1 = Arrays.copyOf(obj1, (i1 + 1));
        int[] copiObj2 = Arrays.copyOf(obj2, (i2 + 1));
        System.out.println("Введенные игроком "  + pl1.getName() +  " числа: " + Arrays.toString(copiObj1));
        System.out.println("Введенные игроком "  + pl2.getName() +  " числа: " + Arrays.toString(copiObj2));
        Arrays.fill(copiObj1,0);
        Arrays.fill(copiObj2,0);
    }
}
