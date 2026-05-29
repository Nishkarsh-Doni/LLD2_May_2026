package org.example.interfaces;

public interface B extends A{
    default void print() {
        System.out.println("B");
    }

    void add();
}
