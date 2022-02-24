package chapterEight;

import java.util.List;

public class Bank {
    private String bankName;
    private String sortCode;
private List<Customer>customers;
Bank(String bankName,String sortCode, List<Customer> customers){
    this.bankName = bankName;
    this.sortCode = sortCode;
    this.customers =customers;
}
}
