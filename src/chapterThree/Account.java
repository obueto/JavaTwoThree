package chapterThree;

public class Account {
    private String name;
    private double balance;
    public Account(String name, double balance){
      this.name = name;

        this.balance= balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        balance = balance + deposit;
        this.balance = balance;
    }

    public  void withdrawal(double withdrawal){
        if (withdrawal > balance){
           this.balance = balance;
            System.out.println("Withdrawal Amount Exceeded Account Balance");
        }
        else {
            balance = balance - withdrawal;
            this.balance = balance;
        }

    }
}
