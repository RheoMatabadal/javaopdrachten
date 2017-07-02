import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
public class Driver {
public static void main(String[] args) throws SQLException {
String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
String user = "root";
String password = "root";
Connection myConn = null;
Statement myStmt = null;
try {
// 1. Get a connection to database
myConn = DriverManager.getConnection(url, user, password);
// 2. Create a statement
myStmt = myConn.createStatement();
// 3. Execute SQL query
String sql = "delete from medewerkers where voornaam ='kevin'";
int rowsAffeted = myStmt.executeUpdate(sql);
System.out.println("Row Affectec:"+ rowsAffeted);
    System.out.println("delete complete");


} catch (Exception exc) {
exc.printStackTrace();
} finally {
if (myStmt != null) {
myStmt.close();
}
if (myConn != null) {
myConn.close();
}
}
}
}