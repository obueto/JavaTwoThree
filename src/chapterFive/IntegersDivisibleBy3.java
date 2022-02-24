package chapterFive;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
        int total = 0;
        for (int count = 1; count < 30; count++){
            if (count % 3== 0){
                System.out.println(count);
            }
            total+=count;
        }
        System.out.println( "The total is " + total);
    }
}
