package chapterSixteen;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class AccountComparator implements Comparator<Account> {

    @Override
    public int compare(Account account1, Account account2) {
        return Double.compare(account2.getBalance(),account1.getBalance());
    }


}


