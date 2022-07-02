package sideHustle;

import java.util.ArrayList;

public class MainCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Jay",54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer:  " + customer.getBalance());
        System.out.println("Balance: "+ anotherCustomer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + ":" + intList.get(i));
        }







    }


}
