package chapterTwo;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;
        int largeNumber = 0;
        int smallNumber = 0  ;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter firstNumber Number");
        firstNumber = input.nextInt();

        System.out.print("Enter secondNumber Number");
        secondNumber = input.nextInt();

        System.out.print("Enter thirdNumber Number");
        thirdNumber = input.nextInt();

        System.out.print("Enter fourthNumber Number");
        fourthNumber = input.nextInt();

        System.out.print("Enter fifthNumber Number");
        fifthNumber = input.nextInt();

        if (firstNumber > largeNumber){
            largeNumber = firstNumber;}

        if (secondNumber > largeNumber){
            largeNumber = secondNumber;}

        if (thirdNumber > largeNumber){
            largeNumber = thirdNumber;}

        if (fourthNumber > largeNumber){
            largeNumber = fourthNumber;}


        if (fifthNumber > largeNumber){
            largeNumber = fifthNumber;}

        System.out.println("The largest number is  "+ largeNumber);

        if (firstNumber < secondNumber & firstNumber < thirdNumber & firstNumber < fourthNumber & firstNumber < fifthNumber ){
            smallNumber = firstNumber;}

        if (secondNumber < firstNumber & secondNumber < thirdNumber & secondNumber < fourthNumber & firstNumber < fifthNumber ){
            smallNumber = secondNumber;}

        if (thirdNumber < firstNumber & thirdNumber < secondNumber & thirdNumber < fourthNumber & thirdNumber < fifthNumber ){
            smallNumber = thirdNumber;}

        if (fourthNumber < firstNumber & fourthNumber < secondNumber & fourthNumber < thirdNumber & fourthNumber < fifthNumber ){
            smallNumber = fourthNumber;}

        if (fifthNumber < firstNumber  & fifthNumber < secondNumber & fifthNumber < thirdNumber & fifthNumber < fourthNumber ){
            smallNumber = fifthNumber;}

        System.out.print("The smallest number is "+ smallNumber);

    }
}
