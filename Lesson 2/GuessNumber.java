import java.util.Scanner;

public class GuessNumber {
	Player pl1 = new Player();
	PlayerTwo pl2 = new PlayerTwo();
	Scanner scan = new Scanner(System.in);
	int compNumber = (int) (Math.random() * (100 + 1));

	public void calculate() {
		do {
			System.out.println("Ходит игрок " + pl1.getName1());
			pl1.setNumber1(scan.nextInt());
			if(pl1.getNumber1() < compNumber) {
				System.out.println(pl1.getName1() +" увеличь число!");
			} else if(pl1.getNumber1() > compNumber) {
				System.out.println(pl1.getName1() + " уменьши число!");
			} else if(pl1.getNumber1() == compNumber) {
				System.out.println("игрок " + pl1.getName1() + " выигрывает!");
				break;
			}
				System.out.println("Ходит игрок " + pl2.getName2());
				pl2.setNumber2(scan.nextInt());
			if(pl2.getNumber2() < compNumber) {
				System.out.println(pl2.getName2() + " увеличь число!");
			} else if(pl2.getNumber2() > compNumber) {
				System.out.println(pl2.getName2() + " уменьши число!");
			} else if(pl2.getNumber2() == compNumber) {
				System.out.println("игрок " + pl2.getName2() + " выигрывает!");
				break;
			}
		} while(pl1.getNumber1() != compNumber || pl2.getNumber2() != compNumber);
	}
}