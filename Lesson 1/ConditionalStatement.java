public class ConditionalStatement {
	public static void main(String [] args) {
		int age = 24;
		if(age > 20) {
			System.out.println("Пошёл третий десяток");
		}

		boolean male1 = true;
		if(male1 == true) {
			System.out.println("Пол мужской");
		}

		boolean male2 = false;
		if(!male2 == true) {
			System.out.println("Тогда это женщина");
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