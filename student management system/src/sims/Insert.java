package sims;

import db.InsertDB;
import db.Search;
import db.Strsselect;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Insert
  extends JFrame
{
  private JTextField add;
  private JTextField bir;
  private JTextField dn;
  private JTextField gender;
  private JButton jButton1;
  private JButton Insert;
  private JDesktopPane jDesktopPane1;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JLabel jLabel7;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private JTextField name;
  private JTextField po;
  private JButton sreturn;
  private JTextField stuno;
  private JTextField tel;
  
  public Insert()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    new ButtonGroup();
    this.jDesktopPane1 = new JDesktopPane();
    this.jLabel1 = new JLabel();
    this.jButton1 = new JButton();
    this.sreturn = new JButton();
    this.Insert = new JButton();
    this.jLabel2 = new JLabel();
    this.jLabel3 = new JLabel();
    this.jLabel4 = new JLabel();
    this.jLabel5 = new JLabel();
    this.jLabel6 = new JLabel();
    this.jLabel7 = new JLabel();
    this.jLabel8 = new JLabel();
    this.jLabel9 = new JLabel();
    this.stuno = new JTextField();
    this.name = new JTextField();
    this.gender = new JTextField();
    this.bir = new JTextField();
    this.po = new JTextField();
    this.add = new JTextField();
    this.tel = new JTextField();
    this.dn = new JTextField();
    
    setDefaultCloseOperation(3);
    
    this.jLabel1.setFont(new Font("微软雅黑", 0, 24));
    this.jLabel1.setForeground(new Color(240, 240, 240));
    this.jLabel1.setText("新增学生信息");
    
    this.jDesktopPane1.setLayer(this.jLabel1, JLayeredPane.DEFAULT_LAYER.intValue());
    
    GroupLayout jDesktopPane1Layout = new GroupLayout(this.jDesktopPane1);
    this.jDesktopPane1.setLayout(jDesktopPane1Layout);
    jDesktopPane1Layout.setHorizontalGroup(
      jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jDesktopPane1Layout.createSequentialGroup()
      .addComponent(this.jLabel1, -2, 178, -2)
      .addGap(0, 0, 32767)));
    
    jDesktopPane1Layout.setVerticalGroup(
      jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel1, -1, 63, 32767));
    
    this.jButton1.setText("退出登录");
    this.jButton1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Insert.this.jButton1ActionPerformed(evt);
      }
    });
    this.sreturn.setText("返回上一级");
    this.sreturn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Insert.this.sreturnActionPerformed(evt);
      }
    });
    this.Insert.setText("增加");
    this.Insert.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Insert.this.InsertActionPerformed(evt);
      }
    });
    this.jLabel2.setText("学号");
    
    this.jLabel3.setText("姓名");
    
    this.jLabel4.setText("性别");
    
    this.jLabel5.setText("生日");
    
    this.jLabel6.setText("政治面貌");
    
    this.jLabel7.setText("地址");
    
    this.jLabel8.setText("电话");
    
    this.jLabel9.setText("宿舍号");
    
    this.name.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Insert.this.nameActionPerformed(evt);
      }
    });
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jDesktopPane1)
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addGap(21, 21, 21)
      .addComponent(this.Insert)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 334, 32767)
      .addComponent(this.sreturn)
      .addGap(18, 18, 18)
      .addComponent(this.jButton1)
      .addGap(26, 26, 26))
      .addGroup(layout.createSequentialGroup()
      .addGap(151, 151, 151)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(this.jLabel9)
      .addComponent(this.jLabel8)
      .addComponent(this.jLabel7)
      .addComponent(this.jLabel6)
      .addComponent(this.jLabel5)
      .addComponent(this.jLabel4)
      .addComponent(this.jLabel3)
      .addComponent(this.jLabel2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.name, -2, -1, -2)
      .addComponent(this.gender, -2, -1, -2)
      .addComponent(this.bir, -2, -1, -2)
      .addComponent(this.po, -2, -1, -2)
      .addComponent(this.add, -2, -1, -2)
      .addComponent(this.tel, -2, -1, -2)
      .addComponent(this.dn, -2, -1, -2)
      .addComponent(this.stuno, -2, 236, -2))
      .addContainerGap(-1, 32767)));
    
    layout.linkSize(0, new Component[] { this.add, this.bir, this.dn, this.gender, this.name, this.po, this.stuno, this.tel });
    
    layout.setVerticalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jDesktopPane1, -2, -1, -2)
      .addGap(26, 26, 26)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.stuno, -2, 35, -2)
      .addComponent(this.jLabel2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel3)
      .addComponent(this.name, -2, -1, -2))
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel4)
      .addComponent(this.gender, -2, -1, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel5)
      .addComponent(this.bir, -2, -1, -2))
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel6)
      .addComponent(this.po, -2, -1, -2))
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel7)
      .addComponent(this.add, -2, -1, -2))
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel8)
      .addComponent(this.tel, -2, -1, -2))
      .addGap(20, 20, 20)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel9)
      .addComponent(this.dn, -2, -1, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jButton1)
      .addComponent(this.sreturn)
      .addComponent(this.Insert))
      .addGap(22, 22, 22)));
    
    layout.linkSize(1, new Component[] { this.add, this.bir, this.dn, this.gender, this.name, this.po, this.stuno, this.tel });
    
    setLocation(700, 250);
    pack();
  }
  
  private void jButton1ActionPerformed(ActionEvent evt)
  {
    Login L = new Login();
    L.setVisible(true);
    setVisible(false);
  }
  
  private void sreturnActionPerformed(ActionEvent evt)
  {
    String str = "select * from sims;";
    String[][] strs = Strsselect.select(str);
    Stuinedit Stuinedit = new Stuinedit(strs);
    Stuinedit.setVisible(true);
    setVisible(false);
  }
  
  private void InsertActionPerformed(ActionEvent evt)
  {
    String[] str = this.bir.getText().split("-");
    String birthday = "";
    for (int i = 0; i < str.length; i++) {
      birthday = birthday + str[i];
    }
    String istuno = this.stuno.getText().trim();
    String iname = this.name.getText().trim();
    String igender = this.gender.getText().trim();
    String ibirthdate = this.bir.getText().trim();
    String ipoutlook = this.po.getText().trim();
    String iaddress = this.add.getText().trim();
    String iphone = this.tel.getText().trim();
    String idormitory = this.dn.getText().trim();
    if (istuno.length() == 0)
    {
      JOptionPane.showMessageDialog(null, "学号不能为空!");
    }
    else if (!Search.isNumer(istuno))
    {
      JOptionPane.showMessageDialog(null, "学号格式有误,请重新输入");
    }
    else if (iname.length() == 0)
    {
      JOptionPane.showMessageDialog(null, "姓名不能为空!");
    }
    else if (igender.length() == 0)
    {
      JOptionPane.showMessageDialog(null, "性别不能为空!");
    }
    else if (igender.length() > 1)
    {
      JOptionPane.showMessageDialog(null, "性别格式有误,请输入m/f");
    }
    else if (ibirthdate.length() == 0)
    {
      JOptionPane.showMessageDialog(null, "生日不能为空!");
    }
    else if (((this.bir.getText().length() != 0) && (! Search.isNumer(birthday))) || (this.bir.getText().length() != 10))
    {
      JOptionPane.showMessageDialog(null, "生日格式有误,请输xxxx-xx-xx格式");
      this.bir.setText("");
    }
    else if (Integer.parseInt(str[1]) > 12)
    {
      JOptionPane.showMessageDialog(null, "月份输入有误");
      this.bir.setText("");
    }
    else if (Integer.parseInt(str[2]) > 31)
    {
      JOptionPane.showMessageDialog(null, "日期输入有误");
      this.bir.setText("");
    }
    else if (!Search.isNumer(iphone))
    {
      JOptionPane.showMessageDialog(null, "电话格式有误!");
      this.tel.setText("");
    }
    else
    {
      InsertDB.Insert(istuno, iname, igender, birthday, ipoutlook, iaddress, iphone, idormitory);
      
      this.stuno.setText("");this.name.setText("");this.gender.setText("");this.bir.setText("");
      this.po.setText("");this.add.setText("");this.tel.setText("");this.dn.setText("");
    }
  }
  
  private void nameActionPerformed(ActionEvent evt) {}
  
  public static void main(String[] args)
  {
    try
    {
      UIManager.LookAndFeelInfo[] arrayOfLookAndFeelInfo;
      int j = (arrayOfLookAndFeelInfo = UIManager.getInstalledLookAndFeels()).length;
      for (int i = 0; i < j; i++)
      {
        UIManager.LookAndFeelInfo info = arrayOfLookAndFeelInfo[i];
        if ("Nimbus".equals(info.getName()))
        {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Insert().setVisible(true);
      }
    });
  }
}
