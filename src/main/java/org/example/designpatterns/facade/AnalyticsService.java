package org.example.designpatterns.facade;

/**
 * AnalyticsService — Subsystem class for sales tracking.
 *
 * Records sales data for business intelligence.
 */
public class AnalyticsService {

    public void recordSale(String item, double price) {
        System.out.println("[Analytics] Sale recorded: " + item + " for ₹" + price);
    }

    public void recordCancellation(String item, double price) {
        System.out.println("[Analytics] Cancellation recorded: " + item + " for ₹" + price);
    }
}
