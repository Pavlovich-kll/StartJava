package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите математическое выражение (например 5 ^ 6): ");
            String mathExp = sc.nextLine();
            Calculator calc = new Calculator(mathExp);
            System.out.println("Ответ: " + calc.calculate());
            do {
                System.out.println("Хотите продолжить?[yes/no] ");
                answer = sc.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}

