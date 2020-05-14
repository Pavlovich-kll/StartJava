public class Player {
	private String name1;
	private int number1;

	public String getName1() {
		return name1;
	}

	void setName1(String name1) {
		this.name1 = name1;
	}

	public int getNumber1() {
		return number1;
	}

	int setNumber1(int number1) {
		if(number1 < 0 || number1 > 100) {
			System.out.println("некорректное число");
		}
		else {
			this.number1 = number1;
		}
		return number1;
	}
}