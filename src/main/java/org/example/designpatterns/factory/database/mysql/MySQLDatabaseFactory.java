package org.example.designpatterns.factory.database.mysql;


import org.example.designpatterns.factory.database.DatabaseFactory;
import org.example.designpatterns.factory.database.Query;
import org.example.designpatterns.factory.database.Transaction;

/**
 * MySQLDatabaseFactory — creates MySQL-specific objects.
 * Implements the Abstract Factory for MySQL.
 */
public class
MySQLDatabaseFactory implements DatabaseFactory {

    @Override
    public Query createQuery(String sql) {
        return new MySQLQuery(sql);
    }

    @Override
    public Transaction createTransaction() {
        return new MySQLTransaction();
    }
}
