package com.startjava.lesson_4.game;

public class Player {
	private String name;
	private int i = 0;
	private int[] enteredNum = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public int[] enteredNums(int num) {
		enteredNum[i] = num;
		i++;
		return enteredNum;
	}

	public void setEnteredNum(int num) {
		this.enteredNum[i] = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}