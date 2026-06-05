package org.example.designpatterns.adapter;


import org.example.designpatterns.adapter.razorpay.RazorpayAPI;
import org.example.designpatterns.adapter.razorpay.RazorpayAdapter;
import org.example.designpatterns.adapter.yesbank.YesBank;
import org.example.designpatterns.adapter.yesbank.YesBankAdapter;

/**
 * Client — demonstrates the Adapter Design Pattern.
 *
 * Shows how PhonePe can work with completely different bank APIs
 * (Yes Bank and Razorpay) through a common BankAPI interface,
 * without ANY changes to the PhonePe class.
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("════════════════════════════════════════");
        System.out.println("  DEMO 1: Adapter Pattern");
        System.out.println("         (PhonePe + Yes Bank)");
        System.out.println("════════════════════════════════════════");
        System.out.println();

        // ── Using Yes Bank ──
        System.out.println("--- Yes Bank ---");
        YesBank yesBank = new YesBank();
        BankAPI yesBankApi = new YesBankAdapter(yesBank);
        PhonePe phonePeWithYesBank = new PhonePe(yesBankApi);
        phonePeWithYesBank.makePayment(500.0, "ACC-001");

        System.out.println();
        System.out.println("════════════════════════════════════════");
        System.out.println("  DEMO 2: Adapter Pattern");
        System.out.println("         (PhonePe + Razorpay)");
        System.out.println("════════════════════════════════════════");
        System.out.println();

        // ── Switch to Razorpay — ZERO changes to PhonePe! ──
        RazorpayAPI razorpay = new RazorpayAPI();
        BankAPI razorpayBankApi = new RazorpayAdapter(razorpay);
        PhonePe phonePeWithRazorpay = new PhonePe(razorpayBankApi);
        phonePeWithRazorpay.makePayment(700.0, "ACC-02");

        System.out.println();
        System.out.println("════════════════════════════════════════");
        System.out.println("  KEY TAKEAWAY");
        System.out.println("════════════════════════════════════════");
        System.out.println();
        System.out.println("PhonePe class was IDENTICAL in both demos.");
        System.out.println("Only the adapter (and its adaptee) changed.");
        System.out.println("Adding a new bank = adding a new adapter.");
        System.out.println("Zero changes to PhonePe or BankAPI.");
    }
}
