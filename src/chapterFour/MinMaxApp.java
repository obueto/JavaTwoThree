package chapterTwo;
import java.util.Scanner;

public class MinMaxApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 100;
        int count = 1;
        int total = 0;
        float average = 0;

        while (count <= 10) {
            System.out.println("Enter number: ");
            int num = scanner.nextInt();
            total += num;
            count++;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            average = total / count;

        }

        System.out.printf("Minimum number is %d, Maximum number is %d and, Average is %.2f", min, max, average);

    }

}

