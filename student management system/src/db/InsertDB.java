package db;


import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InsertDB
{
  public static void Insert(String stuno, String name, String gender, String birthdate, String poutlook, String address, String phone, String dormitory)
  {
    String str = "insert into sims(stuno,name,gender,birthdate,poutlook,address,phone,dormitory) values('" + 
      stuno + "'" + "," + "'" + name + "'" + "," + "'" + gender + "'" + "," + "'" + birthdate + "'" + "," + 
      "'" + poutlook + "'" + "," + "'" + address + "'" + "," + "'" + phone + "'" + "," + "'" + dormitory + "'" + ")";
    try
    {
      DBUtil.exec(str);
      JOptionPane.showMessageDialog(null, "��ӳɹ�!");
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (SQLException e)
    {
      if (e.toString().equals("com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException: Duplicate entry '" + stuno + "' for key 'PRIMARY'")) {
        JOptionPane.showMessageDialog(null, "ѧ���Ѵ�������������");
      }
      if (e.toString().equals("java.sql.SQLException: Can not issue data manipulation statements with executeQuery().")) {
        JOptionPane.showMessageDialog(null, "��ӳɹ�!");
      }
    }
  }
}
