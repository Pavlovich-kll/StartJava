package com.startjava.lesson_4.gamecopy;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber1 {
	private Player1 pl1;
	private Player1 pl2;
	private int compNumber = (int) (Math.random() * (100 + 1));
	Scanner scan = new Scanner(System.in);

	public GuessNumber1(Player1 pl1, Player1 pl2) {
		this.pl1 = pl1;
		this.pl2 = pl2;
	}

	public void startGame() {
		int i1 = 0;
		int i2 = 0;
		do {
			System.out.println("Ходит игрок " + pl1.getName());
			int numb1 = scan.nextInt();
			pl1.setNumb(numb1);
			System.out.println(Arrays.toString(pl1.SaveNumbers1()));
			if (numb1 == compNumber) {
				System.out.println("игрок " + pl1.getName() + " выигрывает!");
				System.out.println("Игрок " + pl1.getName() + " угадал число " + compNumber + " с " + (i1 + 1) + " попытки.");
				i2 = i2 - 1;
				break;
			} else if (i1 == 9) {
				System.out.println("У игрока " + pl1.getName() + " число попыток закончилось!");
//				i1 = i1 - 1;
//				break;
			} else if (numb1 < compNumber) {
				System.out.println(pl1.getName() + " увеличь число!");
			} else if (numb1 > compNumber) {
				System.out.println(pl1.getName() + " уменьши число!");
			}
			i1++;
			System.out.println("Ходит игрок " + pl2.getName());
			int numb2 = scan.nextInt();
			pl2.setNumb(numb2);
			System.out.println(Arrays.toString(pl2.SaveNumbers2()));
			if (numb2 == compNumber) {
				System.out.println("игрок " + pl2.getName() + " выигрывает!");
				System.out.println("Игрок " + pl2.getName() + " угадал число " + compNumber + " с " + (i2 + 1) + " попытки.");
				i1 = i1 - 1;
				break;
			} else if (i2 == 9) {
				System.out.println("У игрока " + pl2.getName() + " число попыток закончилось!");
				i1 = i1 - 1;
				break;
			} else if (numb2 < compNumber) {
				System.out.println(pl2.getName() + " увеличь число!");
			} else if (numb2 > compNumber) {
				System.out.println(pl2.getName() + " уменьши число!");
			}
			i2++;
		} while (i1 <= 10 && i2 <= 10);
		int[] copySaveNumb1 = Arrays.copyOf(pl1.SaveNumbers1(), (i1 + 1));
		int[] copySaveNumb2 = Arrays.copyOf(pl2.SaveNumbers2(), (i2 + 1));
		System.out.println("Введенные игроком "  + pl1.getName() +  " числа: " + Arrays.toString(copySaveNumb1));
		System.out.println("Введенные игроком "  + pl2.getName() +  " числа: " + Arrays.toString(copySaveNumb2));
		Arrays.fill(copySaveNumb1,0);
		Arrays.fill(copySaveNumb2,0);
	}
}