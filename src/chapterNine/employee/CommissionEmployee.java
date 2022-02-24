package chapterNine.employee;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;
    public CommissionEmployee(String firstName, String lastName, int securityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, securityNumber);
        if(grossSales < 0.0){
            throw new IllegalArgumentException("gross pay must be greater than 0.0");}
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("commission pay must be greater than 0.0 and less than 1.0");}
            this.grossSales = grossSales;
            this.commissionRate = commissionRate;
        }
public void  setGrossSales(double grossSales){if(grossSales < 0.0){
    throw new IllegalArgumentException("gross pay must be greater than 0.0");}
    this.grossSales = grossSales;
}

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate){
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("commission pay must be greater than 0.0 and less than 1.0");}
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s %f %f",super.toString(),getGrossSales(),getCommissionRate());
    }

}
