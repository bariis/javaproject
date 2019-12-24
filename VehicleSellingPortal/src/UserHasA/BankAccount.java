package UserHasA;

import java.io.Serializable;


public class BankAccount  implements Serializable {
    private double accountBalance = 0;

    public BankAccount(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    
}
