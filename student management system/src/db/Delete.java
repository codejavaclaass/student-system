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
        JOptionPane.showMessageDialog(null, "ɾ���ɹ���");
      }
      return strs;
    }
    if ((stuno.length() != 0) && (!isNumer(stuno))) {
      JOptionPane.showMessageDialog(null, "��������ȷѧ��");
    } else if (stuno.length() == 0) {
      JOptionPane.showMessageDialog(null, "������ѧ�Ž���ɾ��");
    }
    return null;
  }
}
