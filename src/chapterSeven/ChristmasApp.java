package chapterSeven;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;

public class ChristmasApp {
private static final Scanner input = new Scanner(System.in);
      private static final  SecureRandom randomNumbers = new SecureRandom();
    public static void main(String[] args) {
question();

    }

    public static void compareAnswersAndResponsePicked(String[] array1, String[] array2){
              int count= 0;
        for (int i = 0; i < array1.length; i++) {
          if (Objects.equals(array1[i], array2[i])){
              count++;
          }
        }
        System.out.println("you got "+count+ " questions correctly");
         if (count < 3) System.out.println("get to know more about christmas");
        else System.out.println("congratulations, merry Christmas");
    }
    public static void loopRunningThroughTheQuestion(String[] array){
            String[] response = new String[20];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int randomSelection = randomNumbers.nextInt(20);
            System.out.println(count++ + " " + array[randomSelection]);
            String responsePicked = input.nextLine();
            response[randomSelection] = responsePicked;
        }
        compareAnswersAndResponsePicked(response,answer());
    }
    public static String[] answer(){
        String[] answers = {"a", "b", "c", "a", "b", "c", "b", "b", "a",
                "a", "a", "b", "a", "b", "b", "a", "b", "b", "c", "b"};

        return answers;
    }
    public static void question(){
        String [] questions = new String[20];
        questions [0] = """
        When is Christmas celebrated?,
        a December 25
        b January 25
        c September 25
        """;
        questions [1] = """
        The short version of christmas is also known as?
        a  x-spot
        b x-mas
        c x-line
        """;
        questions [2] = """
        Where was Jesus born?
        a Bethlehem
        b Jerusalem
        c Betel
        """;
        questions [3] = """
        Which popular christmas song was played in space?
        a Jingle Bells
        b Silent Night
        c Merry Christmas
        """;
        questions[4] = """
        People buy artificial christmas trees more than the real ones
        a false
        b true
        """;
        questions [5] = """
        What is the colour of santa's belt
        a red
        b green
        c black
        """;
        questions [6] = """
        Who designed the red outfit for santa claus?
        a Jumia
        b Coca-cola
        c Asos
        """;
        questions [7] = """
        Where was the tallest candy cane made?
        a Germany
        b Geneva
        c Glasgow
        """;
        questions [8] = """
        Where was the largest Christmas fruit cake made?
        a Germany
        b Geneva
        c Glasgow
        """;
        questions [9] = """
        Where was the largest Yule log  made?
        a Canada
        b California
        c Cyprus
        """;
        questions [10] = """
        Which month is termed as the national eggnog month
        a December
        b September
        c March
        """;
        questions [11] = """
        When was Christmas crackers introduced?
        a 1908
        b 1902
        c 1907
        """;
        questions [12] = """
       Is finding a spider good luck?
       a true
       b false
        """;
        questions [13] = """
        Which country celebrates Christmas on 24th December?
        a Paris
        b Portugal
        c Poland
        """;
        questions [14] = """
        Where does Santa claus live?
         a The southPole
         b The northPole
         c The westPole
        """;
        questions [15] = """
        Which country did St Nicholas belong to
        a Greece
        b Ghana
        c China
        """;
        questions [16] = """
        What is the highest grossing Christmas movie of all time?
         a White Christmas (1990)
         b Home Alone (1990)
         c Madea's Christmas (1999)"
        """;
        questions [17] = """
        Which famous scientist was born on 25th December?
        a Karl Max
        b Isaac Newton
        c Albert Einstein
        """;
        questions [18] = """
        What is placed at the top of the Christmas tree?
        a disciple
        b prophet
        c Angel
        """;
        questions [19] = """
        What does the red colour of Christmas Symbolize?
        a Grace of Jesus
        b Blood of Jesus
        c Body of Jesus
        
        """;

        loopRunningThroughTheQuestion(questions);
    }
    }





