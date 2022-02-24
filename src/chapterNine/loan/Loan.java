package chapterNine.loan;

public class Loan {
    private double principalAmount;
    private int tenure;
    private double interestRate;

    public Loan(double principalAmount, int tenure){
        this.principalAmount = principalAmount;
        this.tenure = tenure;

    }

    public double calculateLoanAmount(){
        return getPrincipalAmount() * (1 + interestRate * getTenure());
    }

    public double getMonthlyInstallments(){
        return calculateLoanAmount() / (getTenure() * 12);
    }



    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
