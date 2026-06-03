package org.example.designpatterns.factory;

import org.example.designpatterns.factory.database.Database;
import org.example.designpatterns.factory.database.UserService;
import org.example.designpatterns.factory.database.mongo.MongoDatabase;
import org.example.designpatterns.factory.database.mysql.MySQLDatabase;
import org.example.designpatterns.factory.ui.*;
import org.example.designpatterns.factory.ui.android.AndroidUIFactory;
import org.example.designpatterns.factory.ui.ios.IosUIFactory;

/**
 * Client — demonstrates all three Factory patterns:
 *
 * 1. Factory Method      — Database.createDatabaseFactory()
 * 2. Abstract Factory    — DatabaseFactory / UIFactory interfaces
 * 3. Simple Factory      — UIFactoryFactory.createUIFactory(platform)
 */
public class Client {
    public static void main(String[] args) {
        // Android UI
        UIFactory factory = UIFactoryFactory.createUIFactory(SupportedPlatforms.ANDROID);
        Button btn = factory.createButton();
        Menu menu = factory.createMenu();

        btn.render();
        btn.onClick();
        menu.render();

        // Using MySQL
        Database mysqlDB = new MySQLDatabase();
        mysqlDB.connect();
        UserService mysqlService = new UserService(mysqlDB);
        mysqlService.createUser("Kaushlendra", "kaush@scaler.com");

        // Switch to mongo
        Database mongoDb = new MongoDatabase();
        mongoDb.connect();
        UserService mongoService = new UserService(mongoDb);
        mongoService.createUser("Alok", "alok@scaler.com");
    }
}
