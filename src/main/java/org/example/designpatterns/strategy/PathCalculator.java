package org.example.designpatterns.strategy;

/**
 * PathCalculator — Strategy interface for the Strategy pattern.
 *
 * Defines the contract for calculating a path between two locations.
 * Each concrete implementation represents a different mode of
 * transportation (car, bike, walk, etc.) with its own pathfinding
 * algorithm and ETA calculation.
 *
 * This is the "Strategy" in the Strategy Design Pattern — the
 * common interface that all algorithms must implement.
 */
public interface PathCalculator {

    /**
     * Calculates the path between a source and destination.
     *
     * @param source      the starting location
     * @param destination the ending location
     * @return a human-readable description of the path and ETA
     */
    String findPath(String source, String destination);
}

/*
Rainwater Trapping

Brute force -> TC: O(n^2); SC: O(1)
Optimal -> TC: O(n); SC: O(n)
Most optimal -> O(n); SC: O(1)


 */
