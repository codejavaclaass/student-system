package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil
{
  private static final String URL = "jdbc:mysql://localhost:3306/test3?useUnicode=true&characterEncoding=GBK";
  private static final String NAME = "root";
  private static final String PASSWORD = "1234";
  
  public static void exec(String sql)
    throws ClassNotFoundException, SQLException
  {
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
    
    Statement stmt = conn.createStatement();
    
    stmt.execute(sql);
    
    ResultSet rs = stmt.executeQuery(sql);
    stmt.close();
    conn.close();
  }
  
  public static ResultSet query(String sql)
    throws SQLException, ClassNotFoundException
  {
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
    
    Statement stmt = conn.createStatement();
    try
    {
      return stmt.executeQuery(sql);
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return null;
  }
}