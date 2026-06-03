package org.example.designpatterns.factory.ui;

import org.example.designpatterns.factory.ui.android.AndroidUIFactory;
import org.example.designpatterns.factory.ui.ios.IosUIFactory;

/**
 * UIFactoryFactory — Simple (Practical) Factory.
 *
 * Centralizes the if/else (or switch) logic for choosing the correct
 * UIFactory implementation based on the platform.
 *
 * The advantage: this is the ONLY place in the entire codebase where
 * we decide which factory to create. All other code just uses the
 * UIFactory interface.
 */
public class UIFactoryFactory {

    /**
     * Returns the correct UIFactory for the given platform.
     * This is the "one place" where the if/else lives.
     */
    public static UIFactory createUIFactory(SupportedPlatforms platform) {
        return switch (platform) {
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
        };
    }
}
