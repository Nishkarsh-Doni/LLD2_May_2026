package org.example.designpatterns.decorator;

/**
 * IceCream — Component interface for the Decorator pattern.
 *
 * Represents anything that can be part of an ice cream:
 * a base cone, a topping, a syrup, a scoop, etc.
 *
 * Every component knows its own cost and can describe itself.
 * Decorators wrap an existing IceCream and add to its cost
 * and description — exactly like stacking toppings on a cone.
 */
public interface IceCream {

    /**
     * @return the total cost of this ice cream (base + all decorations)
     */
    double getCost();

    /**
     * @return a human-readable description of all ingredients
     */
    String getDescription();
}
