package DATABASE_HRS;
import java.sql.*;
public class Database_connection {
        public static Connection getCon(){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "12345");
             return Con;
           } catch(ClassNotFoundException | SQLException e)
           {
               
               return null;
                   }
    }
}
