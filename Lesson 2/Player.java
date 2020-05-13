public class Player {
	private String name1;
	private String name2;
	private int number1;
	private int number2;

	public String getName1() {
		return name1;
	}

	void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	void setName2(String name2) {
		this.name2 = name2;
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

	public int getNumber2() {
		return number2;
	}

	int setNumber2(int number2) {
		if(number2 < 0 || number2 > 100) {
			System.out.println("некорректное число");
		} else {
			this.number2 = number2;
		}
		return number2;
	}
}