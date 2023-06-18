import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static SerializableSingleton instance = null;

    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        if (instance == null) {
            instance = new SerializableSingleton();
        }

        return instance;
    }

    // readResolve() method will be called by the JVM during deserialization.
    // It gets the byte array of the object and converts to a new object and returns it.
    // By overriding the method, we can make it return the same instance again.
    // By doing this, we can fix the Singleton Pattern Issue.
    protected Object readResolve() {
        return instance;
    }
}
