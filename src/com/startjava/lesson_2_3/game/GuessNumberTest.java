package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;

		System.out.println("Это игра- угадай число!");
		System.out.println("Компьютер загадывает число от 0 до 100, а двое игроков по очереди отгадывают.");
		do {
			System.out.println("Введите имя первого игрока:");
			String name1 = scan.next();
			Player pl1 = new Player(name1);
			System.out.println("Введите имя второго игрока:");
			String name2 = scan.next();
			Player pl2 = new Player(name2);
			GuessNumber gn = new GuessNumber(pl1, pl2);
			gn.startGame();
			do {
				System.out.println("Хотите продолжить?[yes/no] ");
				answer = scan.next();
				if(answer.equals("no")) {
					break;
				}
			} while(!answer.equals("yes"));
		} while(answer.equals("yes"));
	}
}