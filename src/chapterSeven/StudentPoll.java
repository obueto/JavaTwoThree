package chapterSeven;

public class StudentPoll {
    public static void main(String[] args) {
        int [] responses = {1,2,5,4,3,5,1,3,3,1,4,3,4,3,2,4,3,2,6,6,14};
        int [] frequency = new int[7];
        for(int i = 0; i < responses.length;i++){
          try{
            ++frequency[responses[i]];
        }
          catch (ArrayIndexOutOfBoundsException e){
              System.out.println(e);
              System.out.printf("response[%d] = %d%n%n",i,responses[i]);
          }
    }
        System.out.printf("%s%10s%n","Rating","Frequency");
        for (int rating = 1;rating < frequency.length;rating++){
            System.out.printf("%6d%10d%n",rating,frequency[rating]);
        }
}
}
