package org.example.designpatterns.adapter.razorpay;


import org.example.designpatterns.adapter.BankAPI;

/**
 * RazorpayAdapter — Adapter that bridges BankAPI ↔ RazorpayAPI.
 *
 * This adapter demonstrates that translation logic can be MORE than
 * just method renaming. The pay() method orchestrates TWO Razorpay
 * calls (createOrder → capturePayment) to fulfill one BankAPI call.
 *
 * Adding this adapter required ZERO changes to PhonePe or BankAPI.
 */
public class RazorpayAdapter implements BankAPI {
    private final RazorpayAPI razorpayAPI;

    public RazorpayAdapter(RazorpayAPI razorpayAPI) {
        this.razorpayAPI = razorpayAPI;
    }

    @Override
    public void addBankAccount(String accountNumber, String holderName) {

    }

    @Override
    public boolean pay(double amount, String account) {
        return false;
    }

    @Override
    public double checkBalance(String account) {
        return 0;
    }

    @Override
    public void transferFunds(String sourceAccount, String destinationAccount, double amount) {

    }
}
