public class Calculator {

	int number1;
	int number2;
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

	void setNumber2( int number2) {
		this.number2 = number2;
	}

	public char getMathAction() {
		return mathAction;
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