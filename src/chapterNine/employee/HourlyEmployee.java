package chapterNine.employee;

public class HourlyEmployee extends Employee {
    private double hours;
    private double hourlyWage;

    public HourlyEmployee(String firstName, String lastName, int securityNumber, double hours, double hourlyWage) {
        super(firstName, lastName, securityNumber);
        this.hours = hours;
        this.hourlyWage = hourlyWage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("total number of hours in a week is between 0 - 168");}
            this.hours = hours;

    }


    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage < 0.0) {
            throw new IllegalArgumentException("hourly wage should not be negative value");}

        this.hourlyWage = hourlyWage;
    }
        public double getHourlyWage() {
            return hourlyWage;
        }

    @Override
    public double earnings() {
        if (hours > 40){
        return (hourlyWage * hours) * 1.5;
        }
        return hourlyWage * hours ;
    }

    @Override
    public String toString() {
        return String.format(super.toString()," %d\n %f %f",getHours(),getHourlyWage());
    }
}
