package org.example.designpatterns.facade;

/**
 * Client — demonstrates the Facade Design Pattern.
 *
 * Shows how the OrderFacade hides the complexity of 5 subsystem
 * services behind simple placeOrder() and cancelOrder() methods.
 *
 * The OrderController (client) depends on exactly ONE class
 * instead of five, and the orchestration logic lives in ONE place.
 */
public class Client {

    public static void main(String[] args) {

        // ── Create subsystem services ──
        InventoryService inventory = new InventoryService();
        PaymentService payment = new PaymentService();
        NotificationService notification = new NotificationService();
        LogisticsService logistics = new LogisticsService();
        AnalyticsService analytics = new AnalyticsService();

        // ── Create Facade — hides all subsystem complexity ──


        // ── Create Controller — knows nothing about subsystems ──


        System.out.println("════════════════════════════════════════");
        System.out.println("  DEMO 1: Facade Pattern");
        System.out.println("         (Place Order)");
        System.out.println("════════════════════════════════════════");
        System.out.println();

        // ── Place an order — 7 steps, ONE method call ──


        System.out.println();
        System.out.println("════════════════════════════════════════");
        System.out.println("  DEMO 2: Facade Pattern");
        System.out.println("         (Cancel Order)");
        System.out.println("════════════════════════════════════════");
        System.out.println();

        // ── Cancel an order — 5 reversal steps, ONE method call ──

        System.out.println();
        System.out.println("════════════════════════════════════════");
        System.out.println("  DEMO 3: Facade Reuse");
        System.out.println("         (Another Order from Different Entry Point)");
        System.out.println("════════════════════════════════════════");
        System.out.println();

        // ── Demonstrate reuse — any client can use the same Facade ──
        System.out.println("(Simulating a bulk order endpoint reusing the same Facade)");
        System.out.println();

        System.out.println();
        System.out.println("════════════════════════════════════════");
        System.out.println("  KEY TAKEAWAY");
        System.out.println("════════════════════════════════════════");
        System.out.println();
        System.out.println("OrderController has 1 dependency (OrderFacade)");
        System.out.println("  instead of 5 (Inventory, Payment, Notification, Logistics, Analytics).");
        System.out.println("The 7-step workflow lives in ONE place and is reusable.");
        System.out.println("Complexity isn't eliminated — it's organized.");
    }
}
