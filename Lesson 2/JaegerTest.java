public class JaegerTest {
	public static void main(String[] args) {
		Jaeger striker = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.85f, 10, 10, 9);
		Jaeger gipsy = new Jaeger("Gipsy Avenger", "Mark-6", "USA", 81.77f, 2f, 11, 10, 10);

		System.out.println(striker.getModelName());
		System.out.println(striker.getMark());
		System.out.println(striker.getOrigin());
		System.out.println(striker.getHeight());
		System.out.println(striker.getWeight());
		System.out.println(striker.getSpeed());
		System.out.println(striker.getStrenght());
		System.out.println(striker.getArmor());
		striker.drift();
		striker.move();
		striker.scanKaiju();
		striker.useStingBlades();
		System.out.println(gipsy.getModelName());
		System.out.println(gipsy.getMark());
		System.out.println(gipsy.getOrigin());
		System.out.println(gipsy.getHeight());
		System.out.println(gipsy.getWeight());
		System.out.println(gipsy.getSpeed());
		System.out.println(gipsy.getStrenght());
		System.out.println(gipsy.getArmor());
		gipsy.drift();
		gipsy.move();
		gipsy.scanKaiju();
		gipsy.useChainSword();
		gipsy.useAkmChestLauncher();
	}
}