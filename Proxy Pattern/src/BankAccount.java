public class BankAccount implements Account {

    @Override
    public void withdraw() {
        System.out.println("Withdrawing money!");
    }

    @Override
    public void getAccountNumber() {
        System.out.println("Getting account number");
    }
}
