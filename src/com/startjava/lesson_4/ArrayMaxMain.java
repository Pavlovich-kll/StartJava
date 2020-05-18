package com.startjava.lesson_4;

import java.util.Scanner;

public class ArrayMaxMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int maxLenght = scanner.nextInt();
        int[] numbers = new int[maxLenght];

        System.out.print("Заполните массив целыми числами через пробел: ");

        for (int i = 0; i < maxLenght; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 0; i < maxLenght - 1; i++) {
            if (max < numbers[i + 1]) {
                max = numbers[i + 1];
            }
        }

        System.out.println("Максимальное число равно = " + max);
    }
}
