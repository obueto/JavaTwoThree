package chapterNine.loan;

public class PersonalLoan extends Loan{

    double interestRate = 0.36;
    public PersonalLoan(double principalAmount, int tenure) {
        super(principalAmount, tenure);
        this.interestRate = interestRate;
    }
    @Override
    public double calculateLoanAmount(){
        return getPrincipalAmount() * (1 + interestRate * getTenure());
    }
    @Override
    public double getMonthlyInstallments(){
        return calculateLoanAmount() / (getTenure() * 12);
    }

}
