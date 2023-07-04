public abstract class Vehicle implements Cloneable {

    // Base Object (Vehicle in this case) should implement cloneable interface and have clone() method.
    // Subclasses also should have clone() method.
    // In Registry class, we can create initial versions of different objects.
    // Then we can get the cloned objects and use it.
    // By this way we do not have to create new objects every time.
    // When object creation operation is heavy/expensive operation, Prototype Pattern can be used.
    // clone() method can have shallow copy or deep copy depending on the requirement.

    private String engine;
    private String model;
    private long price;

    public Vehicle(String engine, String model, long price) {
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Vehicle{engine='%s', model='%s', price=%d}", engine, model, price);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
