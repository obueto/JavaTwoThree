package sideHustle;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [][] array = {{1,2,3,4,5},{1,2,3,4},{1,2,3}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
