import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Serialization is one of the ways to break Singleton Pattern.
        exampleSerialization();

        // Another way to break Singleton Pattern is using Reflections.
        exampleReflection();
    }

    private static void exampleSerialization() throws IOException, ClassNotFoundException {
        System.out.println("---------------------------------Breaking the Singleton Pattern using Serialization---------------------------------");

        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton deserializedLazy = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("lazySingleton Object: " + lazySingleton.hashCode());
        System.out.println("deserializedLazy Object: " + deserializedLazy.hashCode());

        System.out.println("So in the above code, we wrote lazySingleton object to a file and read again from the object" +
                "and assigned to deserializedLazy object. When printing the hash codes of both the objects, they are different. So both are not same objects." +
                " By this, Singleton pattern is broken.");

        System.out.println("---------------------------------Breaking the Singleton Pattern using Serialization---------------------------------");

        System.out.println("---------------------------------Fixing the Singleton Pattern using readResolve() method---------------------------------");

        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("object1.obj"));
        objectOutputStream2.writeObject(serializableSingleton);
        objectOutputStream2.close();
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("object1.obj"));
        SerializableSingleton deserializedInstance = (SerializableSingleton) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println("serializableSingleton Object: " + serializableSingleton.hashCode());
        System.out.println(" deserializedInstance Object: " + deserializedInstance.hashCode());

        System.out.println("So in the above code, we wrote serializableSingleton object to a file and read again from the object" +
                "and assigned to deserializedInstance object. When printing the hash codes of both the objects, they are same. So both are the same objects." +
                " By this, Singleton pattern issue is fixed.");

        System.out.println("---------------------------------Fixing the Singleton Pattern using readResolve() method---------------------------------");
    }

    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {

        System.out.println("---------------------------------Breaking the Singleton Pattern using Reflection---------------------------------");

        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        // Knowing only one constructor is present in the array, accessing it using index 0.
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        LazySingleton lazySingletonInstanceFromReflection = (LazySingleton) constructor.newInstance();
        LazySingleton lazySingletonInstanceUsingGetInstanceMethod = LazySingleton.getInstance();
        System.out.println("lazySingletonInstanceFromReflection: "+lazySingletonInstanceFromReflection.hashCode());
        System.out.println("lazySingletonInstanceUsingGetInstanceMethod: "+ lazySingletonInstanceUsingGetInstanceMethod.hashCode());

        System.out.println("---------------------------------Breaking the Singleton Pattern using Reflection---------------------------------");

        System.out.println("---------------------------------Fixing the Singleton Pattern using Enums---------------------------------");

        EnumSingleton.INSTANCE.doSomething();

        System.out.println("---------------------------------Fixing the Singleton Pattern using Enums---------------------------------");
    }
}
