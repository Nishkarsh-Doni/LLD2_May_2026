package org.example.designpatterns.decorator;

/**
 * Client — demonstrates the Decorator Design Pattern.
 *
 * Shows how an ice cream is built layer by layer:
 *   1. Start with a base cone (concrete component).
 *   2. Wrap it with toppings / syrups / scoops (decorators).
 *   3. Each wrapper adds to the cost and description.
 *
 * Key insight: the client never changes — it always calls
 * getCost() and getDescription() on an IceCream reference.
 * The decorators compose the behaviour at runtime.
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("════════════════════════════════════════");
        System.out.println("  DECORATOR DESIGN PATTERN");
        System.out.println("  (Ice Cream Vending Machine)");
        System.out.println("════════════════════════════════════════");

        // ─────────────────────────────────────────────
        //  DEMO 1: Simple ice cream — just a cone
        // ─────────────────────────────────────────────
        System.out.println();
        System.out.println("--- Demo 1: Just an Orange Cone ---");

        IceCream iceCream1 = new OrangeCone();

        System.out.println("  Description : " + iceCream1.getDescription());
        System.out.println("  Cost        : ₹" + iceCream1.getCost());

        // ─────────────────────────────────────────────
        //  DEMO 2: Cone + toppings (stacking decorators)
        // ─────────────────────────────────────────────
        System.out.println();
        System.out.println("--- Demo 2: Orange Cone + Chocolate Syrup + Vanilla Scoop ---");

//        IceCream iceCream2 = new OrangeCone();                   // base: ₹30
//        iceCream2 = new ChocolateSyrup(iceCream2);              // 30 + chocolate syrup cost
//        iceCream2 = new VanillaScoop(iceCream2);                // vanilla cost + (30 + chocolate syrup cost)


        IceCream iceCream2 = new VanillaScoop( // decorated with another topping
                                    new ChocolateSyrup( // decorated with topping
                                            new OrangeCone() // base icecream
                                    )
                                );


        System.out.println("  Description : " + iceCream2.getDescription());
        System.out.println("  Cost        : ₹" + iceCream2.getCost());
        // Expected: ₹75

        // ─────────────────────────────────────────────
        //  DEMO 3: Edge case — cone on top of a topping
        //  (Cone → Topping → Cone → Topping)
        // ─────────────────────────────────────────────
        System.out.println();
        System.out.println("--- Demo 3: Chocolate Cone → Strawberry → Orange Cone → Chocolate Syrup ---");

        IceCream iceCream3 = new ChocolateCone();                // base: ₹40


        System.out.println("  Description : " + iceCream3.getDescription());
        System.out.println("  Cost        : ₹" + iceCream3.getCost());
        // Expected: ₹105

        // ─────────────────────────────────────────────
        //  DEMO 4: Heavily decorated ice cream
        // ─────────────────────────────────────────────
        System.out.println();
        System.out.println("--- Demo 4: The Works (everything!) ---");

        IceCream iceCream4 = new ChocolateCone();                // base: ₹40


        System.out.println("  Description : " + iceCream4.getDescription());
        System.out.println("  Cost        : ₹" + iceCream4.getCost());
        // Expected: ₹125

        // ─────────────────────────────────────────────
        //  KEY TAKEAWAY
        // ─────────────────────────────────────────────
        System.out.println();
        System.out.println("════════════════════════════════════════");
        System.out.println("  KEY TAKEAWAY");
        System.out.println("════════════════════════════════════════");
        System.out.println();
        System.out.println("When you need to add features/properties to a base");
        System.out.println("  entity AT RUNTIME, and the final output depends on");
        System.out.println("  the base → consider the Decorator pattern.");
        System.out.println("Each decorator wraps the previous layer and delegates.");
        System.out.println("No subclass explosion. Open for extension, closed for modification.");
    }
}
