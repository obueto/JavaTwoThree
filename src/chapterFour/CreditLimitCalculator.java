package chapterFour;

public class CreditLimitCalculator {

    public static int calculateNewBalance(int accountNumber, int beginningBalance,
                                          int charges, int credits, int creditLimit) {
        int newBalance = beginningBalance + charges - credits;
        {
            if (newBalance > creditLimit)
                System.out.println("Credit Limit exceeded");
        }

        return newBalance;
    }



    public static void main(String[] args) {
    int newBal= calculateNewBalance(492334,5000,3200,2500,4700);
        System.out.println("Your new balance is:  "+newBal );
    }
    }
