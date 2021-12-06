package chapterFour;

public class Patterns {
    public static void main(String[] args) {
        for(int num = 1; num <= 6; num++){
            for (int role = 1; role >= num; role--){
                System.out.print(role+ " ");
            }
        }
        System.out.println();
    }
}
