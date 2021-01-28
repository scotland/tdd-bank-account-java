package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(1000);
        assertThat(account.balance()).isEqualTo(1000);
    }

    @Test
    public void withdrawAnAmountToDecreaseTheBalance(){
        Account account = new Account();
        account.withdraw(200);
        assertThat(account.balance()).isEqualTo(-200);
    }
}
