public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------");

        Application windowsApp = new Application(new WindowsUIFactory());
        windowsApp.paint();

        System.out.println("----------------------------------------");

        Application macApp = new Application(new MacUIFactory());
        macApp.paint();

        System.out.println("----------------------------------------");
    }
}
