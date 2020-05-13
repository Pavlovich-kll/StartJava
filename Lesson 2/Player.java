public class Player {
	private String name1;
	private String name2;
	private int age;
	private int number1;
	private int number2;

	void setName1(String name1) {
		this.name1 = name1;
	}

	void setName2(String name2) {
		this.name2 = name2;
	}

	void setAge(int age) {
		this.age = age;
	}

	void setNumber1(int number1) {
		if(number1 < 0 || number1 > 100) {
			System.out.println("некорректное число");
		} else {
			this.number1 = number1;
		}
	}

	void setNumber2(int number2) {
		if(number2 < 0 || number2 > 100) {
			System.out.println("некорректное число");
		} else {
			this.number2 = number2;
		}
	}

	public Player (String name1, int age) {
		this.name1 = name1;
		this.age = age;
	}

	public Player (String name2) {
		this.name2 = name2;
	}
}