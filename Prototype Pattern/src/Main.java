public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        VehicleRegistry vehicleRegistry = new VehicleRegistryImpl();

        Vehicle twoWheeler = vehicleRegistry.getVehicle("TWO");
        Vehicle fourWheeler = vehicleRegistry.getVehicle("FOUR");

        System.out.println(twoWheeler.toString());
        System.out.println(fourWheeler.toString());
    }
}
