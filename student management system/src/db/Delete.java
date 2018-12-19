package db;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Delete
{
  public static String getstuno;
  
  public static boolean isNumer(String str)
  {
    for (int i = 0; i < str.length(); i++)
    {
      System.out.println(str.charAt(i));
      if (!Character.isDigit(str.charAt(i))) {
        return false;
      }
    }
    return true;
  }
  
  public static String[][] delete(String stuno)
  {
    if ((stuno.length() != 0) && (isNumer(stuno)))
    {
      String str = "delete from sims where stuno ='" + stuno + "';";
      String[][] strs = new String[100][8];
      try
      {
        DBUtil.exec(str);
      }
      catch (ClassNotFoundException e)
      {
        e.printStackTrace();
      }
      catch (SQLException e)
      {
        JOptionPane.showMessageDialog(null, "删除成功！");
      }
      return strs;
    }
    if ((stuno.length() != 0) && (!isNumer(stuno))) {
      JOptionPane.showMessageDialog(null, "请输入正确学号");
    } else if (stuno.length() == 0) {
      JOptionPane.showMessageDialog(null, "请输入学号进行删除");
    }
    return null;
  }
}
