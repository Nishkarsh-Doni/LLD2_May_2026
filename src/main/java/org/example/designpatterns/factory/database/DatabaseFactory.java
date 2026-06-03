package org.example.designpatterns.factory.database;

/**
 * DatabaseFactory — Abstract Factory interface.
 * Contains ONLY factory methods for creating database-related objects.
 *
 * Each database implementation (MySQL, Postgres, Mongo) will have
 * its own factory that creates the correct Query/Transaction objects.
 */
public interface DatabaseFactory {

    /**
     * Create a query object for this database.
     */
    Query createQuery(String sql);

    /**
     * Create a transaction object for this database.
     */
    Transaction createTransaction();
}
