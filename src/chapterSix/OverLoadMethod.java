package chapterSix;

public class OverLoadMethod {


    public static int add (int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
        public static  int add (int firstNumber, int secondNumber,int thirdNumber){
        return  add(add(firstNumber, secondNumber),thirdNumber);
        }
}
