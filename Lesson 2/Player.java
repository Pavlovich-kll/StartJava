public class Player {
	private String name;
	private int number;

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	int setNumber(int number) {
		if(number < 0 || number > 100) {
			System.out.println("некорректное число");
		}
		else {
			this.number = number;
		}
		return number;
	}
}