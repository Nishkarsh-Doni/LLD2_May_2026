package org.example.designpatterns.factory.database.mysql;


import org.example.designpatterns.factory.database.Query;

/**
 * MySQLQuery — MySQL-specific query implementation.
 */
public class MySQLQuery implements Query {
    private final String queryString;

    public MySQLQuery(String sql) {
        this.queryString = sql;
    }

    @Override
    public void execute() {
        System.out.println("[MySQL] Executing SQL query: " + queryString);
    }

    @Override
    public String getQueryString() {
        return queryString;
    }
}
