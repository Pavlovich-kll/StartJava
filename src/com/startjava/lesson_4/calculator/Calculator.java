package com.startjava.lesson_4.calculator;

public class Calculator {

    private String srcMathExp;

    public void setSt(String mathExp) {
        this.srcMathExp = mathExp;
    }

    public Calculator(String mathExp) {
        this.srcMathExp = mathExp;
    }

    public int calculate() {
        String[] obj = srcMathExp.split("\\s");
        int[] numb = new int[obj.length];
        for (int i = 0; i < obj.length; i = i + 2) {
            numb[i] = Integer.parseInt(obj[i]);
        }
        int res = numb[0];
        for (int i = 1; i < obj.length; i++) {
            switch (obj[1]) {
                case "+":
                    return res += numb[i + 1];
                case "-":
                    return res -= numb[i + 1];
                case "*":
                    return res *= numb[i + 1];
                case "/":
                    return res /= numb[i + 1];
                case "%":
                    return res %= numb[i + 1];
                case "^":
                    return res = (int) Math.pow(res, numb[i + 1]);
            }
        }
        return res;
    }
}
