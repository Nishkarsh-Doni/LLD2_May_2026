package org.example.designpatterns.factory.database.mongo;


import org.example.designpatterns.factory.database.DatabaseFactory;
import org.example.designpatterns.factory.database.Query;
import org.example.designpatterns.factory.database.Transaction;

/**
 * MongoDatabaseFactory — creates MongoDB-specific objects.
 * Implements the Abstract Factory for Mongo.
 */
public class MongoDatabaseFactory implements DatabaseFactory {

    @Override
    public Query createQuery(String query) {
        return new MongoQuery(query);
    }

    @Override
    public Transaction createTransaction() {
        return new MongoTransaction();
    }
}
