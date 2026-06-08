package org.example.designpatterns.decorator;

/**
 * ChocolateSyrup — Concrete Decorator (add-on / topping).
 *
 * Wraps an existing IceCream and adds chocolate syrup to it.
 * This MUST wrap something — you can't have syrup without a cone.
 */
public class ChocolateSyrup implements IceCream {

    private static final double COST = 20.0;
    private final IceCream iceCream;

    public ChocolateSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return COST + iceCream.getCost();
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " " + "Chocolate Syrup";
    }
}
