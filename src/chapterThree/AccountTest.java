package chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account firstAccount = new Account("Judith",12000);
        Account secondAccount = new Account("Deborah",3000);
displayAccount(firstAccount,secondAccount);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for first Account: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to firstAccount balance%n%n",depositAmount);
        firstAccount.deposit(depositAmount);
        displayAccount(firstAccount,secondAccount);
        System.out.println("Enter withdrawal amount for first account");
       double withdrawAmount = input.nextDouble();
        firstAccount.withdraw(withdrawAmount);
        displayAccount(firstAccount,secondAccount);
        System.out.print("Enter deposit amount for second Account");
        depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to  second Account balance%n%n",depositAmount);
        secondAccount.deposit(depositAmount);
        displayAccount(firstAccount,secondAccount);

    }
public static void displayAccount (Account firstAccount, Account secondAccount){
    System.out.printf("%s balance: $%.2f%n",firstAccount.getName(),firstAccount.getBalance());
    System.out.printf("%s balance: $%.2f%n", secondAccount.getName(),secondAccount.getBalance());
}




}
