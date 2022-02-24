package chapterFour;

public class Patterns {
    public static void main(String[] args) {
        for(int number = 0; number <= 8; number++){
            for (int role = 8; role >= number; role--){
                System.out.print( " * ");
            }
            System.out.println();
        }
        System.out.print(" ");
    }
}
