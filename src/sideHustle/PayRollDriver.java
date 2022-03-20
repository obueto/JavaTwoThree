package sideHustle;

public class PayRollDriver {
    public static void main(String[] args) {
        PayRoll employeeOne = new PayRoll("James Brown",22);
        employeeOne.setHoursWorked(70.5);
        employeeOne.setPayRate(8.20);

        System.out.println("Pay roll info" +" \n"+
        "Name :" + employeeOne.getName() + "\n"
        + "Id number :"+ employeeOne.getIdNumber() + "\n"
        + "Hours worked :" + employeeOne.getHoursWorked() + "\n"
        + "Pay rate :" + employeeOne.getPayRate()+ "\n"+
                "Gross Pay :" + employeeOne.getGrossPay());

    }
}
