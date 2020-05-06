public class MyFirstGame {
	public static void main(String [] args) {
		int compNum = 50;
		int playerNum = 99;
		System.out.println("Ваше число " + playerNum);
		do {
			if(playerNum > compNum) {
				System.out.println("Ваше число больше, чем загадал компьютер на " + (playerNum - compNum));
				System.out.println("Вы угадали! Это число " + compNum);
			} 

			if(playerNum < compNum) {
				System.out.println("Ваше число меньше, чем загадал компьютер на " + (compNum - playerNum));
				System.out.println("Вы угадали! Это число " + compNum);
			} 

			if(playerNum == compNum) {
				System.out.println("Вы угадали! Это число " + compNum);
			}
		} while(playerNum == compNum);
	}
}