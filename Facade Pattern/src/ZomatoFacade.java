public class ZomatoFacade {
    private final Restaurant restaurant;
    private final DeliveryExecutive deliveryExecutive;
    private final DeliveryTeam deliveryTeam;

    public ZomatoFacade(Restaurant restaurant, DeliveryExecutive deliveryExecutive, DeliveryTeam deliveryTeam) {
        this.restaurant = restaurant;
        this.deliveryExecutive = deliveryExecutive;
        this.deliveryTeam = deliveryTeam;
    }

    public void placeOrder() {
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryExecutive();
        deliveryExecutive.pickupOrder();
        deliveryExecutive.deliverOrder();
    }
}
