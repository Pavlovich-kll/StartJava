public class ConditionalStatement {
	public static void main(String [] args) {
		int myAge;
		myAge = 24;
		boolean a = myAge > 20;
		if(a == true) {
			System.out.println("Пошёл третий десяток");
		}

		char imMan = 'M';
		if(imMan == 'M') {
			System.out.println("Пол мужской");
		}

		boolean imNotMan = false;
		if(imNotMan != true) {
			System.out.println("Точно не женщина");
		}

		float myHight= 1.94f;
		if(myHight > 1.80) {
			System.out.println("Рост выше среднего");
		} else{
			System.out.println("Нормальный рост");
		}

		char myFirstLetterOfNameKirill = 'K';
		if(myFirstLetterOfNameKirill == 'M') {
			System.out.println("Не старший ребенок в семье");
		} else if(myFirstLetterOfNameKirill == 'I') {
			System.out.println("Не член семьи");
		} else{
			System.out.println("Ни один из предыдущих случаев, так как имя начинается на К");
		}
	}
}