public class Wolf {

	String gender;
	String nickName;
	String woolColor;
	float weight;
	int age;

	void move() {
		System.out.println("идти");
	}

	void sit() {
		System.out.println("сидеть");
	}

	void run() {
		System.out.println("бежать");
	}

	boolean howl() {
		System.out.println("выть");
		return true;
	}

		boolean hunt() {
		System.out.println("охотиться");
		return true;
	}
}