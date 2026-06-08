package org.example.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * BulletTypeFactory — Flyweight Factory.
 *
 * Caches and reuses BulletType instances so that only ONE object
 * exists per bullet type (e.g. "AKM", "M416", "AWM").
 *
 * This is the core of the Flyweight pattern:
 *   - If a BulletType with the given name already exists → return it.
 *   - Otherwise → create it, cache it, and return it.
 *
 * Without this factory, every bullet would carry its own
 * copy of the image and shared attributes (~1 KB each).
 */
public class BulletTypeFactory {

}
