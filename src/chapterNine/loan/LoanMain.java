package chapterNine.loan;

import java.util.Scanner;

public class LoanMain {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

       System.out.println("Enter the principal");
        double principal = scanner.nextDouble();
        System.out.println("Enter the tenure of the loan");int tenure = scanner.nextInt();

        PersonalLoan loan = new PersonalLoan(principal,tenure);
        System.out.printf("The loan amount for personal loan is %.2f\n ",loan.calculateLoanAmount());
        System.out.printf("The monthly installment for the Personal loan is %.2f\n", loan.getMonthlyInstallments());

        Loan vehicleLoan = new VehicleLoan(principal,tenure);
        System.out.printf("The loan amount for vehicle loan is %.2f\n ", vehicleLoan.calculateLoanAmount()) ;
        System.out.printf("The monthly installments of the  vehicle loan is %.2f\n", vehicleLoan.getMonthlyInstallments());

        Loan houseLoan = new HomeLoan(principal,tenure);
        System.out.printf("The loan amount for house loan is %.2f\n ", houseLoan.calculateLoanAmount()) ;
        System.out.printf("The monthly installments for house loan is %.2f\n", houseLoan.getMonthlyInstallments());


    }


}
