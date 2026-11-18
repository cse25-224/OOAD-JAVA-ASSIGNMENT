public class Transaction {
    private double amount;
    private boolean successful;

    public Transaction(double amount, boolean successful) {
        this.amount = amount;
        this.successful = successful;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isSuccessful() {
        return successful;
    }
}