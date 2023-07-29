public class BankPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount > 500) {
            System.out.println(amount + " cannot be handled by the bank. Redirecting to the next payment handler!");
            nextPaymentHandler.handlePayment(amount);
        } else {
            System.out.println("Paid using bank account: $" + amount);
        }
    }
}
