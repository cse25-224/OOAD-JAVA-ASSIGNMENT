import java.sql.Connection;
import java.sql.PreparedStatement;
public class AccountDAO {
public void insertAccount(int accountID,
int customerID,
String accountType,
double balance) {
try {
Connection conn =
DBConnection.getConnection();
String sql =
"INSERT INTO Account VALUES(?,?,?,?)";
PreparedStatement pst =
conn.prepareStatement(sql);
pst.setInt(1, accountID);
pst.setInt(2, customerID);
pst.setString(3, accountType);
pst.setDouble(4, balance);
pst.executeUpdate();conn.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}