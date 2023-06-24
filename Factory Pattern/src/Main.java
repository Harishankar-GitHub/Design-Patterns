import factories.OperatingSystem;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("-------------------------------------------------");

        OperatingSystem windowsOS = OperatingSystemFactory.getInstance("WINDOWS", "11", "Windows Architecture");
        windowsOS.changeDir("dir");
        windowsOS.removeDir("dir");

        System.out.println("-------------------------------------------------");

        OperatingSystem linuxOS = OperatingSystemFactory.getInstance("LINUX", "11", "Linux Architecture");
        linuxOS.changeDir("dir");
        linuxOS.removeDir("dir");

        System.out.println("-------------------------------------------------");
    }
}
