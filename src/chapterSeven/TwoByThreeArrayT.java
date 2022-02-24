package chapterSeven;

import java.util.Scanner;

public class TwoByThreeArrayT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  [][] arrayT  = new int  [2][3];
//        arrayT [0][0] = 0;
//        arrayT[0][1] =  0;
//        arrayT[0][2] =  0;
//        arrayT [1][0] = 0;
//        arrayT [1][1] = 0;
//        arrayT [1][2] = 0;

        for (int[] ints : arrayT) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
        System.out.println("Enter a number");

    }
//
//    public static  void arrayElement(int [][] numbers){
//        for (int i = 0; i < numbers.length; i++){
//            for (int j = 0; j <)
//        }

    }



