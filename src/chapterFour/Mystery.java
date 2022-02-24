package chapterFour;

public class Mystery {
    public static void main(String[] args) {
       // int count =  1;
        //while (count<=20) {
          //  System.out.println(count % 3 == 1 ? "#########" : "++++++++");
            //++count;

       // }
        char switchValue = 'd';
        switch (switchValue){
            case 'a':
                System.out.println("This is a");
                break;
            case 'b':
                System.out.println("This is b");
                break;
            case 'c':
                System.out.println("This is c");
                break;
            case 'd':
                System.out.println("This is d");
                break;
            default:
                System.out.println("this is not a b c or d");
                break;

        }
    }
}
