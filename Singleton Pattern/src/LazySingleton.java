import java.io.Serializable;

public class LazySingleton implements Serializable {

    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance != null) {
            return instance;
        }

        instance = new LazySingleton();
        return instance;

//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//
//        return instance;
    }
}
