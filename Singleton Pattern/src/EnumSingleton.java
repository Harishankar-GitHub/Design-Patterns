public enum EnumSingleton {

    INSTANCE;
    // Enums are by default static values.
    // Developers cannot access the constructors.
    // JVM itself calls the constructors and creates an object for us.
    // Enums are thread safe as well.

    public void doSomething() {
        System.out.println("doSomething() method called");
    }
}
