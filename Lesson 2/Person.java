public class Person {
	
	String gender = "Male";
	String name = "Kirill";
	float hight = 1.94f;
	float weight = 100.5f;
	int age = 24;

	void move() {
		System.out.println("Вы пошли");
	}

	void sit() {
		System.out.println("Вы сели");
	}

	void run() {
		System.out.println("Вы побежали");
	}

	boolean tell() {
		System.out.println("Вы заговорили");
		return true;
	}

	boolean learnJava() {
		System.out.println("Вы учите Java");
		return true;
	}
}