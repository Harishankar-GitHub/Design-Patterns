public class Main {

//     Proxy pattern : Proxy pattern is a structural pattern. We use proxy when we don't want to expose real object and provide proxy object to deal with.
//     Many times when you are dealing with remote servers and do lookup from the naming server it provides you proxy object from remote server not actual one.
//     Even in hibernate, if you remember we have a concept of lazy loading, i.e., whenever we load data from db we get proxy object of
//     database. However, if we retrieve the actual data then only it gets loaded from database. This is one of the best example of proxy object.

//     Another example can be Spring AOP where AOP objects are proxy and treated on advice aspects.

//     Different type of proxies are :
//     1. Remote proxy: When you are dealing with remote system , you require remote object to interact with the system.
//     2. Virtual proxy: Delay the object creation until it is required, as explained hibernate uses this.
//     3. Protection proxy: This proxy is used when we are dealing with security system i.e., before invoking the system implementation we want to check access.

//     Proxy pattern has mainly three components :
//     1. A common interface
//     2. Real Class
//     3. Proxy class - this uses the real class, and it is proxy of real class.
//
//     https://www.javadevjournal.com/java-design-patterns/proxy-design-pattern/
//     Example consider a Bank Account and ATM. To operate your bank account you have visit an ATM which is the proxy of the bank account.

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.withdraw();
    }
}
