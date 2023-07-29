public class PayPalPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount > 1500) {
            System.out.println(amount + " cannot be handled by the paypal. Redirecting to the next payment handler!");
            nextPaymentHandler.handlePayment(amount);
        } else {
            System.out.println("Paid using bank account: $" + amount);
        }
    }
}
