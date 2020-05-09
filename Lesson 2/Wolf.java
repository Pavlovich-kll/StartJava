public class Wolf {

	private String gender;
	private String nickName;
	private String woolColor;
	private float weight;
	private int age;

	public String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickName() {
		return nickName;
	}

	void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getWoolColor() {
		return woolColor;
	}

	void setWoolColor(String woolColor) {
		this.woolColor = woolColor;
	}

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public void move() {
		System.out.println("идти");
	}

	public void sit() {
		System.out.println("сидеть");
	}

	public void run() {
		System.out.println("бежать");
	}

	public boolean howl() {
		System.out.println("выть");
		return true;
	}

	public boolean hunt() {
		System.out.println("охотиться");
		return true;
	}
}