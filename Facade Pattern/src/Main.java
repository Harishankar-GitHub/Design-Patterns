public class Main {

//     Facade pattern : This is also a structural pattern where it defines how classes need to be structured in a way that
//     there is single entry point to that function.
//     We should use facade pattern when we have complex subsystems , calling each leads to a single operation for a client.
//     In this case we can introduce facade which helps to interact with all the subsystems and gives us single output.
//     Facade pattern basically adds one level of abstractions in the system.

//     To implement facade you have to write one class which interacts with other services in down stream.

//     Consider example you have to place order in the zomato and you want to get food
//     1. Customer sees menu and places an order.
//     2. Restaurant got the order and prepares the order.
//     3. Delivery team assigns a delivery executive.
//     4. Delivery boy picks up the order and delivers.

//     Here Zomato API is facade for us where we just click place order, and it is done.
//     https://www.decipherzone.com/blog-detail/facade-design-pattern

    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        
        ZomatoFacade zomato = new ZomatoFacade(new Restaurant(), new DeliveryExecutive(), new DeliveryTeam());
        zomato.placeOrder();

        System.out.println("---------------------------------------");
    }
}
