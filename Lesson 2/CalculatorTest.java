import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {

		Calculator calcOne = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answerYes = "yes";
		String answer;

		do {
		System.out.println("Введите первое число: ");
		calcOne.setNumber1(scan.nextInt());

		System.out.println("Введите знак математической операции: ");
		calcOne.setMathAction(scan.next().charAt(0));

		System.out.println("Введите второе число: ");
		calcOne.setNumber2(scan.nextInt());

		System.out.println("Ответ: " + calcOne.getResult());
		System.out.println("Хотите продолжить? ");
		answer = scan.next();
		} while(answer.equals(answerYes));
	}
}