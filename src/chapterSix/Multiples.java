package chapterSix;

public class Multiples {
    public static void main(String[] args) {
        ;
        System.out.println(isMultiple(6,24));
    }

    public static boolean isMultiple(int firstNumber, int secondNumber) {
        if (secondNumber % firstNumber == 0)
            return true;
        else {
            return false;
        }

    }
}
