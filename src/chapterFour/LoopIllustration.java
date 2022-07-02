package chapterFour;

import java.util.Scanner;

public class LoopIllustration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        int age = scanner.nextInt();
//        while(age < 10){
//            System.out.println("You are not eligible");
//            age = scanner.nextInt();
//        }
//        int age = -1;
//        do{
//           age = scanner.nextInt();
//           System.out.println("You are not eligible");
//        }while(age < 10);


        int number = 0;
//        System.out.println("Number"+number +" is less than 10");
//        while(number < 10){
//            System.out.println(number);
//            number++;
//            System.out.println("Number "+number +" is less than 10");
//        }

        do{
            System.out.println("Number "+number +" is less than 10");
            number++;
        }while(number <10);
    }
}
