package chapterFour;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        int data = input.nextInt();

        int num;
        int num2;
        int num3;
        int num4;

        num = data/1000;
        num2 = (data%1000)/100;
        num3 = (data%100)/10;
        num4 = (data%10)/1;

        num = (num + 7)%10;
        num2 = (num2 + 7)%10;
        num3 =(num3 + 7)%10;
        num4 = (num4 + 7)%10;
//
//        int temporary;
//        temporary = num;
//        num = num3;
//        num3 = temporary;
//
//        temporary = num2;
//        num2 = num4;
//        num4 = temporary;



        System.out.printf("The encrypted data is %d%d%d%d",num3,num4,num,num2 );



    }
}
