public class Cycle {
	public static void main(String[] args) {
		System.out.println("Цикл for:");
		int result1;
		for(int i = 0; i < 21; i++) {
			result1 = 0 + i;
			System.out.println(result1);
		}

		System.out.println("Цикл while:");
		int b = -6;
		int result2;
		while(b < 7) {
			result2 = 0 + b;
			b = b + 2;
			System.out.println(result2);
		}

		System.out.println("Цикл while do");
		int c = 1;
		int result3 = 9;
		do {
			result3 = result3 + c;
			if(result3 % 2 != 0) {
			}
			c++;
		} while(c < 12);
		System.out.println("Сумма нечетных чисел [10;20]: " + result3);
	}
}