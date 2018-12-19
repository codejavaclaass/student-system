package db;


import java.sql.ResultSet;
import java.sql.SQLException;

public class Strsselect
{
  public static String[][] select(String str)
  {
    String[][] strs = new String[100][8];
    try
    {
      ResultSet resultSet = DBUtil.query(str);
      int cnt = 0;
      while (resultSet.next())
      {
        for (int i = 0; i < 8; i++) {
          strs[cnt][i] = resultSet.getString(i + 1);
        }
        cnt++;
      }
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return strs;
  }
}
