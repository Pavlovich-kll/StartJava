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
        String[] splitMathExp = srcMathExp.split("\\s");
        int num1 = Integer.parseInt(splitMathExp[0]);
        int num2 = Integer.parseInt(splitMathExp[2]);
        switch (splitMathExp[1]) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
            case "^":
                return (int) Math.pow(num1, num2);
        }
        return calculate();
        }
    }