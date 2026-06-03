package org.example.designpatterns.factory.database.mongo;


import org.example.designpatterns.factory.database.Query;

/**
 * MongoQuery — MongoDB-specific query implementation.
 * Mongo uses documents/collections instead of SQL.
 */
public class MongoQuery implements Query {
    private final String queryString;

    public MongoQuery(String query) {
        this.queryString = query;
    }

    @Override
    public void execute() {
        System.out.println("[Mongo] Executing document query: " + queryString);
    }

    @Override
    public String getQueryString() {
        return queryString;
    }
}
