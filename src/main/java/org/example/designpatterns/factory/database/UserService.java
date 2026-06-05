package org.example.designpatterns.factory.database;

/**
 * UserService — demonstrates how client code uses the Abstract Factory.
 *
 * The service does NOT know which database it's talking to.
 * It gets a Database, asks it for a DatabaseFactory, and uses that
 * factory to create Queries and Transactions.
 */
public class UserService {
    private final Database db;
    private final DatabaseFactory dbf;

    public UserService(Database db) {
        this.db = db;
        this.dbf = this.db.createDatabaseFactory();
    }

    public void createUser(String name, String email) {
        Query q = dbf.createQuery("INSERT INTO users VALUES ('" + name + "', '" + email + "')");
        q.execute();

        System.out.println("User created: " + name);
    }

    public void updateUserEmail(String name, String newEmail) {
        Transaction txn = dbf.createTransaction();
        txn.begin();

        Query q = dbf.createQuery("UPDATE users SET email = '" + newEmail + "' WHERE name='" + name + "'");
        q.execute();
        txn.commit();

        System.out.println("User updated: " + name + " -> " + newEmail);
    }
}
