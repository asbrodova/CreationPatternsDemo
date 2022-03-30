package dev.asbrodova.main.patterns.singleton;

public class EarlySingleton {

    private static EarlySingleton earlySingleton = new EarlySingleton();

    private EarlySingleton(){

    }

    public static EarlySingleton getInstance(){
        return earlySingleton;
    }

    public static void ifInitialized() {
        System.out.println(earlySingleton != null);
    }
}
