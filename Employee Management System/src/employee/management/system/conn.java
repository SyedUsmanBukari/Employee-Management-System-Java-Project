package employee.management.system;

import java.sql.*;

public class conn {
    
      public Connection c;
      public Statement s;
      
      public conn() {
          try{
              Class.forName("com.mysql.jdbc.Driver");
              c = DriverManager.getConnection("jdbc:mysql:///project3","root","1080");
              s = c.createStatement();
          }catch(Exception e) {
              e.printStackTrace();
          }
      }
}