package chapterFourteen;

import java.util.Objects;
import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
      String  userInput = scanner.nextLine();
      StringBuilder builder = new StringBuilder(userInput);

     if(userInput.equals(builder.reverse().toString())){
       System.out.println("This is a Palindrome");
   }
   else {
       System.out.println("This is not a palindrome");
   }


    }
}
