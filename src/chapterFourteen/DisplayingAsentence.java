package chapterFourteen;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayingAsentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text");
        String userInput = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(userInput);
        System.out.println(stringBuilder.reverse());

//        System.out.println(Arrays.toString(userInput.split(" ")));
        //String [] tokens = userInput.split(" ");
       // System.out.printf("the elements are %d%n the tokens are %n",tokens.length);
      //  for (int i = 0; i < tokens.length; i++) {



    }
}
