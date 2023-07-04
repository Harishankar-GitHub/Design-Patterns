import java.util.HashMap;
import java.util.Map;

public abstract class VehicleRegistry {
    private static final Map<String,Vehicle> vehicles = new HashMap<>();

    static {
        vehicles.put("TWO", new TwoWheelerVehicle("90", "Ather", 100000, false));
        vehicles.put("FOUR", new FourWheelerVehicle("120","TATA", 100000, false,false));
    }

    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
        return (Vehicle) vehicles.get(vehicle).clone();
    }
}
