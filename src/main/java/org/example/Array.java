package org.example;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Array {
    private final Scanner in = new Scanner(System.in);
    private int resultArraySize;
    public int consoleInputArraySize(){
        return in.nextInt();
    }
    public int[] inputArray(int arraySize){
        int[] inputArray = new int [arraySize];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = in.nextInt();
            if (inputArray[i] > 0) {
                resultArraySize++;
            }
        }
        return inputArray;
    }
    public int[] resultArray(int @NotNull [] inputArray){
        int [] resultArray = new int[resultArraySize];
        int tmp = 0;
        for (int i : inputArray) {
            if (i > 0) {
                resultArray[tmp] = i;
                tmp++;
            }
        }
        return resultArray;
    }
    public void printResultArray(int @NotNull [] resultArray){
        for (int j : resultArray) {
            System.out.print(j + " ");
        }
    }
}
