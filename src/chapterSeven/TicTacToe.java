package chapterSeven;

public class TicTacToe {
    public static void main(String[] args) {
       char [] [] ticTacToes = new char[3][3];
        ticTacToes = new char[][]{{'X', 'O', 'O'}, {'X', 'X', 'X'}, {'O', 'X', 'O'}};
        for (int i = 0;i < ticTacToes.length; i++) {
            for (int j = 0; j < ticTacToes[i].length; j++) {
               System.out.print(ticTacToes[i][j] + " ");
            }
            System.out.println();
        }







}
}