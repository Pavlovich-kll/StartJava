public class Unicode {
	public static void main(String[] args) {
		char a = 33;
		int b = 33;
		for(a = 33; a <= 126; a++) {
			System.out.println("В таблице Unicode символ с номером " + (b++) +" это " + a);
		}
	}
}