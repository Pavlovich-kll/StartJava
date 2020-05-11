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
				result = number1 + number2;
				return number1 + number2;

			case '-':
				result = number1 - number2;
				return number1 - number2;

			case '*':
				result = number1 * number2;
				return number1 * number2;

			case '/':
				result = number1 / number2;
				return number1 / number2;

			case '%':
				result = number1 % number2;
				return number1 % number2;

			case '^':
				int c = 1;
				for(int i = 1; i <= number2; i++) {
					c *= number1;
				}
				return c;
		}
		System.out.println("Ответ: " + result);
		return result;
	}
}