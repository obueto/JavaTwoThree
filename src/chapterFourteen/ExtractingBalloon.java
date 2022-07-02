package chapterFourteen;

public class ExtractingBalloon {
    public static void main(String[] args) {

     extractingBalloon("AAAABALLONNOOLLOBONN");
    }
    public static void extractingBalloon(String string) {
        int countB = 0;
        int countA = 0;
        int countL = 0;
        int countO = 0;
        int countN = 0;


        for (int i = 0; i < string.length(); i++) {
             switch (string.charAt(i)){
                 case 'B' -> {
                   countB++;
                 }
                 case 'A' -> {
                     countA++;
                 }
                 case 'L' -> {
               countL++;
                 }
                 case 'O' -> {
                   countO++;
                 }
                 case 'N' -> {
             countN++;
                 }
             }
        }
//        System.out.println(countA);
        System.out.println(Math.min(countB,Math.min(countA,Math.min(countL,Math.min(countO,countN)))));  ;
    }

}
