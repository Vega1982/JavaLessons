package Lesson19;

import java.math.BigDecimal;

public class EntityAccount {
    private BigDecimal balance = BigDecimal.ZERO;

    public void withdraw(BigDecimal money) {
        this.balance = this.balance.subtract(money);

    }

    public void deposit(BigDecimal money) {

        this.balance = this.balance.add(money);

    }
    @WithdrawDenied(withdrawMethod = "withdraw")
    private void print() {

        System.out.println("Баланс юр.лица: " + this.balance);

    }
}
