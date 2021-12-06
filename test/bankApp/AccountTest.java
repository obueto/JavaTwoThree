package bankApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {
  @Test
    public void accountNameCreation() {
      Account judithAccount = new Account("Jay", "3456");
      String accountName = judithAccount.getAccountName();
      assertEquals("Jay",accountName);

    }
    @Test
    public void balanceInAccountCreated50K (){
    Account judithAccount = new Account("Jay", "3456");
    int balance = judithAccount.getBalance ();
    assertEquals( 50_000,balance);
    }

    @Test
    public void depositInAccountCreated5k () {
    Account judithAccount = new Account( " Jay", "3456");
    int deposit = judithAccount.getDeposit();
    assertEquals(deposit, 55000);
    }
    @Test
    public void withdrawalWithNegativeAmount () {
    Account judithAccount = new Account( "Jay", "3456");
    int withdrawal = judithAccount.getWithdrawal( -45_000,"3456");
    assertEquals(withdrawal, 55_000 );
    }
}
