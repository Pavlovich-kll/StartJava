package com.startjava.lesson_4.calculator;

public class Calculator {

    private String srcMathExp;

    public void setSrcMathExp(String mathExp) {
        this.srcMathExp = mathExp;
    }

    public Calculator(String mathExp) {
        this.srcMathExp = mathExp;
    }

    public int calculate() {
        String[] obj = srcMathExp.split("\\s");
        int res = Integer.parseInt(obj[0]);
        int number2 = Integer.parseInt(obj[2]);
            switch (obj[1]) {
                case "+":
                    return res += number2;
                case "-":
                    return res -= number2;
                case "*":
                    return res *= number2;
                case "/":
                    return res /= number2;
                case "%":
                    return res %= number2;
                case "^":
                    return res = (int) Math.pow(res, number2);
            }
            return res;
        }
    }