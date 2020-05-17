package com.startjava.lesson_2_3.calculator;

public class Calculator {

	private int number1;
	private int number2;
	private char mathAction;

	void setNumber1(int number1) {
		this.number1 = number1;
	}

	void setNumber2( int number2) {
		this.number2 = number2;
	}

	void setMathAction(char mathAction) {
		this.mathAction = mathAction;
	}

	public int calculate() {
		switch (mathAction) {
			case '+':
				return number1 + number2;
			case '-':
				return number1 - number2;
			case '*':
				return number1 * number2;
			case '/':
				return number1 / number2;
			case '%':
				return number1 % number2;
			case '^':
				int result = 1;
				for(int i = 1; i <= number2; i++) {
					result *= number1;
				}
				return result;
		} return calculate();
	}
}