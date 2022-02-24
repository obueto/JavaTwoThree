package sideHustle;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The number of count");
        int count = scanner.nextInt();

        int [] readArray = readIntegers(count);
        int readMinNumber = minNumber(readArray);

        System.out.println(readMinNumber);
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();


        }

        return array;
    }
    public static  int minNumber(int [] array){
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            int valueOfArray = array[i];
            if (valueOfArray < minNumber){
                minNumber = valueOfArray;
            }
        }
        return minNumber;
    }
}