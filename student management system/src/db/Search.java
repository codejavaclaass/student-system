package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Search
{
  public static boolean isNumer(String str)
  {
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isDigit(str.charAt(i))) {
        return false;
      }
    }
    return true;
	  
//	  return false;
  }
  
  public static String[][] serach(String name, String stuno)
  {
    if (name.length() != 0)
    {
      String str = "select * from sims where name= '" + name + "';";
      
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
    if ((stuno.length() != 0) && (isNumer(stuno)))
    {
      String str1 = "select * from sims where stuno= '" + stuno + "';";
      String[][] strs = new String[100][8];
      try
      {
        ResultSet resultSet = DBUtil.query(str1);
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
    if ((stuno.length() != 0) && (!isNumer(stuno))) {
      JOptionPane.showMessageDialog(null, "请输入正确数字");
    } else if ((stuno.length() == 0) && (name.length() == 0)) {
      JOptionPane.showMessageDialog(null, "请输入姓名或学号进行查询");
    }
    return null;
  }
}

