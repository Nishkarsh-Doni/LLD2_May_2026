package org.example.designpatterns.adapter;

/**
 * BankAPI — Target Interface for the Adapter pattern.
 *
 * This interface defines what PhonePe (the client) needs from ANY bank.
 * PhonePe codes against this interface — never against a specific bank's API.
 *
 * Third-party banks (Yes Bank, Razorpay, etc.) have their own incompatible
 * APIs. Adapter classes bridge the gap by implementing this interface
 * and delegating to the third-party class internally.
 */
public interface BankAPI {

    /**
     * Register a bank account.
     */
    void addBankAccount(String accountNumber, String holderName);

    /**
     * Make a payment to the given account.
     *
     * @return true if the payment was successful
     */
    boolean pay(double amount, String account);

    /**
     * Check the balance of the given account.
     *
     * @return the current balance
     */
    double checkBalance(String account);

    /**
     * Transfer funds from one account to another.
     */
    void transferFunds(String sourceAccount, String destinationAccount, double amount);
}
