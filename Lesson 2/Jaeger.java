public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strenght;
	private int armor;

	public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strenght, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.weight = weight;
		this.weight = weight;
		this.speed = speed;
		this.strenght = strenght;
		this.armor = armor;
	}

	public String getModelName() {
		return modelName;
	}

	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return mark;
	}

	void setMark(String mark) {
		this.mark = mark;
	}

	public String getOrigin() {
		return origin;
	}

	void setOrigin(String origin) {
		this.origin = origin;
	}

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	void setHeight(float height) {
		this.height = height;
	}

	public int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrenght() {
		return strenght;
	}

	void setStrenght(int strenght) {
		this.strenght = strenght;
	}
	public int getArmor() {
		return armor;
	}

	void setArmor(int armor) {
		this.armor = armor;
	}

	public boolean drift() {
		System.out.println("вы вошли в дрифт");
		return true;
	}

	public void move() {
		System.out.println("вы прошли 2 шага");
	}

	public boolean scanKaiju() {
		System.out.println("вы начали сканирование");
		return true;
	}

	public void useChainSword() {
		System.out.println("использование цепного меча");
	}

	public void useStingBlades() {
		System.out.println("использование жало- лезвий");
	}

	public void useAkmChestLauncher() {
		System.out.println("использование пусковой установки АКМ");
	}
}