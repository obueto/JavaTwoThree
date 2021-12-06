package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {



    @Test
    public void aGradeCanBeCalculatedTest(){
        Kata gradeSomething = new Kata();
        char result = gradeSomething.calculateGradeFor (98);
        assertEquals('A',result);
    }
    @Test
    public void bGradeCanBeCalculatedTest(){
        Kata gradeSomething = new Kata();
        char result = gradeSomething.calculateGradeFor (89);
        assertEquals('B',result);

    }
    @Test
    public void cGradeCanBeCalculatedTest() {
        Kata gradeSomething = new Kata();
        char myResult = gradeSomething.calculateGradeFor(79);
        assertEquals('C', myResult);
    }
    @Test
    public void dGradeCanBeCalculatedTest (){
        Kata gradeSomething = new Kata();
        char myResult = gradeSomething.calculateGradeFor( 65);
        assertEquals('D', myResult);

    }
    @Test
    public void fGradeCanBeCalculatedTest () {
        Kata gradeSomething = new Kata();
        char myResult = gradeSomething.calculateGradeFor(45);
        assertEquals('F', myResult);
    }
    @Test
    public void  firstDrillerCopyTest (){
        Kata drillerCopy = new Kata();
        int quantity = drillerCopy.TotalAmountForPurchase(3);
assertEquals( 3 * 2000,quantity);
}
@Test
public void  secondDrillerCopyTest() {
    Kata drillerCopy = new Kata();
    int quantity = drillerCopy.TotalAmountForPurchase(8);
    assertEquals( 8 *1800, quantity);
  }
@Test
    public void  thirdDrillerCopyTest () {
        Kata drillerCopy = new Kata();
        int quantity = drillerCopy.TotalAmountForPurchase(27);
assertEquals(27 * 1600,quantity);
    }
@Test
    public void  fourthDrillerCopyTest() {
        Kata drillerCopy = new Kata();
        int quantity = drillerCopy.TotalAmountForPurchase(41);
assertEquals(41 * 1500, quantity);
    }
@Test
public void fifthDrillerCopyTest (){
    Kata drillerCopy = new Kata();
int quantity = drillerCopy.TotalAmountForPurchase(92);
assertEquals(92 * 1300,quantity);
}
@Test
public void sixthDrillerCopyTest () {
Kata drillerCopy = new Kata();
int quantity = drillerCopy.TotalAmountForPurchase(170);
assertEquals(170 * 1200,quantity);

}
@Test
public void seventhDrillerCopyTest () {
Kata drillerCopy = new Kata();
int quantity = drillerCopy.TotalAmountForPurchase(400);
 assertEquals(400 * 1100,quantity);

}
@Test
public void eightDrillerCopyTest (){
        Kata drillerCopy = new Kata();
    int quantity = drillerCopy.TotalAmountForPurchase(600);
    assertEquals(600 * 1000,quantity);

}





}