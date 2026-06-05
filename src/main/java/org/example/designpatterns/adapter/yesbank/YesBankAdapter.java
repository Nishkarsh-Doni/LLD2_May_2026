package org.example.designpatterns.adapter.yesbank;
import org.example.designpatterns.adapter.AccountType;
import org.example.designpatterns.adapter.BankAPI;

/**
 * YesBankAdapter — the Adapter that bridges BankAPI ↔ YesBank.
 *
 * This class:
 * 1. Implements OUR interface (BankAPI) — so PhonePe can use it
 * 2. Contains an instance of the third-party class (YesBank)
 * 3. Translates each BankAPI call into the corresponding YesBank call,
 *    filling in defaults for extra parameters that YesBank requires
 *
 * If Yes Bank updates their API, ONLY this class needs to change.
 * PhonePe and BankAPI remain untouched.
 */
public class YesBankAdapter implements BankAPI {
    private final YesBank yesBank;

    public YesBankAdapter(YesBank yesBank) {
        this.yesBank = yesBank;
    }

    @Override
    public void addBankAccount(String accountNumber, String holderName) {
        // Adapt: our interface does not need branch, but yesbank needs it
        yesBank.yesRegister(accountNumber, holderName, "MAIN");
    }

    @Override
    public boolean pay(double amount, String account) {
        return yesBank.yesPayment(amount, account, "NEFT");
    }

    @Override
    public double checkBalance(String account) {
        return yesBank.yesCheckBalance(account, AccountType.SAVINGS);
    }

    @Override
    public void transferFunds(String sourceAccount, String destinationAccount, double amount) {
        yesBank.yesTransferInternal(sourceAccount, destinationAccount, amount, "IMPS");
    }
}
