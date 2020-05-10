public class Calculator {

private int number1;
private int number2;
private int result;
private char mathAction;

public int getNumber1() {
	return number1;
}

void setNumber1(int number1) {
	this.number1 = number1;
}

public int getNumber2() {
	return number2;
}

void setNumber2(int number2) {
	if(mathAction == '+') {
		result = number1 + number2;
	}

	else if(mathAction == '-') {
		result = number1 - number2;
	}

	else if(mathAction == '*') {
		result = number1 * number2;
	}

	else if(mathAction == '/') {
		result = number1 / number2;
	}

	else if(mathAction == '%') {
		result = number1 % number2;
	}

	else if(mathAction == '^') {
		int c = 1;
		for(int i = 1; i <= number2; i++) {
			c *= number1;
			result = c;
		}
	}
	this.number2 = number2;
}

public int getResult() {
	return result;
}

void setResult(int result) {
	this.result = result;
}

public char getMathAction() {
	return mathAction;
}

void setMathAction(char mathAction) {
	switch (mathAction) {
		case '+':
			// result = number1 + number2;
			break;

		case '-':
			// result = number1 - number2;
			break;

		case '*':
			// result = number1 * number2;
			break;

		case '/':
			// result = number1 / number2;
			break;

		case '%':
			// result = number1 % number2;
			break;

		case '^':
			// int c = 1;
			// for(int i = 1; i <= number2; i++) {
			// 	c *= number1;
			// }
			// result = c;
			break;
	}
		this.mathAction = mathAction;
}
}