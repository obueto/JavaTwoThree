package chapterSeven;

import java.util.Scanner;

public class GradeArray {
    public static void main(String[] args) {
        int total = 0 ;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the number of input: ");
        int number = scanner.nextInt();

        int[] scores = new int[ number];

        for (int i = 0; i < scores.length; i++){
            System.out.println("Enter the student score: ");
            scores[i] = scanner.nextInt();
            total += scores[i];
//          max = scores[0];
//          max = Math.max(scores[i]);
            if (max < scores[i]){
                max = scores[i];
            }
            if (min > scores[i]){
                min = scores[i];
            }
        }
        for (int scoreFromScores : scores){
            System.out.println(scoreFromScores +" ");
        }

        double average = total/scores.length;
        System.out.printf("The average is %.2f%n",average);
        System.out.printf("The maximum is %d%n",max);
        System.out.printf("The minimum is %d%n",min);
    }
}
