package org.example.designpatterns.decorator;

import org.example.designpatterns.decorator.v1.Cone;

/**
 * OrangeCone — Concrete Component (base cone).
 *
 * This is the starting point of any ice cream.
 * You MUST begin with a cone before adding toppings or syrups.
 *
 * It can also act as a decorator: if you wrap an existing IceCream
 * with an OrangeCone, you get a second cone layer on top
 * (the lecture's edge case: "cone → topping → cone → topping").
 */
public class OrangeCone implements IceCream {

    private static final double COST = 30.0;
    private final IceCream iceCream;

    // Base Constructor - the very first layer
    OrangeCone() {
        this.iceCream = null;
    }

    // Decorator Constructor - wraps an existing ice cream
    OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        if (iceCream == null) return COST;
        return COST + iceCream.getCost();// new cost(orange cone) + exiting layer(icecream)
    }

    @Override
    public String getDescription() {
        if (iceCream == null) return "Orange Cone";
        return iceCream.getDescription() + " " + "Orange Cone ";
    }
}
