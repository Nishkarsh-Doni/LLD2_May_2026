package org.example.designpatterns.decorator.v1;

import java.util.List;

public class IceCream {
    List<Cone> cones;
    List<Topping> toppings;

    double getCost() {
        double total = 0;
        for (Cone c: cones) total += c.getCost();
        for (Topping t: toppings) total += t.getCost();
        return total;
    }

    String getDescription() {
        return "";
    }
}
