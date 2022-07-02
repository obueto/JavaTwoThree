package chapterSixteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountComparatorMain {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        Account account1 = new Account(604020,"John", "Oyenma",50000);
        Account account2 = new Account(503322,"Bayo", " Adama",10000);
        Account account3 = new Account(501322,"Ben", " Ada",35000);
        Account account4 = new Account(513222,"Bode", " Akin",2500);

        accounts.add(account1);
        accounts.add(account2);

        Collections.reverseOrder(new AccountComparator());

        System.out.printf("Sorted list elements: %n%s%n", accounts.toString());
    }
}
