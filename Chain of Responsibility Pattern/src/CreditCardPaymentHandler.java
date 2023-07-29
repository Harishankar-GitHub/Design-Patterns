public class CreditCardPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount > 1000) {
            System.out.println(amount + " cannot be handled by the credit card. Redirecting to the next payment handler!");
            nextPaymentHandler.handlePayment(amount);
        } else {
            System.out.println("Paid using credit card: $" + amount);
        }
    }
}
