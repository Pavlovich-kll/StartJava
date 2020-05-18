package com.startjava.lesson_4;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int length = scan.nextInt();
        int[] numbers = new int[length];

        System.out.print("Введите числа через пробел: ");
        int sum = 0;
        for (int i = 0; i < length; i++) {
            numbers[i] = scan.nextInt();
            sum = sum + numbers[i];
        }

        float average = sum / length;
        System.out.println("Среднее арифметическое элементов массива: " + average);
        for (int i = 0; i < length; i++) {
           if(numbers[i] < average) {
               System.out.println("Элементы массива, меньше среднего арифметического их суммы: " + numbers[i]);
           }
        }
    }
}