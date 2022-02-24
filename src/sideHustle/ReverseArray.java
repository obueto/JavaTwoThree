package sideHustle;

public class ReverseArray {
    private static int maxIndex;

    public static void main(String[] args) {

    }


    public static void reverseMethod (int[]array){
        int MaxIndex = array.length-1;
        int halfLengthOfArray= array.length/2;
        for (int i = 0;i < array.length;i++) {
            int temporaryArray = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temporaryArray;


    }
    }
}
