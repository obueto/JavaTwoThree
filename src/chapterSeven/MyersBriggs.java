package chapterSeven;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MyersBriggs {
    private static final Scanner scanner = new Scanner(System.in);
   //public static String judging;
  //public static  String perceiving;
 //public static   String extrovert;
 //public static  String introvert;
   //public static String thinker;
    //public  static String feeler;
    //public static String intuition;
    //public static  String sensitive;
    public static void main(String[] args) {
        questionMethod();

    }


    public static void questionMethod() {
        String[] questions = new String[20];
        questions[0] = """
                A expand energy,enjoy groups
                B conserve energy,enjoy one-on-one
                """;
        questions[1] = """
                A interpret literally
                B look for meaning and possibilities
                """;
        questions[2] = """
                A logical,thinking,questioning
                B empathetic,feeling,accommodating
                """;
        questions[3] = """
                A organized,orderly
                B flexible,adaptable
                """;
        questions[4] = """
                A more outgoing,thinking out loud
                B more reserved,feeling,think to yourself
                """;
        questions[5] = """
                A practical,realistic,experiential
                B imaginative,innovative,theoretical
                """;
        questions[6] = """
                A candid,straight forward,frank
                B tactful,kind,encouraging
                """;
        questions[7] = """
                A plan, schedule
                B unplanned,spontaneous
                """;
        questions[8] = """
                A seek many tasks,public activities,interactions with others
                B seek private,solitary activities with quiet to concentrate
                """;
        questions[9] = """
                A standard,usual,conventional
                B different,novel,unique
                """;
        questions[10] = """
                A firm,tend to criticize,hold the line
                B gentle,tend to appreciate,consulate
                """;
        questions[11] = """
                A regulated,structured
                B easy going "live" and "let live"
                """;
        questions[12] = """
                A external,communicative,express yourself
                B internal,reticent,keep to yourself
                """;
        questions[13] = """
                A focus on here-and-now
                B look to the future,global perspective,"big picture"
                """;
        questions[14] = """
                A tough-minded,just
                B tender-hearted,merciful
                """;
        questions[15] = """
                A preparation,plan ahead
                B go with the flow,adapt as you go
                """;
        questions[16] = """
                A active,initiate
                B reflective,deliberate
                """;
        questions[17] = """
                A facts,things,"what is"
                B ideas,dreams, "what could be," philosophical
                """;
        questions[18] = """
                A matter of fact,issue- oriented
                B sensitive,people-oriented,compassionate
                """;
        questions[19] = """
                A control,govern
                B latitude,freedom
                """;
        answerMethod(questions);
    }

    public static void answerMethod(String[] answer) {
        String[] userAnswer = new String[20];
        int count = 1;
        System.out.println("Pick an Option A or B");
        for (int i = 0; i < 20; i++) {

            System.out.println(answer[i]);
            String userInput = scanner.nextLine();
            userAnswer[i] = userInput;

        }
        System.out.println("user response:" + Arrays.toString(userAnswer));

        checkForExtroversionAndIntroversion(userAnswer);
        checkForSensitiveAndIntuition(userAnswer);
        checkForThinkerAndFeeler(userAnswer);
        checkForJudgingAndPerceiving(userAnswer);
       // if (Objects.equals(userAnswer[i],extrovert,sensitive,thinker,judging))
          //  System.out.println("ESTJ -You are a Director");

    }
    public static void checkForExtroversionAndIntroversion(String[] question) {

        String extrovert = "A";
        String introvert = "B";
        int extrovertCounter = 0;
        int introvertCounter = 0;
        for (int i = 1; i < question.length; i += 4) {
            if (Objects.equals(question[i], extrovert)) {
                extrovertCounter++;
            } else {
                introvertCounter++;
            }
        }
        if (extrovertCounter > introvertCounter) {
            System.out.println("Extrovert");
        } else {
            System.out.println("Introvert");
        }
    }

    public static void checkForSensitiveAndIntuition(String[] question) {
        String sensitive = "A";
        String intuition = "B";
        int sensitiveCounter = 0;
        int intuitionCounter = 0;
        for (int i = 2; i < question.length; i += 4) {
            if (Objects.equals(question[i], sensitive)) {
                sensitiveCounter++;
            } else {
                intuitionCounter++;
            }
        }
        if (sensitiveCounter > intuitionCounter) {
            System.out.println("Sensitive");
        } else {
            System.out.println("Intuition");
        }


    }

    public static void checkForThinkerAndFeeler(String[] question) {
        String thinker = "A";
        String feeler = "B";
        int thinkerCounter = 0;
        int feelerCounter = 0;
        for (int i = 3; i < question.length; i += 4) {
            if (Objects.equals(question[i], thinker)) {
                thinkerCounter++;
            } else {
                feelerCounter++;
            }
        }
        if (thinkerCounter > feelerCounter) {
            System.out.println("Thinker");
        } else {
            System.out.println("Feeler");
        }

    }

    public static void checkForJudgingAndPerceiving(String[] question) {
        String judging = "A";
        String perceiving = "B";
        int judgingCounter = 0;
        int perceivingCounter = 0;
        for (int i = 4; i < question.length; i += 4) {
            if (Objects.equals(question[i], judging)) {
                judgingCounter++;
            } else {
                perceivingCounter++;
            }
        }
        if (judgingCounter > perceivingCounter) {
            System.out.println("Judging");
        } else {
            System.out.println("Perceiving");
        }
    }
}
