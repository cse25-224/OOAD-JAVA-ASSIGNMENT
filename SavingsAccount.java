public class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 0.05;

    public SavingsAccount(String accountNumber,
                          double balance,
                          String branch) {
        super(accountNumber, balance, branch);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals not allowed in Savings Account.");
    }

    @Override
    public void payInterest() {
        balance += balance * INTEREST_RATE;
    }

    @Override
    public String toString() {
        return "Savings Balance: " + balance;
    }
}