package org.example.designpatterns.factory.database;

/**
 * Database — interface for all database implementations.
 * Contains database-specific methods only (no factory methods).
 *
 * This follows the Abstract Factory principle: database operations
 * are separated from object creation responsibilities.
 */
public interface Database {

    /**
     * Connect to the database.
     */
    void connect();

    /**
     * Change the connection pool size.
     */
    void changePoolSize(int size);

    /**
     * Get the database version.
     */
    String getVersion();

    /**
     * Factory method — returns a DatabaseFactory for creating
     * database-related objects (queries, transactions, etc.)
     */
    DatabaseFactory createDatabaseFactory();
}
