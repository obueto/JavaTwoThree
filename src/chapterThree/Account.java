package chapterThree;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name =name;

        if (balance > 0.00){
            this.balance = balance;
        }
    }
public void deposit (double depositAmount){
        if(depositAmount > 0.0){
            balance = depositAmount + balance;
        }
}
public double getBalance (){
        return balance;
}
public void setName (String name){
        this.name = name;
}
public String getName(){
        return name;
}
public void withdraw (double withdrawalAmount){
        if(withdrawalAmount > balance){
            System.out.println("Withdrawal Amount exceeded account balance");
        }
}


}
