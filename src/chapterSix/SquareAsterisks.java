package chapterSix;

public class SquareAsterisks {
    public static void main(String[] args) {
        squareOfAsterisks(6);
    }

    public static void squareOfAsterisks (int side){
        for (int i = side; i > 0;i--){
            for (int j = 1; j <= side; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
