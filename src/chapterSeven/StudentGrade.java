package chapterSeven;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int[] score=new  int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Score ten times");
        for(int i = 0; i < score.length; i++){
             score[i] = input.nextInt();
            total +=score[i];
            count++;

            if(maxNumber < score[i])
                maxNumber = score[i];
            if (minNumber > score[i])

                minNumber = score[i];
        }
        for (int i : score){
            System.out.print(i + " ");
        }
        double average = (double) total/count;
        System.out.printf("%nThe total Grade is %d%n",total);
        System.out.printf("The average is %.2f%n",average);
        System.out.printf("The maxNumber number is %d%n",maxNumber);
        System.out.printf("The minNumber number is %d%n",minNumber);

    }
}
