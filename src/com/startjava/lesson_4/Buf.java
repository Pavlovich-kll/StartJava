package com.startjava.lesson_4;

public class Buf {
    public static void main(String[] args) {
        int[] a = {15, 25, 8, 1, 50};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length -1; i++) {
                if(a[i] > a[i + 1]) {
                    isSorted = false;

                    buf = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = buf;
                }
            }
        }
        for (int b:a) {
            System.out.print(+ b + " ");
        }
    }
}
