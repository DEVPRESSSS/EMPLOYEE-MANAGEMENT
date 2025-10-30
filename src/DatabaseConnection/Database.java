
package DatabaseConnection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Database {
    
    private static final String URL = "jdbc:mysql://localhost:3306/ems";
    private static final String USER= "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() {
        
            Connection con = null;
             try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 con = DriverManager.getConnection(URL, USER, PASSWORD);
             } catch (ClassNotFoundException | SQLException ex) {
                 ex.printStackTrace();
             }
         
            return con;
      
    }
    
    public static void main (String [] args) throws SQLException{
   
        try (Connection con = getConnection()) {
            if (con != null) {
                System.out.println("Connected successfully to EMS database!");
            } else {
                System.out.println("Connection failed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  

}
