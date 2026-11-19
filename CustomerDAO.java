import java.sql.Connection;
import java.sql.PreparedStatement;
public class CustomerDAO {
public void insertCustomer(int customerID,
String firstName,
String lastName,
String phone,
String address) {
try {
Connection conn =
DBConnection.getConnection();
String sql =
"INSERT INTO Customer VALUES(?,?,?,?,?)";
PreparedStatement pst =
conn.prepareStatement(sql);
pst.setInt(1, customerID);
pst.setString(2, firstName);
pst.setString(3, lastName);
pst.setString(4, phone);
pst.setString(5, address);
pst.executeUpdate();
conn.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}