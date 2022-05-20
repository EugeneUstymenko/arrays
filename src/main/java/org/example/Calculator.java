package org.example;

import org.jetbrains.annotations.NotNull;

public class Calculator {

    // Методы на умножение
    public static long multiply (long firstNumber, long secondNumber){

        return firstNumber * secondNumber;
    }

    public static double multiply(double firstNumber, double secondNumber){

        return firstNumber * secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber){

        return firstNumber * secondNumber;
    }

    public static float multiply(float firstNumber, float secondNumber){

        return firstNumber * secondNumber;
    }

    // Методы на сумму
    public static int plus(int... values){
        int sum = 0;
        for (int x : values){
            sum +=x;
        }
        return sum;
    }
    public static long plus(long... values){
        long sum = 0;
        for (long x : values){
            sum +=x;
        }
        return sum;
    }

    public static double plus(double... values){
        double sum = 0;
        for (double x : values){
            sum +=x;
        }
        return sum;
    }

    public static float plus(float... values){
        float sum = 0;
        for (float x : values){
            sum +=x;
        }
        return sum;
    }

    // Методы на деление
    public static long divided(long firstNumber, long secondNumber){

        return firstNumber / secondNumber;
    }

    public static double divided(double firstNumber, double secondNumber){

        return firstNumber / secondNumber;
    }

    public static int divided(int firstNumber, int secondNumber){

        return firstNumber / secondNumber;
    }

    public static float divided(float firstNumber, float secondNumber){

        return firstNumber / secondNumber;
    }

    // Методы на вычитание
    public static long minus(long firstNumber, long secondNumber){

        return firstNumber - secondNumber;
    }

    public static double minus(double firstNumber, double secondNumber){

        return firstNumber - secondNumber;
    }

    public static int minus(int firstNumber, int secondNumber){

        return firstNumber - secondNumber;
    }

    public static float minus(float firstNumber, float secondNumber){

        return firstNumber - secondNumber;
    }
}
