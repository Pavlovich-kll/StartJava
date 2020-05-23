package com.startjava.lesson_4.gamecopy;

import java.util.Arrays;

public class Player1 {
	private String name;
	private int numb;

	public Player1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player1(int numb) {
		this.numb = numb;
	}

	public int getNumb() {
		return numb;
	}

	public int[] SaveNumbers1() {
		int[] saveNumb1 = new int[10];
		for (int i = 0; i < 10; i++) {
			saveNumb1[i] = numb;
		}
		return saveNumb1;
	}

	public int[] SaveNumbers2() {
		int[] saveNumb2 = new int[10];
		for (int i = 0; i < 10; i++) {
			saveNumb2[i] = numb;
		}
		return saveNumb2;
	}
}