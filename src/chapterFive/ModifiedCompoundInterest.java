package chapterFive;

public class ModifiedCompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate;
        double amount = 0;
        System.out.printf("%s\t\t %s\t\t %s %n", "Rate", "Amount on deposit", "Year");
        for (int year = 1; year <= 10; ++year) {
             for (rate = 0.05; rate <= .09; rate += 0.01) {
                amount = principal * Math.pow(1.0 + rate, year);
                 System.out.printf("%.2f %20.2f\t\t %4d %n", rate, amount, year);
            }

            System.out.println(" ");
        }
    }
}