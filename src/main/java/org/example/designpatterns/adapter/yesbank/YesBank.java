package org.example.designpatterns.adapter.yesbank;

import org.example.designpatterns.adapter.AccountType;

/**
 * YesBank — the Adaptee (third-party class).
 *
 * This represents Yes Bank's actual API. Note the different method names,
 * parameter orders, and extra parameters compared to our BankAPI interface.
 *
 * We do NOT control this class — it's a third-party dependency.
 * We cannot make it implement our BankAPI interface.
 */
public class YesBank {

    public boolean yesPayment(double amount, String account, String mode) {
        System.out.println("[YesBank] Payment of ₹" + amount + " to " + account + " via " + mode);
        return true;
    }

    public double yesCheckBalance(String account, AccountType accountType) {
        System.out.println("[YesBank] Checking " + accountType + " balance for " + account);
        return 15000.00;
    }

    public void yesTransferInternal(String from, String to, double amount, String mode) {
        System.out.println("[YesBank] Transferring ₹" + amount + " from " + from + " to " + to + " via " + mode);
    }

    public void yesRegister(String account, String name, String branch) {
        System.out.println("[YesBank] Registered account " + account + " for " + name + " at " + branch);
    }
}
