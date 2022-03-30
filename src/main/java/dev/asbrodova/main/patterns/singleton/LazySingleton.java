package dev.asbrodova.main.patterns.singleton;

public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    public static void ifInitialized() {
        System.out.println(lazySingleton != null);
    }
}
