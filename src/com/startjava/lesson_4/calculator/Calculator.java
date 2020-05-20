package com.startjava.lesson_4.calculator;

public class Calculator {

    private String st;

    public void setSt(String st) {
        this.st = st;
    }

    public Calculator(String st) {
        this.st = st;
    }

    public int calculate() {

        String[] numb = st.split("\\W");
        int[] numbers = new int[numb.length];
        for (int i = 0; i <= numbers.length; i=i+3) {
            numbers[i] = Integer.parseInt(numb[i]);
        }
        String[] mathAction = st.split("\\s*\\d+\\s*");
        int res = numbers[0];
        for (int i = 1; i < mathAction.length; i++) {
            if (mathAction[i].equals("+")) {
                res += numbers[i+2];
            }
            if (mathAction[i].equals("-")) {
                res -= numbers[i+2];
            }
            if (mathAction[i].equals("/")) {
                res /= numbers[i+2];
            }
            if (mathAction[i].equals("*")) {
                res *= numbers[i+2];
            }
            if (mathAction[i].equals("%")) {
                res %= numbers[i+2];
            }
            if (mathAction[i].equals("^")) {
                res = (int) Math.pow(res, numbers[i+2]);
            }
        }
        return res;
    }
}