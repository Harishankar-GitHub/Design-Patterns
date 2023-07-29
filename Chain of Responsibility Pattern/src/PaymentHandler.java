public abstract class PaymentHandler {
    protected PaymentHandler nextPaymentHandler;

    public void setNext(PaymentHandler nextPaymentHandler) {
        this.nextPaymentHandler = nextPaymentHandler;
    }

    public abstract void handlePayment(double amount);
}
