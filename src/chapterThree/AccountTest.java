package chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account judithAccount = new Account("Judith",1000000);
        displayAmount(judithAccount);
        System.out.println("Enter deposit Amount: ");
        double deposit = input.nextDouble();
        judithAccount.deposit(deposit);
        System.out.printf("Adding %.2f to the balance%n",deposit);
       displayAmount(judithAccount);
        System.out.println("Enter withdrawal amount: ");
        double withdrawal = input.nextDouble();
        System.out.printf("Removing %.2f from the balance%n", withdrawal);
        judithAccount.withdrawal(withdrawal);
        displayAmount(judithAccount);
    }

    public static void displayAmount(Account judithAccount){
        System.out.printf("%s Balance: %.2f%n",judithAccount.getName(),judithAccount.getBalance());
    }


}
