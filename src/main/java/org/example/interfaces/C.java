package org.example.interfaces;

public interface C extends A{
    default void print() {
        System.out.println("C");
    }
}
