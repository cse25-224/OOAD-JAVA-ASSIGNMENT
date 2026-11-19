import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    public boolean validateLogin(String username,
                                 String password) {

        boolean valid = false;

        try {

            Connection conn =
                    DBConnection.getConnection();

            String sql =
                    "SELECT * FROM Users " +
                    "WHERE Username = ? " +
                    "AND Password = ?";

            PreparedStatement pst =
                    conn.prepareStatement(sql);

            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                valid = true;
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return valid;
    }
}