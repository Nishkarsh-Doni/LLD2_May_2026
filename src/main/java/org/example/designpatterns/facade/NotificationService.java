package org.example.designpatterns.facade;

/**
 * NotificationService — Subsystem class for sending notifications.
 *
 * Handles notifying sellers about new orders and sending
 * confirmation messages to buyers.
 */
public class NotificationService {

    public void notifySeller(String item, String buyer) {
        System.out.println("[Notification] Seller notified: " + item + " ordered by " + buyer);
    }

    public void sendConfirmation(String customer, String item) {
        System.out.println("[Notification] Confirmation sent to " + customer + " for " + item);
    }

    public void sendCancellation(String customer, String item) {
        System.out.println("[Notification] Cancellation notice sent to " + customer + " for " + item);
    }
}
