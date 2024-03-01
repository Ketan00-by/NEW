package MySql;

import java.sql.*;

public class PreparedStm {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tka", "root", "rootroot");
           conn.setAutoCommit(false);
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Student WHERE sname = ?");
            pstmt.setString(1, "Ketan"); // Set the value for the parameter
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("sid"));
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}