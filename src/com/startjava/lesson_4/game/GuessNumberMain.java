package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Это игра- угадай число!");
            System.out.println("Компьютер загадывает число от 0 до 100, а игрок отгадывает.");
            System.out.println("У вас всего 10 попыток.");
            System.out.println("Введите имя первого игрока: ");
            String name1 = scan.next();
            Player pl1 = new Player(name1);
            System.out.println("Введите имя второго игрока:");
            String name2 = scan.next();
            Player pl2 = new Player(name2);
            GuessNumber gn = new GuessNumber(pl1, pl2);
            gn.startGame();
            do {
                System.out.println("Хотите продолжить игру?[yes/no]");
                answer = scan.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
