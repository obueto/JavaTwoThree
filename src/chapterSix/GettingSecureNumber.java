package chapterSix;

import java.security.SecureRandom;
import java.util.Random;

public class GettingSecureNumber {
    public static void main(String[] args) {
        Random random = new Random();
        SecureRandom randomNumbers = new SecureRandom();
       // int number = 2 + randomNumbers.nextInt(5);
        //System.out.println(number);

      //  int value = 4 + randomNumbers.nextInt(46);
       // System.out.println(value);

       // int checkRange = randomNumbers.nextInt(7);
        //System.out.println(checkRange);

        //int rangeNum = 1000 + randomNumbers.nextInt(30);
        //System.out.println(rangeNum);

    int numberInRange = (int) (-5  + random.nextDouble());
    System.out.println(numberInRange);

       // int numberInRange = (int) (-2  + random.nextInt(9));
        //System.out.println(numberInRange);
    }
}
