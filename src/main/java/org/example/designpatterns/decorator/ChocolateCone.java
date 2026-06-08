package org.example.designpatterns.decorator;

/**
 * ChocolateCone — Concrete Component (base cone).
 *
 * A chocolate-flavoured cone. Like OrangeCone, it can be the
 * starting point of an ice cream OR decorate an existing one.
 */
public class ChocolateCone implements IceCream {

    private static final double COST = 40.0;

    private final IceCream iceCream;

    public ChocolateCone() {
        this.iceCream = null;
    }

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        if (iceCream == null) {
            return COST;
        }
        return COST + iceCream.getCost();
    }

    @Override
    public String getDescription() {
        if (iceCream == null) {
            return "Chocolate Cone";
        }
        return iceCream.getDescription() + " + Chocolate Cone";
    }
}
