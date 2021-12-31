package chapterSeven;


import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ChristmasApp {
    public static void main(String[] args) {
        String[][] questions = {{"When is Christmas celebrated?", "\n a December 25 \n b January 25 \n c September 25\n"}, {"The short version of christmas is also known as?", "\n a  x-spot \n b x-mas \n c x-line "},
                {"Where was Jesus born?", "\n a Bethlehem \n b Jerusalem \n c Betel"}, {"Which popular christmas song was played in space?", "\n a Jingle Bells \n  b Silent Night \n c Merry Christmas "},
                {"People buy artificial christmas trees more than the real ones", "\n a false \n b true"}, {"What is the colour of santa's belt", "\n a red \n b green \n c black"},
                {"Who designed the red outfit for santa claus?", "\n a Jumia \n b Coca-cola \n c Asos"}, {"Where was the tallest candy cane made?", "\n a Germany \n b Geneva \n c Glasgow "},
                {"Where was the largest Christmas fruit cake made?", "\n a Germany \n b Geneva \n c Glasgow"}, {"Where was the largest Yule log  made?", "\n a Canada \n b California \n c Cyprus"},
                {"Which month is termed as the national eggnog month?", "\n a December \n b September \n c March"}, {"When was Christmas crackers introduced?", "\n a 1908 \n b 1902 \n c 1907"},
                {"Is finding a spider good luck?", "\n a true \n b false"}, {"Which country celebrates Christmas on 24th December?", "\n a Paris \n b Portugal \n c Poland"},
                {"Where does Santa claus live?", "\n a The southPole \n b The northPole \n c The westPole"}, {"Which country did St Nicholas belong to?", "\n a Greece \n b Ghana \n c China"},
                {"What is the highest grossing Christmas movie of all time?", "\n a White Christmas (1990) \n b Home Alone (1990) \n c Madea's Christmas (1999)"},
                {"Which famous scientist was born on 25th December?", "\n a Karl Max \n b Isaac Newton \n c Albert Einstein"}, {"What is placed at the top of the Christmas tree?", "\n a disciple \n b prophet \n c Angel"},
                {"What does the red colour of Christmas Symbolize?", "\n a Grace of Jesus \n b Blood of Jesus \n c Body of Jesus"}};

        String[] answers = {"a", "b", "c", "a", "b", "c", "b", "b", "a", "a", "a", "b", "a", "b", "b", "a", "b", "b", "c", "b"};

        SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int count = 1;
        for (int i = 0; i < 5; i++) {
            int randomSelection = randomNumbers.nextInt(20);

            System.out.println(count++ + " " + Arrays.toString(questions[randomSelection]));
            String selection = input.nextLine();
            if (Objects.equals(answers, selection)) {
                System.out.println("You got it correct" );
            } else {
                System.out.println("You got it wrong");
            }



        }
    }
}

