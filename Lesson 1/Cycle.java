public class Cycle {
	public static void main(String[] args) {
		System.out.println("Цикл for:");
		for(int i = 0; i < 21; i++) {;
			System.out.println( + i);
		}

		System.out.println("Цикл while:");
		int b = 6;
		while(b >= - 6) {
			System.out.println("Число " + b);
			b -= 2;
		}

		System.out.println("Цикл while do");
		int c = 10;
		int result = 0;
		do {
			c++;
			if(c % 2 != 0) {
				result += c;
			}
		} while(c < 20);
		System.out.println("Сумма нечетных чисел [10;20]: " + result);
	}
}