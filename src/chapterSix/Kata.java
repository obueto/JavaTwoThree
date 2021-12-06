package chapterSix;

public class Kata {
    public char calculateGradeFor(int score)  {
        if (score >= 90) return  'A';
        if (score >= 80) return  'B';
        if (score >= 70) return  'C';
        if (score >= 60) return  'D';
        return 'F';
    }
    public int TotalAmountForPurchase (int quantity){
        if (quantity <= 4) return quantity * 2000;
        if (quantity <= 9) return  quantity * 1800;
        if (quantity <= 29) return  quantity * 1600;
        if (quantity <= 49) return  quantity * 1500;
        if (quantity <= 99) return  quantity * 1300;
        if (quantity <= 199) return  quantity * 1200;
        if (quantity <= 499) return  quantity * 1100;
        if (quantity > 500) return  quantity * 1000;
        return 0;
    }



}
