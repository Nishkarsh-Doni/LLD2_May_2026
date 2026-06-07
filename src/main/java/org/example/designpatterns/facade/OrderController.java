package org.example.designpatterns.facade;

import org.example.designpatterns.facade.subsystems.*;

public class OrderController {
    private final OrderFacade orderFacade;

    public OrderController(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    void handlePlaceOrder(String item, double price, String customer) {
        boolean success = orderFacade.placeOrder(item, price, customer);
        if (success) {
            System.out.println("Returning HTTP 200 to client");
        } else {
            System.out.println("Returning HTTP 400 Bad request to the client");
        }
    }

    void handleBulkPlaceOrder() {

    }

    void handleSmallOrders() {

    }
}

/*
Facade - front face of a building

Steps:
1. The subsystem services
2. The facade class
 */