public class Wolf {

	private String gender;
	private String nickName;
	private String woolColor;
	private float weight;
	private int age;

	public String getGender() {
		return gender;
	}

	public String getNickName() {
		return nickName;
	}

	public String getWoolColor() {
		return woolColor;
	}

	public float getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	void setNickName(String nickName) {
		this.nickName = nickName;
	}

	void setWoolColor(String woolColor) {
		this.woolColor = woolColor;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	void setWeight(float weight) {
		this.weight = weight;
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