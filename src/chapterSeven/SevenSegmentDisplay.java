package chapterSeven;

public class SevenSegmentDisplay {
       private static final int[][] array = new int[5][4];
    public static void main(String[] args) {}

//
//        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
//        sevenSegmentDisplay=sevenSegmentDisplay.setScreen(*11111111*);
//        sevenSegmentDisplay.display();
//

        public static void setSides() {
            for (int i = 0; i <= 1; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i == 1 && j == 1) {
                        System.out.println("#");
                    } else {
                        System.out.println(' ');
                    }

                }
            }
        }
        public void setSideA(){
                array [0][0] = 1;
                array [0][1] = 1;
                array [0][2] = 1;
                array [0][3] = 1;
        }
public void setSideB(){
        array [0][3] = 1;
        array [1][3] = 1;
        array [2][3] = 1;
}
public void setSideC(){
        array [2][3] = 1;
        array [3][3] = 1;
        array [4][3] = 1;
}
public void setSideD(){
        array [4][0] = 1;
        array [4][1] = 1;
        array [4][2] = 1;
}
public void  setSideE (){
        array [2][0] = 1;
        array [3][0] = 1;
        array [4][0] = 1;
}
public  void  setSideF(){
        array [0][0] = 1;
        array [1][0] = 1;
        array [2][0] = 1;
}
public void  setSideG (){
        array [2][0] = 1;
        array [2][1] = 1;
        array [2][2] = 1;
        array [2][3]= 1;
}
}
