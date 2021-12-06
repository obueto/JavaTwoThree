package chapterTwo;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        int first;
        int second;
        int third;
        int fourth;
        int fifth;
        int largeNumber = 0;
        int smallNumber = 0  ;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter first Number");
        first = input.nextInt();

        System.out.print("Enter second Number");
        second = input.nextInt();

        System.out.print("Enter third Number");
        third = input.nextInt();

        System.out.print("Enter fourth Number");
        fourth = input.nextInt();

        System.out.print("Enter fifth Number");
        fifth = input.nextInt();

        if (first > largeNumber){
            largeNumber = first;}

        if (second > largeNumber){
            largeNumber = second;}

        if (third > largeNumber){
            largeNumber = third;}

        if (fourth > largeNumber){
            largeNumber = fourth;}


        if (fifth > largeNumber){
            largeNumber = fifth;}

        System.out.println("The largest number is  "+ largeNumber);

        if (first < second & first < third & first < fourth & first < fifth ){
            smallNumber = first;}

        if (second < first & second < third & second < fourth & first < fifth ){
            smallNumber = second;}

        if (third < first & third < second & third < fourth & third < fifth ){
            smallNumber = third;}

        if (fourth < first & fourth < second & fourth < third & fourth < fifth ){
            smallNumber = fourth;}

        if (fifth < first  & fifth < second & fifth < third & fifth < fourth ){
            smallNumber = fifth;}

        System.out.print("The smallest number is "+ smallNumber);

    }
}
