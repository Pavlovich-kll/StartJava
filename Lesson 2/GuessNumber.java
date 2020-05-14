import java.util.Scanner;

public class GuessNumber {
	Player pl1 = new Player();
	Player pl2 = new Player();
	Scanner scan = new Scanner(System.in);
	int compNumber = (int) (Math.random() * (100 + 1));

	public void calculate() {
		do {
			System.out.println("Ходит игрок " + pl1.getName());
			pl1.setNumber(scan.nextInt());
			if(pl1.getNumber() < compNumber) {
				System.out.println(pl1.getName() +" увеличь число!");
			} else if(pl1.getNumber() > compNumber) {
				System.out.println(pl1.getName() + " уменьши число!");
			} else if(pl1.getNumber() == compNumber) {
				System.out.println("игрок " + pl1.getName() + " выигрывает!");
				break;
			}
				System.out.println("Ходит игрок " + pl2.getName());
				pl2.setNumber(scan.nextInt());
			if(pl2.getNumber() < compNumber) {
				System.out.println(pl2.getName() + " увеличь число!");
			} else if(pl2.getNumber() > compNumber) {
				System.out.println(pl2.getName() + " уменьши число!");
			} else if(pl2.getNumber() == compNumber) {
				System.out.println("игрок " + pl2.getName() + " выигрывает!");
				break;
			}
		} while(pl1.getNumber() != compNumber || pl2.getNumber() != compNumber);
	}
}