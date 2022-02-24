package chapterFive;

public class TrianglePrintingProgramA {
    public static void main(String[] args) {
        int userInput = 10;
        for (int i = 0; i <= userInput; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" ");

        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" ");

        int n = 10;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j =i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" ");

        int i = 10;
        for(int j = 1; j<=i; j++){
            for (int k = j; k<=i; k++){
                System.out.print(" ");
            }
            for (int l = 1; l<=j; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

