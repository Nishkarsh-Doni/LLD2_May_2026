package org.example.designpatterns.facade;

/**
 * LogisticsService — Subsystem class for delivery scheduling.
 *
 * Handles scheduling deliveries and cancelling them.
 */
public class LogisticsService {

    public void scheduleDelivery(String item, String customer) {
        System.out.println("[Logistics] Delivery scheduled for " + item + " to " + customer);
    }

    public void cancelDelivery(String item, String customer) {
        System.out.println("[Logistics] Delivery cancelled for " + item + " to " + customer);
    }
}
