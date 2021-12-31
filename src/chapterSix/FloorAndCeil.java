package chapterSix;

import java.util.Scanner;

public class FloorAndCeil {

    public static void main(String[] args) {

    int max  =  myFloor(22.5);
        System.out.println(max);
        int min = myCeil(8.9);
        System.out.println(min);







    }
        public static  int myFloor(double num){
            double max = 0;
            if (max <= num){
                max = num;
            }
            return (int) max;
        }
        public static int myCeil(double num) {
            double ceil = Math.ceil(0.5);
            if (ceil <=num ){
                ceil = num;
            }
            return (int) ceil;
        }
}
