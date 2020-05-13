import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calcOne = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.println("Введите первое число: ");
			calcOne.setNumber1(scan.nextInt());

			System.out.println("Введите знак математической операции: ");
			calcOne.setMathAction(scan.next().charAt(0));

			System.out.println("Введите второе число: ");
			calcOne.setNumber2(scan.nextInt());

			System.out.println("Ответ: " + calcOne.calculate());
			do {
				System.out.println("Хотите продолжить?[yes/no] ");
				answer = scan.next();
				if(answer.equals("no")) {
					break;
				}
			} while(!answer.equals("yes"));
		} while(answer.equals("yes"));
	}
}

