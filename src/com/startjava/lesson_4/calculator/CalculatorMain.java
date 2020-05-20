package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите математическое выражение (например 5 ^ 6): ");
        String st = sc.nextLine();
        Calculator calcOne = new Calculator(st);
        System.out.println("Ответ: " + calcOne.calculate());
    }
}

