package org.example.designpatterns.decorator;

/**
 * VanillaScoop — Concrete Decorator (add-on / topping).
 *
 * Wraps an existing IceCream and adds a vanilla scoop.
 */
public class VanillaScoop implements IceCream {

    private static final double COST = 25.0;

    private final IceCream iceCream;

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return COST + iceCream.getCost();
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Vanilla Scoop";
    }
}
