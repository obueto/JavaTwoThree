package chapterSeventeen;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.printf("sum of 1 to 20 is : %d%n", IntStream.rangeClosed(1,20)
                .sum());
    }
}
