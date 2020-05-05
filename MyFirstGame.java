public class MyFirstGame {
	public static void main(String [] args) {
		int compValue = 50;
		int manValue = 99;
		int a = manValue - compValue;
		int b = compValue - manValue;
		System.out.println("Ваше число " + manValue);
		do {
			if(manValue > compValue) {
			System.out.println("Ваше число больше, чем загадал компьютер на " + (manValue - compValue));
			System.out.println("Вы угадали! Это число " + compValue);
			} 

			if(manValue < compValue) {
			System.out.println("Ваше число меньше, чем загадал компьютер на " + (compValue - manValue));
			System.out.println("Вы угадали! Это число " + compValue);
			} 

			if(manValue == compValue) {
			System.out.println("Вы угадали! Это число " + compValue);
			}
		} while(manValue == compValue);
	}
}