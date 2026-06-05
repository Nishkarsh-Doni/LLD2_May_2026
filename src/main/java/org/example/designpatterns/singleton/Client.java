package org.example.designpatterns.singleton;

public class Client {

    public static void main(String[] args) {
        SingletonDB db1 = SingletonDB.createInstance();
        SingletonDB db2 = SingletonDB.createInstance();

        System.out.println(db1);
        System.out.println(db2);
    }
}
