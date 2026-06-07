package org.example.designpatterns.facade.subsystems;

/**
 * PaymentService — Subsystem class for payment processing.
 *
 * Part of the order-processing subsystem. Handles charging
 * customers and processing refunds.
 */
public class PaymentService {

    public boolean processPayment(String customer, double amount) {
        System.out.println("[Payment] Processing ₹" + amount + " for " + customer);
        return true; // Simplified — always succeeds for demo
    }

    public void refund(String customer, double amount) {
        System.out.println("[Payment] Refunding ₹" + amount + " to " + customer);
    }
}
