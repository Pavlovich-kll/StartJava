import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {

		Calculator calcOne = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
		System.out.println("Введите первое число: ");
		calcOne.number1(scan.nextInt());

		System.out.println("Введите знак математической операции: ");
		calcOne.mathAction(scan.next().charAt(0));

		System.out.println("Введите второе число: ");
		calcOne.number2(scan.nextInt());

		System.out.println("Ответ: " + calcOne.result());
		System.out.println("Хотите продолжить? ");
		answer = scan.next();
		} while(answer == "no");
	}
}