package com.startjava.lesson_4.training;

public class ReverseOrder {
    public static void main(String[] args) {

        String[] a = {" каждый "," охотник "," желает ", " знать ", " где ", " сидит ", " фазан "};
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println();

        String temp;
        int n = a.length;
        for(int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i]= temp;
        }

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
