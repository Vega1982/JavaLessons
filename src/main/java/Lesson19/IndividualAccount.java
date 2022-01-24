package Lesson19;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

//@Getter
//@ToString
//@RequiredArgsConstructor
public class IndividualAccount {
    private BigDecimal balance = BigDecimal.ZERO;

    public void withdraw(BigDecimal money) {
        this.balance = this.balance.subtract(money);

    }

    public void deposit(BigDecimal money) {

        this.balance = this.balance.add(money);

    }

    private void print() {

        System.out.println("Баланс физ. лица: " + this.balance);

    }
}
