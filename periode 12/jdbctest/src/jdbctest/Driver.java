package jdbctest;
import java.sql.*;
public class Driver {
    private static final String USERNAME= "root";
     private static final String PASSWORD= "root";
      private static final String CONN_STRING= "jdbc:Mysql://127.0.0.1:3306/test?useSSL=false";
    
    public static void main (String[]args){
        Connection myConn = null;
        try {
           
             myConn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("CONNECTED!");
             }
        catch (SQLException e){
            System.err.println(e);
        }
    }
}