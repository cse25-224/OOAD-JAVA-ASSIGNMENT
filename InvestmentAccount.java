public class InvestmentAccount extends Account {

    private static final double INTEREST_RATE = 0.05;

    public InvestmentAccount(String accountNumber,
                             double balance,
                             String branch) {

        super(accountNumber, balance, branch);

        if (balance < 500) {
            throw new IllegalArgumentException(
                "Initial deposit must be at least P500");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public void payInterest() {
        balance += balance * INTEREST_RATE;
    }

    public boolean checkMinBalance() {
        return balance >= 500;
    }
}