package org.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Amazon — Publisher (Subject) in the Observer pattern.
 *
 * Maintains a list of OrderPlacedSubscriber objects and notifies
 * all of them whenever an order is placed. Subscribers can
 * register and unregister themselves at any time — even at runtime.
 *
 * Key advantages over the Facade approach:
 * ✅ New subscribers can be added WITHOUT modifying this class
 * ✅ Subscribers can register/unregister at RUNTIME
 * ✅ Open-Closed Principle: open for extension, closed for modification
 */
public class Amazon {
    public void orderPlaced(String orderId) {

    }

}
