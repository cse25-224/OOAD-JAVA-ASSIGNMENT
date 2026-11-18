public class Main {

    public static void main(String[] args) {

        Customer customer =
            new Customer("C001",
                         "Dolly Kapii",
                         "Gaborone",
                         "71234567");

        SavingsAccount savings =
            new SavingsAccount(
                "S001",
                1000,
                "Main Branch");

        customer.addAccount(savings);

        savings.deposit(500);
        savings.payInterest();

        System.out.println(
            "Balance = " +
            savings.getBalance());
    }
}
