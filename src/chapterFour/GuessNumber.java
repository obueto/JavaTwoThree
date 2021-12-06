package chapterFour;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        SecureRandom guessNumber = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int number;
        int count= 0;

        int random = guessNumber.nextInt(1000);
        do{

            System.out.println("Enter a number between 1 and 1000");
            number = input.nextInt();
            count++;
          if(number>random){
              System.out.println("Too high,Try again");
          }
          else{
              if (number<random){
                  System.out.println("Too low Try again");
              }
              else{
                  System.out.println("Congratulations");
          }
        }



            }
        while (number != random);
        System.out.println(count);
        if (count < 10){
            System.out.println("Either you know the secrets or you got lucky!!");
        }
        else {
            if (count == 10){
                System.out.println("Aha You know the secret");
            }
            else {
                System.out.println("You should be able to do better!!!!");
            }
        }
        }
        }
