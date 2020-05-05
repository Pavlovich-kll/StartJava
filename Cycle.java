public class Cycle {
	public static void main(String[] args) {
		System.out.println("Цикл for:");
		for(int i = 0; i < 21; i++) {;
			System.out.println( + i);
		}

		System.out.println("Цикл while:");
		int b = -8;
		while(b < 5) {
			b += 2;
			System.out.println( + b);
		}

		System.out.println("Цикл while do");
		int c = 1;
		int result = 9;
		do {
			result = result + c;
			if(result % 2 != 0);
			c++;
		} while(c < 12);
		System.out.println("Сумма нечетных чисел [10;20]: " + result);
	}
}