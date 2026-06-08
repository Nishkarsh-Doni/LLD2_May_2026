package org.example.designpatterns.decorator;

/**
 * StrawberryTopping — Concrete Decorator (add-on / topping).
 *
 * Wraps an existing IceCream and adds strawberry topping.
 */
public class StrawberryTopping implements IceCream {

    private static final double COST = 15.0;

    private final IceCream iceCream;

    public StrawberryTopping(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return COST + iceCream.getCost();
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Strawberry Topping";
    }
}
