public class ATM implements Account {   // This is a proxy to the bank account.

    @Override
    public void withdraw() {
        //Access using actual object. You can also have checks on withdraw() method.
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw();
    }

    @Override
    public void getAccountNumber() {

    }
}
