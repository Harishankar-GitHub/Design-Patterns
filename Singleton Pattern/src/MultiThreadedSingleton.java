import java.io.Serializable;

public class MultiThreadedSingleton implements Serializable {

    private static MultiThreadedSingleton instance = null;

    private MultiThreadedSingleton() {

    }

    public static MultiThreadedSingleton getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (MultiThreadedSingleton.class) {
                if (instance == null) {
                    instance = new MultiThreadedSingleton();
                }
            }

        return instance;

//        if (instance == null) {
//            synchronized (MultiThreadedSingleton.class) {
//                if (instance == null) {
//                    instance = new MultiThreadedSingleton();
//                }
//            }
//        }
//
//        return instance;
    }
}
