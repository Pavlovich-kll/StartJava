import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Player pl1 = new Player("Bill", 20);
		Player pl2 = new Player("Tom");
		Scanner sc = new Scanner(System.in);
		int compNumber = (int) (Math.random() * (100 + 1));
		String answer;

		System.out.println("игра- угадай число");
		System.out.println("компьютер загадывает число от 0 до 100, а двое игроков по очереди отгадывают");

		do{
			System.out.println("ходит игрок " + pl1);
			pl1.setNumber1(sc.nextInt());
			if(pl1.setNumber1() < compNumber) {
				System.out.println("увеличь число");
			} else if(pl1.setNumber1() > compNumber) {
				System.out.println("уменьши число");
			} else if(pl1.setNumber1() == compNumber) {
				System.out.println("игрок " + pl1 + " выигрывает!");
			} else {
				System.out.println("ходит игрок " + pl2);
				pl2.setNumber2(sc.nextInt());
			}
			if(pl2.setNumber2() < compNumber) {
				System.out.println("увеличь число");
			} else if(pl2.setNumber2() > compNumber) {
				System.out.println("уменьши число");
			} else if(pl2.setNumber2() == compNumber) {
				System.out.println("игрок " + pl2 + " выигрывает!");
			}
		} while(pl1.setNumber1() == compNumber || pl2.setNumber2() == compNumber);
		
			do {
				System.out.println("Хотите продолжить?[yes/no] ");
				answer = sc.next();
				if(answer.equals("no")) {
					break;
				}
			} while(!answer.equals("yes"));
	}
}