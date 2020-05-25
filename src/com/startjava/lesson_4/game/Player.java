package com.startjava.lesson_4.game;

public class Player {
	private String name;
	private int num;
	private int i = 0;
	public int[] saveNum = new int[10];

	public int[] SaveNums() {
		saveNum[i] = num;
		if(i == 9) {
			i--;
		} else if(i < 9) {
			i++;
		}
		return saveNum;
	}

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNum(int num) {
		this.num = num;
	}
}