public class Calculator {

int number1;
int number2;
int result;
char mathAction;

switch (mathAction) {
	case '+': mathAction = '+';
	System.out.println(+ result = (number1 + number2));
	break;

	case '-': mathAction = '-';
	System.out.println(+ result = (number1 - number2));
	break;

	case '*': mathAction = '*';
	System.out.println(+ result = (number1 * number2))
	break;

	case '/': mathAction = '/';
	System.out.println(+ result = (number1 / number2))
	break;

	case '%': mathAction = '%';
	System.out.println(+ result = (number1 % number2));
	break;

	case '^': mathAction = '^';
	int c = 1;
		for(int i = 1; i <= number2; i++) {
			c *= number1;
		}
	System.out.println(+ result = c);
	break;
	}
}