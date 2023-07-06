public class Main {

// Adapter patterns comes under structural pattern as it deals with how classes are interacting.
// As name suggests adapter pattern is used adapt two different incompatible system.

// Adapter pattern also helps and be connector between your system and some third party or legacy system.
// For example your system expects data in one format to process and third party sends in one format.
// Example : Consider you have to invoke some third party soap service which is xml base however your system is built on JSON
// with some advanced fields at that time you create JSON-to-XML adapter which will help to interact with third party.
// Adapter pattern can be achieved in two ways:
// 1. Class Level: class level mean to adapt something you are extending and doing inheritance of that class.
// 2. Object level : Object level mean you keep has-a relationship with class rather doing tight coupling in system.

// One of the example is we know java supports both array and list to store data. Now you have legacy system
// which is using array, and you want to use collection functionalities to do so we have to convert, so Arrays.asList work as adapter
// between array to list and then use collections.

// In this example we can see that Swiggy is selling food products now suddenly lockdown arise,
// and they plan to deliver grocery items for some time, so they write an adapter which
// helps them to convert grocery items similar to food item without touching their food delivery business.
    
    public static void main(String[] args) {
        SwiggyStore swiggyStore = new SwiggyStore();
        swiggyStore.addItems(new FoodItem());
        swiggyStore.addItems(new FoodItem());

        // Adapting GroceryItem which was incompatible with FoodItem.
        swiggyStore.addItems(new GroceryItemAdapter(new GroceryProduct()));

        swiggyStore.getItems()
                .forEach(System.out::println);
    }
}
