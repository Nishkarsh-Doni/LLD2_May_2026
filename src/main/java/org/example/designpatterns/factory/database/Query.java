package org.example.designpatterns.factory.database;

/**
 * Query — interface for database queries.
 * Different databases (MySQL, Mongo) will have different query implementations.
 */
public interface Query {

    /**
     * Execute this query against the database.
     */
    void execute();

    /**
     * Get the raw query string.
     */
    String getQueryString();
}
