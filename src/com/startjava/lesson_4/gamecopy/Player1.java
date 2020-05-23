package com.startjava.lesson_4.gamecopy;

import java.util.Arrays;

public class Player1 {
	private String name;
	private int numb;
	private int i = 0;

	public Player1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumb(int numb) {
		this.numb = numb;
	}


	int[] saveNumb1 = new int[11];
	public int[] SaveNumbers1() {
		saveNumb1[i] = numb;
		i++;
		return saveNumb1;
	}

	int[] saveNumb2 = new int[11];
	public int[] SaveNumbers2() {
		saveNumb2[i] = numb;
		i++;
		return saveNumb2;
	}
}