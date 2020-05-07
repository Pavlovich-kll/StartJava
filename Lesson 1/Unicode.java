public class Unicode {
	public static void main(String[] args) {
		for( int a = 33; a <= 126; a++) {
			System.out.println("В таблице Unicode символ с номером " + (int) (a++) + " это " + (char) a);
		}
	}
}