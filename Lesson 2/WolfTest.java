public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setNickName("Alfa");
		wolfOne.setGender("Male");
		wolfOne.setWoolColor("Gray");
		wolfOne.setAge(7);
		wolfOne.setWeight(65.5f);

		System.out.println("nickname = " + wolfOne.getNickName());
		System.out.println("nickname = " + wolfOne.getGender());
		System.out.println("woolColor = " + wolfOne.getWoolColor());
		System.out.println("age = " + wolfOne.getAge());
		System.out.println("woolColor = " + wolfOne.getWeight());
		wolfOne.sit();
		wolfOne.howl();
		wolfOne.move();
		wolfOne.run();
	}
}