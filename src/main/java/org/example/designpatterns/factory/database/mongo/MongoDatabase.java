package org.example.designpatterns.factory.database.mongo;


import org.example.designpatterns.factory.database.Database;
import org.example.designpatterns.factory.database.DatabaseFactory;

/**
 * MongoDatabase — MongoDB implementation of the Database interface.
 */
public class MongoDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("[Mongo] Connected to MongoDB cluster");
    }

    @Override
    public void changePoolSize(int size) {
        System.out.println("[Mongo] Connection pool resized to " + size);
    }

    @Override
    public String getVersion() {
        return "MongoDB 7.0";
    }

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MongoDatabaseFactory();
    }
}
