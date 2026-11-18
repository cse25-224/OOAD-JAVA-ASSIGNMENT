
public class ChequeAccount extends Account {
private Company employer;
public ChequeAccount(String accountNumber,
double balance,
String branch,
Company employer) {
super(accountNumber, balance, branch);
this.employer = employer;
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
// No interest for cheque account
}
public Company getCompany() {
return employer;
}
}