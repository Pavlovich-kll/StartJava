package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private Player pl1;
	private Player pl2;
	private int compNum = (int) (Math.random() * (100 + 1));
	Scanner scan = new Scanner(System.in);

	public GuessNumber(Player pl1, Player pl2) {
		this.pl1 = pl1;
		this.pl2 = pl2;
	}

	public void startGame() {
		do {
			if (makeMove(pl1)) break;
			if (makeMove(pl2)) break;
		} while (pl1.getAttempt() <= 8 && pl2.getAttempt() <= 9);
		showPlayersArray(pl1);
		showPlayersArray(pl2);
	}

	public boolean makeMove(Player pl1) {
		inputNumber(pl1);
		if (compare(pl1)) return true;
		return false;
	}

	public void showPlayersArray(Player pl1) {
		int[] copySaveNumb1 = Arrays.copyOf(pl1.getPlayerAttempts(), (pl1.getAttempt() + 1));
		System.out.println("Введенные игроком " + pl1.getName() + " числа: " + Arrays.toString(copySaveNumb1));
		Arrays.fill(copySaveNumb1, 0, (pl1.getAttempt() + 1), 0);
	}

	public void inputNumber(Player pl1) {
		System.out.println("Ходит игрок " + pl1.getName());
		int num1 = scan.nextInt();
		pl1.setEnteredNum(num1);
	}

	public boolean compare(Player pl1) {
		if (pl1.getEnteredNum() == compNum) {
			System.out.println("игрок " + pl1.getName() + " выигрывает!");
			System.out.println("Игрок " + pl1.getName() + " угадал число " + compNum + " с " + (pl1.getAttempt() + 1) + " попытки.");
			return true;
		}
		if (pl1.getEnteredNum() < compNum) {
			System.out.println(pl1.getName() + " увеличь число!");
		}
		if (pl1.getEnteredNum() > compNum) {
			System.out.println(pl1.getName() + " уменьши число!");
		}
		if (pl1.getAttempt() == 9) {
			System.out.println("У игрока " + pl1.getName() + " число попыток закончилось!");
		}
		return false;
	}

}


