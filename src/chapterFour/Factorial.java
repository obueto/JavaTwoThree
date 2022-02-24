package chapterFour;

public class Factorial {
    public static void main(String[] args) {

        System.out.println( nonNegativeFactorial(10));
    }

    public static int nonNegativeFactorial(int factorialInt) {
        if (factorialInt > 0) {
            int score = 1;
            for (int count = 0;factorialInt > count; factorialInt--) {
                score *= factorialInt;

            }
            return score;
        }

        else

        return -1;
    }
}
