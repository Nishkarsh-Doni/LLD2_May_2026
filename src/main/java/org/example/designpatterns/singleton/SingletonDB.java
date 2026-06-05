package org.example.designpatterns.singleton;

//public class SingletonDB {
//
//    public static SingletonDB instance;
//
//    private SingletonDB() {}
//
//    public static synchronized SingletonDB createInstance() {
//        if(instance == null) {
//            instance = new SingletonDB();
//        }
//        return instance;
//    }
//}

public class SingletonDB {

    public static final SingletonDB instance = new SingletonDB();
    private SingletonDB(){}
    public static synchronized SingletonDB createInstance(){
        return instance;
    }
}



