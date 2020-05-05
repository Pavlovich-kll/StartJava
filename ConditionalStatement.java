public class ConditionalStatement {
	public static void main(String [] args) {
		int age = 24;
		boolean a = age > 20;
		if(age > 20) {
			System.out.println("Пошёл третий десяток");
		}

		boolean genderM = true;
		if(genderM == true) {
			System.out.println("Пол мужской");
		}

		boolean genderF = false;
		if(genderF != true) {
			System.out.println("Точно не женщина");
		}

		float hight= 1.94f;
		if(hight > 1.80) {
			System.out.println("Рост выше среднего");
		} else {
			System.out.println("Нормальный рост");
		}

		char firstNameLetter = 'K';
		if(firstNameLetter == 'M') {
			System.out.println("Не старший ребенок в семье");
		} else if(firstNameLetter == 'I') {
			System.out.println("Не член семьи");
		} else {
			System.out.println("Ни один из предыдущих случаев, так как имя начинается на К");
		}
	}
}