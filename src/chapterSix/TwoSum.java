package chapterSix;

public class TwoSum {

    public  int calculateTotalOf(int[] numbers){
        int total = 0;
        for (int i = 0; i < numbers.length; i++)
              total += numbers[i];

        return total;
    }


    public double calculateAverageOf(int[] numbers) {
        int total = calculateTotalOf(numbers);
       int length =  numbers.length;
       double average =(double) total / length;
       //double average = calculateTotalOf(numbers)/numbers.length
        return average;
    }

    public int minimumOf(int[] numbers) {
        int minimum = numbers[0];
        for (int i = 0; i < numbers.length; i++)
            minimum = Math.min(minimum,numbers[i]);
        return minimum;
    }

    public int maximumOf(int[] numbers) {
        int maximum = numbers[0];
        for (int i = 0; i < numbers.length; i++)
            maximum = Math.max(maximum,numbers[i]);
        return maximum;
    }

    public  int lessCanCalculateMaxOf(int[] numbers){
        int total = 0;
        for (int i = 0; i < numbers.length; i++)
            total += numbers[i];
                   int less1 = total-numbers[0];

        return less1;
    }

    public int lessCanCalculateTheMinOf (int []numbers){
        int total = 0;
        for (int i = 0; i < numbers.length; i++)
            total += numbers[i];
        int less = total - numbers[4];

        return less;
    }


}

