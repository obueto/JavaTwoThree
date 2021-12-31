package chapterSix;

public  class TwoSumMain {
    public static void main(String[] args) {
        //String[][] array = {{"Name  ", " Address  ", " \t\tSex "}, {"Dayo ", " 10,Allen Street ", " Male "}};
        //displayArray(array);
        int [][] multiArray = {{13,21, 34},{43, 11, 44}, {22, 12, 31}};
        displayArray(multiArray);
    }
    public static void  displayArray (int [][] multiArray){
        for (int counter = 0; counter < multiArray.length; counter++){
             for (int j = 0; j < multiArray[counter].length; j++){
                 System.out.print(multiArray[counter][j] + " ");
           }
            System.out.println( );
        }
    }

}
