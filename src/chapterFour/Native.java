package chapterFour;

import java.util.Scanner;

/*import java.util.Scanner;

public class Native {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();
        int count = 0;
        int num = 1;

        while (num <= number){
            int total = number % num;
            if(total == 0) {
                System.out.println(" "+num);
                count++;
            }
            num++;

        }

        System.out.println("count is "+ count);


        }
    }
*/
public class Native {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        int count = 0;
        System.out.println("the factors are ");
        for (int num = 1; num <= number; num++) {
            if (number % num == 0) {
                count++;
                System.out.print(num + " ");

            }
        }
        System.out.println("The number of factors is " + count);
        if (count == 2)
        {
            System.out.println("the number is a prime number");

        }
        else {
            System.out.println("the number is not a prime number");
        }
    }
}