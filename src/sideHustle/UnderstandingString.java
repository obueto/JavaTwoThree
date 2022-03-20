package sideHustle;

public class UnderstandingString {
    public static void main(String[] args) {
        String string1 = "hello there";
        char [] charArray = new char[11];
        System.out.printf("s1 : %s",string1);
        System.out.printf("%n the length of StringOne : %d",string1.length());
        System.out.printf("%n the String reversed is : ");
        for (int count = string1.length()-1;count >= 0; count--)
       // for (int count  = 0;count <= string1.length()-1; count++)
            System.out.printf("%c",string1.charAt(count));
        string1.getChars(0,7,charArray,0);
        System.out.printf("%n The character array is ");
        for (char character : charArray)
            System.out.print(character);
        System.out.println();
    }
}
