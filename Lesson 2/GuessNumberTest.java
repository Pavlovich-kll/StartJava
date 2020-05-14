import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GuessNumber gn = new GuessNumber();
		String answer;

		System.out.println("Это игра- угадай число!");
		System.out.println("Компьютер загадывает число от 0 до 100, а двое игроков по очереди отгадывают.");
		do{
			System.out.println("Введите имя первого игрока:");
			gn.pl1.setName(scan.next());
			System.out.println("Введите имя второго игрока:");
			gn.pl2.setName(scan.next());
			gn.calculate();
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