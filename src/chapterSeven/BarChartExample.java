package chapterSeven;

public class BarChartExample {
    public static void main(String[] args) {
        int []array = {0,0,0,0,0,0,1,2,4,2,1};

        System.out.println("Grades");
        for (int counter =0; counter < array.length; counter++){
            if(counter == 10){
                System.out.printf("%5d:", 100);

        }
        else
                System.out.printf("%02d-%02d:",counter * 10,counter * 10 + 9);
            for (int times = 0; times < array[counter];times++){
                System.out.print("*");

            }
            System.out.println();
    }

}
}
