package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Проверку на валидацию ввода из консоли не делаю
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of array size: ");
        int arraySize = in.nextInt();
        int[] inputArray = new int[arraySize];
        int countPositiveSizeArray = 0;
        System.out.print("Fill array with numbers: \n");

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = in.nextInt();
            if (inputArray[i] > 0) {
                countPositiveSizeArray++;
            }
        }

        int [] resultArray = new int[countPositiveSizeArray];
        int tmp = 0;
        System.out.print("\nResult array: ");
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > 0){
                resultArray[tmp] = inputArray[i];
                System.out.print(resultArray[tmp] + " ");
                tmp++;
            }
        }
        in.close();
    }
}