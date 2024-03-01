package MySql;
import java.sql.*;

public class Update {
    public static void main(String[] args) {
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tka", "root", "rootroot");
    conn.setAutoCommit(true);
    PreparedStatement pstmt = conn.prepareStatement("UPDATE student SET sCity = ? WHERE sid = ?");
    pstmt.setString(1, "Dubai");
    pstmt.setInt(2, 123);
    int rowsUpdated = pstmt.executeUpdate();
    System.out.println("Rows updated: " + rowsUpdated);

} catch (Exception e) {
    System.out.println(e);
}
}
}

