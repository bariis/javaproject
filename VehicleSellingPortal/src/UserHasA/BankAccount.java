/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserHasA;

import java.io.Serializable;

/**
 *
 * @author brktrksvr
 */
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
