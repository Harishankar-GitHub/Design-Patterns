public class ZomatoFacade {
    private Restaurant restaurant;
    private DeliveryExecutive deliveryExecutive;
    private DeliveryTeam deliveryTeam;

    public void placeOrder() {
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryExecutive();
        deliveryExecutive.pickupOrder();
        deliveryExecutive.deliverOrder();
    }
}
