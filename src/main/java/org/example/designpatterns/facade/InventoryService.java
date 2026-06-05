package org.example.designpatterns.facade;

/**
 * InventoryService — Subsystem class for stock management.
 *
 * Part of the order-processing subsystem. The OrderFacade
 * orchestrates calls to this service along with other subsystems.
 */
public class InventoryService {

    public boolean checkStock(String item) {
        System.out.println("[Inventory] Checking stock for: " + item);
        return true; // Simplified — always in stock for demo
    }

    public void reduceStock(String item, int quantity) {
        System.out.println("[Inventory] Reduced stock of " + item + " by " + quantity);
    }

    public void restoreStock(String item, int quantity) {
        System.out.println("[Inventory] Restored stock of " + item + " by " + quantity);
    }
}
