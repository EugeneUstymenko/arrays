package org.example;

public class Main {
    public static void main(String[] args) {
        int valueInt1 = 21;
        int valueInt2 = 0;
        int valueInt3 = -21;
        double valueDouble1 = 20.21;
        double valueDouble2 = 11.19;
        double valueDouble3 = 0.191;
        long valueLong1 = 122394L;
        long valueLong2 = 99921L;
        long valueLong3 = 19237L;
        float valueFloat1 = 12.32f;
        float valueFloat2 = 1.30231f;
        float valueFloat3 = 19.30221f;

        System.out.print("Operation minus: ");
        System.out.print(Calculator.minus(valueInt1, valueFloat3));
        System.out.print("\nOperation divided: ");
        System.out.print(Calculator.divided(valueLong2, valueFloat1));
        System.out.print("\nOperation multiply: ");
        System.out.print(Calculator.multiply(valueDouble1, valueLong1));
        System.out.print("\nOperation plus: ");
        System.out.print(Calculator.plus(valueDouble1, valueLong1, valueInt2, valueInt3, valueLong3, valueDouble2,
                valueDouble3, valueFloat2));
    }
}