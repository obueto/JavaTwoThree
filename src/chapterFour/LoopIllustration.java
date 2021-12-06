package chapterTwo;

import java.util.Scanner;

public class LoopIllustration {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        int age = input.nextInt();
//        while(age < 10){
//            System.out.println("You are not eligible");
//            age = input.nextInt();
//        }
//        int age = -1;
//        do{
//           age = input.nextInt();
//           System.out.println("You are not eligible");
//        }while(age < 10);


        int numero = 0;
//        System.out.println("Number"+numero +" is less than 10");
//        while(numero < 10){
//            System.out.println(numero);
//            numero++;
//            System.out.println("Number "+numero +" is less than 10");
//        }

        do{
            System.out.println("Number "+numero +" is less than 10");
            numero++;
        }while(numero <10);
    }
}
