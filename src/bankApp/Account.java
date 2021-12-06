package bankApp;

public class Account {
    private String name;
    private  String pin;
    private int balance = 50_000;

    public Account (String accountName, String accountPin)  {
        name = accountName;
                pin = accountPin;
    }
    public String getAccountName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getDeposit() {
        balance = balance + 5_000;
        return balance ;
    }

    public int getWithdrawal(int amount, String pin) {
        if (amount <= balance)
                    balance = balance - amount;
 return balance;

    }
}
