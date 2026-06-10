package org.example.designpatterns.observer;

/**
 * InventoryManagementSystem — Concrete Observer for inventory tracking.
 *
 * Automatically registers itself with the Amazon publisher
 * upon creation. When an order is placed, it decrements
 * the stock count and triggers reorder alerts if needed.
 */
public class InventoryManagementSystem implements OrderPlacedSubscriber {

    private final Amazon amazon;

    /**
     * Creates an InventoryManagementSystem and registers it with the publisher.
     *
     * @param amazon the publisher to register with
     */
    public InventoryManagementSystem(Amazon amazon) {
        this.amazon = amazon;
    }

    @Override
    public void onOrderPlaced(String orderId) {
        System.out.println("  📦 [InventoryManagement] Updating inventory for order: " + orderId);
        System.out.println("     → Decrementing stock count...");
        System.out.println("     → Checking reorder threshold...");
        System.out.println("     → Inventory updated successfully!");
    }
}
