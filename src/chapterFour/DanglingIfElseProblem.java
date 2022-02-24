package chapterFour;

public class DanglingIfElseProblem {
    public static void main(String[] args) {
        danglingIf(3,10);
    }
    public static void danglingIf(int variableOne,int variableTwo){
        if (variableOne > 5) {
            if (variableTwo > 5) {
                System.out.println("variableOne and variableTwo are > 5");
            }

        }
        else {
            System.out.println("variableOne is <=5");
        }


    }
}
