package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		char action = '^';

		if(action == '+') {
			System.out.println("Результат сложения = " + (a + b));
		} else if(action == '-') {
			System.out.println("Результат вычитания = " + (a - b));
		} else if(action == '*') {
			System.out.println("Результат умножения = " + (a * b));
		} else if(action == '/') {
			System.out.println("Результат деления = " + (a / b));
		} else if(action == '%') {
			System.out.println("Результат деления по модулю = " + (a % b));
		} else if(action == '^') {
			System.out.println("Результат возведения в степень = " + Math.pow(a, b));
		}
	}
}