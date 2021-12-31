package chapterSix;

public class OverLoadMethodDriver {
    public static void main(String[] args) {
        OverLoadMethod arithmetic = new OverLoadMethod();
        int sum= arithmetic.add(34, 67);
        System.out.println(sum);
        int newSum = arithmetic.add(56, 45, 29);
        System.out.println( newSum);
    }
}
