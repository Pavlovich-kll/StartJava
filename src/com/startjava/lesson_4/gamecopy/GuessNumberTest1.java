package com.startjava.lesson_4.gamecopy;

import java.util.Scanner;

public class GuessNumberTest1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;

		System.out.println("Это игра- угадай число!");
		System.out.println("Компьютер загадывает число от 0 до 100, а двое игроков по очереди отгадывают.");
		System.out.println("У вас всего 10 попыток.");
		do {
			System.out.println("Введите имя первого игрока:");
			String name1 = scan.next();
			Player1 pl1 = new Player1(name1);
			System.out.println("Введите имя второго игрока:");
			String name2 = scan.next();
			Player1 pl2 = new Player1(name2);
			GuessNumber1 gn = new GuessNumber1(pl1, pl2);
			gn.startGame();
			do {
				System.out.println("Хотите продолжить?[yes/no] ");
				answer = scan.next();
			} while(!answer.equals("yes") && !answer.equals("no"));
		} while(answer.equals("yes"));
	}
}