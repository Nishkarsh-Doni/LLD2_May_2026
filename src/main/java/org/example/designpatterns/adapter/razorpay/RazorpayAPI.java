package org.example.designpatterns.adapter.razorpay;

/**
 * RazorpayAPI — a second Adaptee (third-party class).
 *
 * Razorpay has a completely different API from Yes Bank:
 * - Different method names (rzpCreateOrder, rzpCapturePayment, etc.)
 * - Different parameters (currency, receipt, merchantId, etc.)
 * - Different workflows (payment requires two steps: create order + capture)
 *
 * This demonstrates that Adapters can handle arbitrarily different
 * third-party APIs — not just simple method renames.
 */
public class RazorpayAPI {

    public String rzpCreateOrder(double amount, String currency, String receipt) {
        System.out.println("[Razorpay] Order created: ₹" + amount + " [" + currency + "]");
        return "order_" + System.currentTimeMillis();
    }

    public boolean rzpCapturePayment(String orderId, double amount) {
        System.out.println("[Razorpay] Payment captured: ₹" + amount + " for " + orderId);
        return true;
    }

    public double rzpFetchBalance(String merchantId) {
        System.out.println("[Razorpay] Fetching balance for merchant " + merchantId);
        return 42000.00;
    }

    public void rzpTransfer(String from, String to, double amount, String currency) {
        System.out.println("[Razorpay] Transfer: ₹" + amount + " from " + from + " to " + to);
    }

    public void rzpAddAccount(String merchantId, String name) {
        System.out.println("[Razorpay] Account added for " + name + " [Merchant: " + merchantId + "]");
    }
}
