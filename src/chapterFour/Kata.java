package chapterFour;

public class Kata {
    public  char studentGrade(int score) {

        char result = ' ';
        if (score>90)
            result = 'A';
        if(score >= 80 && score <= 89 )
                result = 'B';
            if(score >= 70 && score <= 79 )
                result = 'C';
                if(score >= 60 && score <= 69 )
                        result = 'D';
                    if(score < 60)
                        result = 'F';

        return result;
    }
}









      //  int score;


        //Scanner input = new Scanner (System.in);

        //System.out.println (" Enter student score");
        //score = input.nextInt();


        //if (score >90){
          //  System.out.printf(" A is %d%n",score);
            //System.out.print("Best result");
        //}else
        //if (score >= 80 ){
          //  System.out.printf(" B is %d%n",score);
        //}
        //else if (score >= 70 ){
          //  System.out.printf("C is %d%n",score);
        //}
        //else if (score >= 60) {
          //  System.out.printf("D is %d%n",score);
        //}
        //else System.out.printf("F is %d%n",score);

    //}
