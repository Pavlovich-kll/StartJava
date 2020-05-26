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

	public int[] enteredNums(int num) {
		enteredNum[attempt] = num;
		return enteredNum;
	}

	public void setEnteredNum(int num) {
		this.enteredNum[attempt] = num;
		attempt++;
	}

	public int getEnteredNum() {
		return enteredNum[attempt];
	}
}