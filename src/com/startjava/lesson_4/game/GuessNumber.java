package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private Player pl1;
	private Player pl2;
	private int num1;
	private int num2;
	private int compNum = (int) (Math.random() * (100 + 1));
	Scanner scan = new Scanner(System.in);

	public GuessNumber(Player pl1, Player pl2) {
		this.pl1 = pl1;
		this.pl2 = pl2;
	}

	public void startGame() {
		int i1 = 0;
		int i2 = 0;
		do {
			System.out.println("Ходит игрок " + pl1.getName());
			num1 = scan.nextInt();
			pl1.setEnteredNum(num1);
			if (num1 == compNum) {
				winOfPlayer(i1, pl1);
				i2 = i2 - 1;
				break;
			}
			else if (i1 == 9) {
				System.out.println("У игрока " + pl1.getName() + " число попыток закончилось!");
			} else if (num1 < compNum) {
				System.out.println(pl1.getName() + " увеличь число!");
			} else if (num1 > compNum) {
				System.out.println(pl1.getName() + " уменьши число!");
			}
			i1++;
			System.out.println("Ходит игрок " + pl2.getName());
			num2 = scan.nextInt();
			pl2.setEnteredNum(num2);
			if (num2 == compNum) {
				winOfPlayer(i2, pl2);
				i1 = i1 - 1;
				break;
			} else if (i2 == 9) {
				System.out.println("У игрока " + pl2.getName() + " число попыток закончилось!");
				i1 = i1 - 1;
				break;
			} else if (num2 < compNum) {
				System.out.println(pl2.getName() + " увеличь число!");
			} else if (num2 > compNum) {
				System.out.println(pl2.getName() + " уменьши число!");
			}
			i2++;
		} while (i1 <= 9 && i2 <= 9);
		copyAndZeroingOfArray(i1, pl1, num1);
		copyAndZeroingOfArray(i2, pl2, num2);
	}

	public void winOfPlayer(int i2, Player pl2) {
		System.out.println("игрок " + pl2.getName() + " выигрывает!");
		System.out.println("Игрок " + pl2.getName() + " угадал число " + compNum + " с " + (i2 + 1) + " попытки.");
	}

	public void copyAndZeroingOfArray(int i1, Player pl1, int num1) {
		int[] copySaveNumb1 = Arrays.copyOf(pl1.getEnteredNums(), (i1 + 1));
		System.out.println("Введенные игроком " + pl1.getName() + " числа: " + Arrays.toString(copySaveNumb1));
		Arrays.fill(copySaveNumb1, 0);
	}

}