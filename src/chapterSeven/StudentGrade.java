package chapterSeven;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] score=new  int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Score ten times");
        for(int i = 0; i < score.length; i++){
             score[i] = input.nextInt();
            total +=score[i];
            count++;

            if(max < score[i])
                max = score[i];
            if (min > score[i])

                min = score[i];
        }
        for (int i : score){
            System.out.print(i + " ");
        }
        double average = (double) total/count;
        System.out.printf("%nThe total Grade is %d%n",total);
        System.out.printf("The average is %.2f%n",average);
        System.out.printf("The max number is %d%n",max);
        System.out.printf("The min number is %d%n",min);

    }
}
