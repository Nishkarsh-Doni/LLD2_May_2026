package org.example.designpatterns.factory.database.mysql;


import org.example.designpatterns.factory.database.Transaction;

/**
 * MySQLTransaction — MySQL-specific transaction implementation.
 */
public class MySQLTransaction implements Transaction {

    @Override
    public void begin() {
        System.out.println("[MySQL] BEGIN TRANSACTION");
    }

    @Override
    public void commit() {
        System.out.println("[MySQL] COMMIT");
    }

    @Override
    public void rollback() {
        System.out.println("[MySQL] ROLLBACK");
    }
}
