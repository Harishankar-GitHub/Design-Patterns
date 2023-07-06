public class GroceryItemAdapter implements Item {
    private final GroceryItem item;

    public GroceryItemAdapter(GroceryItem item) {
        this.item = item;
    }

    @Override
    public String getItemName() {
        return item.getName();
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getRestaurantName() {
        // when getRestaurantName() method is called on a GroceryItem,
        // getStoreName() method is called.
        // Adapting GroceryItem with Item.
        return item.getStoreName();
    }
}
