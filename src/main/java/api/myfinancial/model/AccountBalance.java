package api.myfinancial.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountBalance {
    private double balance;

    public AccountBalance(double initialBalance) {
        this.balance = initialBalance;
    }

    public void addExpense(double amount) {
        this.balance -= amount;
    }

    public void addIncome(double amount) {
        this.balance += amount;
    }
}
