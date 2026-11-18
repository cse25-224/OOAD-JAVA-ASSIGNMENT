import java.util.ArrayList;

public class Customer {

    private String customerId;
    private String fullName;
    private String address;
    private String contact;

    private ArrayList<Account> accounts;

    public Customer(String customerId,
                    String fullName,
                    String address,
                    String contact) {

        this.customerId = customerId;
        this.fullName = fullName;
        this.address = address;
        this.contact = contact;

        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFullName() {
        return fullName;
    }
    }