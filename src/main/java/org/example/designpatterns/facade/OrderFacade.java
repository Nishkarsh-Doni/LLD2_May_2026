package org.example.designpatterns.facade;

import org.example.designpatterns.facade.subsystems.*;

public class OrderFacade {
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final NotificationService notificationService;
    private final LogisticsService logisticsService;
    private final AnalyticsService analyticsService;

    public OrderFacade(InventoryService inventoryService,
                       PaymentService paymentService,
                       NotificationService notificationService,
                       LogisticsService logisticsService,
                       AnalyticsService analyticsService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
        this.logisticsService = logisticsService;
        this.analyticsService = analyticsService;
    }

    public boolean placeOrder(String item, double price, String customer) {
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║     Processing Order...          ║");
        System.out.println("╚══════════════════════════════════╝");

        // Step 1: Check inventory
        if (!inventoryService.checkStock(item)) {
            System.out.println("❌ Order failed: Item out of stock");
            return false;
        }

        // Step 2: Process payment
        if (!paymentService.processPayment(customer, price)) {
            System.out.println("❌ Order failed: Payment declined");
            return false;
        }

        // Step 3: Update inventory
        inventoryService.reduceStock(item, 1);

        // Step 4: Notify seller
        notificationService.notifySeller(item, customer);

        // Step 5: Schedule delivery
        logisticsService.scheduleDelivery(item, customer);

        // Step 6: Send buyer confirmation
        notificationService.sendConfirmation(customer, item);

        // Step 7: Record analytics
        analyticsService.recordSale(item, price);

        System.out.println("✅ Order placed successfully!");
        return true;
    }
}
