package chapterNine.employee;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("James","Brown",459088,56.98,0.30);
        System.out.println(commissionEmployee);
        System.out.printf("Employee earnings %.2f\n " , commissionEmployee.earnings());

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Azziz", "Lekan",45090,30,200);
        System.out.println(hourlyEmployee);
        System.out.printf("Employee hourly earnings %.2f",hourlyEmployee.earnings());
    }
}
