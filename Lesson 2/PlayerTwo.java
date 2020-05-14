public class PlayerTwo {
	private String name2;
	private int number2;

	public String getName2() {
		return name2;
	}

	void setName2(String name2) {
		this.name2 = name2;
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