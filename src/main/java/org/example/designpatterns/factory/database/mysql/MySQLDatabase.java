package org.example.designpatterns.factory.database.mysql;

import org.example.designpatterns.factory.database.Database;
import org.example.designpatterns.factory.database.DatabaseFactory;

/**
 * MySQLDatabase — MySQL implementation of the Database interface.
 */
public class MySQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("[MySQL] Connected to MySQL database");
    }

    @Override
    public void changePoolSize(int size) {
        System.out.println("[MySQL] Pool size changed to " + size);
    }

    @Override
    public String getVersion() {
        return "MySQL 8.0";
    }


    // This is in itself a factory method
    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MySQLDatabaseFactory();
    }
}
