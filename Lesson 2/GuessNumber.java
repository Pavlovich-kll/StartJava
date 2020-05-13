import java.util.Scanner;

public class GuessNumber {
	Player pl = new Player();
	Scanner scan = new Scanner(System.in);
	int compNumber = (int) (Math.random() * (100 + 1));

	public void calculate() {
		do {
			System.out.println("Ходит игрок " + pl.getName1());
			pl.setNumber1(scan.nextInt());
			if(pl.getNumber1() < compNumber) {
				System.out.println(pl.getName1() +" увеличь число!");
			} else if(pl.getNumber1() > compNumber) {
				System.out.println(pl.getName1() + " уменьши число!");
			} else if(pl.getNumber1() == compNumber) {
				System.out.println("игрок " + pl.getName1() + " выигрывает!");
				break;
			}
				System.out.println("Ходит игрок " + pl.getName2());
				pl.setNumber2(scan.nextInt());
			if(pl.getNumber2() < compNumber) {
				System.out.println(pl.getName2() + " увеличь число!");
			} else if(pl.getNumber2() > compNumber) {
				System.out.println(pl.getName2() + " уменьши число!");
			} else if(pl.getNumber2() == compNumber) {
				System.out.println("игрок " + pl.getName2() + " выигрывает!");
				break;
			}
		} while(pl.getNumber1() != compNumber || pl.getNumber2() != compNumber);
	}
}