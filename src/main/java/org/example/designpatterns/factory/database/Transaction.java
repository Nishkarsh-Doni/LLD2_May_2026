package org.example.designpatterns.factory.database;

/**
 * Transaction — interface for database transactions.
 * Different databases handle transactions differently.
 */
public interface Transaction {

    void begin();

    void commit();

    void rollback();
}
