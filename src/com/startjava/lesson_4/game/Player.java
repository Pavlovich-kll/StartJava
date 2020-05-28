package com.startjava.lesson_4.game;

public class Player {
	private String name;
	private int attempt = 0;
	private int[] enteredNum = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int[] getEnteredNums() {
		return enteredNum;
	}

	public void setEnteredNum(int num) {
		enteredNum[attempt] = num;
		attempt++;
	}

	public int getEnteredNum() {
		return enteredNum[attempt-1];
	}

	public int getAttempt() {
		return attempt-1;
	}
}