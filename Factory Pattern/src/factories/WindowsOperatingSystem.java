package factories;

public class WindowsOperatingSystem extends OperatingSystem {

    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Change Dir Command from Windows");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Remove Dir Command from Windows");
    }
}
