import factories.LinuxOperatingSystem;
import factories.OperatingSystem;
import factories.WindowsOperatingSystem;

public class OperatingSystemFactory {

    // Constructor is made private so that we cannot create object of the factory.
    // We use getInstance() method to get the required instance based on the parameters passed.
    private OperatingSystemFactory() {
    }

    public static OperatingSystem getInstance(String type, String version, String architecture) throws IllegalAccessException {
        switch (type) {
            case "WINDOWS":
                return new WindowsOperatingSystem(version, architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalAccessException("OS not supported");
        }
    }
}
