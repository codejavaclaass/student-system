package db;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Modify
{
  public static void modify(String stuno, String name, String gender, String birthdate, String poutlook, String address, String phone, String dormitory)
  {
    String str = "update sims set stuno = '" + stuno + "',gender='" + gender + "'," + "birthdate='" + birthdate + 
      "'," + "poutlook='" + poutlook + "'," + "address='" + address + "'," + "phone='" + phone + 
      "'," + "dormitory='" + dormitory + "' " + "where name=" + "'" + name + "';";
    try
    {
      DBUtil.exec(str);
      JOptionPane.showMessageDialog(null, "修改成功!");
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (SQLException e)
    {
      JOptionPane.showMessageDialog(null, "修改成功!");
    }
  }
}
