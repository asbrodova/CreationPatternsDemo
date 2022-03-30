package dev.asbrodova.main.patterns.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static SerializableSingleton serializableSingleton = new SerializableSingleton();

    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        return serializableSingleton;
    }

    public static void ifInitialized() {
        System.out.println(serializableSingleton != null);
    }

    /**
     * this method is needed to avoid singleton pattern breakage after deserialization.
     * If to remove readResolve implementation here
     * we will get "false" at PatternsDemo line 64 - in this case hashcodes of objects before and after
     * seriallization/deserialization would differ
     *
     * During serialization process readObject() is used to create instance and it creates new instance every time
     * we deserialize the Singleton object. But we can replace that newly created instance
     * in the stream with our original Singleton instance using readResolve().
     * No reference to the newly created instance is retained, so it immediately becomes eligible for garbage collection.
     */
    protected Object readResolve() {
        return getInstance();
    }
}
