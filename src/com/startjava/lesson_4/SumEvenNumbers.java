package com.startjava.lesson_4;

import java.util.Scanner;

public class SumEvenNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int length = scan.nextInt();
        int[] numbers = new int[length];

        System.out.print("Заполните массив четными и нечетными числами через пробел: ");

        for (int i = 0; i < length; i++) {
            numbers[i] = scan.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < length; i++) {
            if(numbers[i] % 2 == 0 && numbers[i] >= 0) {
                sum = sum + numbers[i];
            }
        }

        System.out.println("Сумма четных положительных чисел равна: " + sum);
    }
}