package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {
    @Test
    public void totalTest(){
        int [] numbers = {1,2,3,4,5};
        TwoSum twoSum = new TwoSum();
        int total = twoSum.calculateTotalOf(numbers);
        assertEquals(15,total);
    }
    @Test
    public void averageTest(){
        int[] numbers = {1,2,3,4,5};
        TwoSum twoSum = new TwoSum();
        double average = twoSum.calculateAverageOf(numbers);
        assertEquals(3.0,average);
    }
    @Test
    public void minimumTest(){
        int[] numbers = {1,2,3,4,5};
        TwoSum twoSum = new TwoSum();
        int minimum = twoSum.minimumOf(numbers);
        assertEquals(1,minimum);
    }
@Test
    public  void maximumTest(){
        int[] numbers = {1,2,3,4,5};
        TwoSum twoSum = new TwoSum();
        int maximum = twoSum.maximumOf(numbers);
        assertEquals(5,maximum);
    }
    @Test
    public void lessCanCalculateMaximumTest () {
        int [] numbers = {1,2,3,4,5};
        TwoSum twoSum = new TwoSum();
    int lessMax = twoSum.lessCanCalculateMaxOf(numbers);
    assertEquals(14,lessMax);
    }
    @Test
    public void lessCanCalculateMinimumTest (){
        int []numbers = {1,2,3,4,5};
        TwoSum twoSum = new TwoSum();
        int lessMin = twoSum.lessCanCalculateTheMinOf(numbers);
        assertEquals(10,lessMin);

    }
}
