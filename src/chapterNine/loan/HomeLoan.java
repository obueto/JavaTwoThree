package chapterNine.loan;

public class HomeLoan extends Loan{

    double interestRate = 0.08;
    public HomeLoan(double principalAmount, int tenure) {
        super(principalAmount, tenure);
        this.interestRate = interestRate;
    }

    public double calculateLoanAmount(){
        return getPrincipalAmount() * (1 + interestRate * getTenure());
    }

    public double getMonthlyInstallments(){
        return calculateLoanAmount() / (getTenure() * 12);
    }
}
