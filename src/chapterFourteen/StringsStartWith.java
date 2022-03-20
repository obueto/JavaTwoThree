package chapterFourteen;

public class StringsStartWith {
    public static void main(String[] args) {
        String [] myString = {"started","starting","stalker", "wounded","folded", "ended","ending"};
        for (String string : myString) {
            if (string.startsWith("st")) {
                System.out.printf("\"%s\"starts with \"st\"%n", string);
            }
        }
        System.out.println();
        for(String string : myString) {
            if (string.startsWith("art", 2)) {
                System.out.printf("\"%s\"starts with \"art\" at position 2%n", string);
            }
        }
        System.out.println();

        for(String string : myString) {
            if (string.endsWith("ed")){
                System.out.printf("\"%s\"ends with \"ed\"%n", string);
            }
        }
        System.out.println();
    }

}
