public class MyFirstGame {
	public static void main(String[] args) {
		int compNum = 50;
		int playerNum = 99;
		System.out.println("Ваше число " + playerNum);
		do {
			
			if(playerNum > compNum) {
				System.out.println("Ваше число больше, чем загадал компьютер ");
				playerNum =  playerNum - 1;
			} 

			if(playerNum < compNum) {
				System.out.println("Ваше число меньше, чем загадал компьютер");
				playerNum =  playerNum + 1;
			} 

			if(playerNum == compNum) {
				System.out.println("Вы угадали! Это число " + compNum);
			}
		} while(playerNum != compNum);
	}
}