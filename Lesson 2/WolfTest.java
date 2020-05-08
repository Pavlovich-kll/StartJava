public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.nickName = "Alfa";
		wolfOne.gender = "Male";
		wolfOne.woolColor = "Gray";
		wolfOne.age = 7;
		wolfOne.weight = 65.5f;

		System.out.println("nickname = " + wolfOne.nickName);
		System.out.println("nickname = " + wolfOne.gender);
		System.out.println("woolColor = " + wolfOne.woolColor);
		System.out.println("age = " + wolfOne.age);
		System.out.println("woolColor = " + wolfOne.weight);
		wolfOne.sit();
		wolfOne.howl();
		wolfOne.move();
		wolfOne.run();
	}
}