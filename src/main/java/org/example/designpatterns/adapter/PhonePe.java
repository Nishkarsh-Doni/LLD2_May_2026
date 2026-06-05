package org.example.designpatterns.adapter;

import org.example.designpatterns.adapter.yesbank.YesBank;

/**
 * PhonePe — the client class that uses the BankAPI interface.
 *
 * This class has ZERO knowledge of Yes Bank or Razorpay.
 * It works entirely through the BankAPI abstraction.
 *
 * Switching banks requires NO changes to this class —
 * just pass a different BankAPI implementation (adapter).
 */
public class PhonePe {
    BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    void makePayment(double amount, String account) {
        bankAPI.pay(amount, account);
    }

    double getBalance(String account) {
        return bankAPI.checkBalance(account);
    }

    void transfer(String from, String to, double amount) {
        bankAPI.transferFunds(from, to, amount);
    }
}

/*
What could go wrong with this code

1. Vendor lock-in
2. Tight coupling
3. Breaking changes
4. No Testability


PhonePe(Indian Laptop Charger)   ----  YesBankAdapter(Adapter1)  ------  YesBank (Europe wall socket)
                                ---  IciciBankAdapter(Adapter2) ---  ICICI Bank (US wall socket)

Steps
1. Define what we need (the target interface)
2. Understand what the 3rd party api provides(the adaptee)
3. Build the bridge (the Adapter)
 */
