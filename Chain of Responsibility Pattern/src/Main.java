public class Main {

//     Chain of Responsibility is one of the behavioral design patterns that lets you pass requests along a chain of handlers.
//     Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

//     The Chain of Responsibility pattern allows a number of classes to attempt to handle a request independently.

//     Reference: https://refactoring.guru/design-patterns/chain-of-responsibility

    public static void main(String[] args) {
        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        PaymentHandler paypal = new PayPalPaymentHandler();

        bank.setNext(creditCard);
        creditCard.setNext(paypal);

        bank.handlePayment(600);
        bank.handlePayment(200);
        bank.handlePayment(1200);
        bank.handlePayment(50);
    }
}
