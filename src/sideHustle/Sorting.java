package sideHustle;

import java.util.Scanner;

public class Sorting {
   private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        int[] myIntegers = getInteger(5);
    }
public static int []getInteger(int number){
        int []numberArray = new int[number];
         System.out.println("Enter a number " + number + "Integer Value:\r");
        for (int i = 0; i < numberArray.length; i++){
            numberArray[i] = input.nextInt();

        }
        return numberArray;
}

     public static  void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element" + i + "contents" + array[i]);
        }
     }

public static int [] sortInteger (int []array){
        int[]sortedArray =new int[array.length];
        for (int i=0;i < array.length;i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temporary;
        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++){
                temporary = sortedArray[i];
                sortedArray[i] =sortedArray[i +1];
                sortedArray[i + 1] = temporary;
                flag = true;
            }
        }
      return sortedArray;

}


}