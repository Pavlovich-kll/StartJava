public class JaegerTest {
	public static void main(String[] args) {
		Jaeger gipsy = new Jaeger();
		Jaeger striker = new Jaeger();

		striker.setModelName("Striker Eureka");
		striker.setMark("Mark-5");
		striker.setOrigin("Australia");
		striker.setHeight(76.2f);
		striker.setWeight(1.85f);
		striker.setSpeed(10);
		striker.setStrenght(10);
		striker.setArmor(9);
		gipsy.setModelName("Gipsy Avenger");
		gipsy.setMark("Mark-6");
		gipsy.setOrigin("USA");
		gipsy.setHeight(81.77f);
		gipsy.setWeight(2f);
		gipsy.setSpeed(11);
		gipsy.setStrenght(10);
		gipsy.setArmor(10);

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