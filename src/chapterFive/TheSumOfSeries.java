package chapterFive;

public class TheSumOfSeries {
    public static void main(String[] args) {
        long sum = 0;
        System.out.println("Number\t\tSum\t\tProduct\n");

        for (int count = 1; count < 100; count++){
            sum +=count;
            System.out.println(count +"\t\t\t"+ sum);
        }
    }



}
