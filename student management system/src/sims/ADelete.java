package sims;

import db.Strsselect;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ADelete
  extends JFrame
{
  String[][] strs;
  private JButton DReturn;
  private JButton delete;
  private JTextField getstuno;
  private JDesktopPane jDesktopPane1;
  private JLabel jLabel1;
  private JLabel jLabel4;
  private JScrollPane jScrollPane1;
  private JTable jTable1;
  private JButton ok;
  
  public ADelete(String[][] strs)
  {
    this.strs = strs;
    initComponents();
    
    Vector<String> columnNames = new Vector();
    
    columnNames.add("学号");
    columnNames.add("姓名");
    columnNames.add("性别");
    columnNames.add("生日");
    columnNames.add("政治面貌");
    columnNames.add("地址");
    columnNames.add("电话");
    columnNames.add("宿舍号");
    
    Vector<Vector<String>> rowData = new Vector();
    for (int i = 0; i < 100; i++)
    {
      Vector<String> rowStrings = new Vector();
      for (int j = 0; j < 8; j++) {
        rowStrings.add(strs[i][j]);
      }
      rowData.add(rowStrings);
    }
    this.jTable1 = new JTable(rowData, columnNames);
    
    this.jScrollPane1.setViewportView(this.jTable1);
  }
  
  public ADelete()
  {
    initComponents();
  }

  private void initComponents()
  {
    this.jDesktopPane1 = new JDesktopPane();
    this.jLabel4 = new JLabel();
    this.jScrollPane1 = new JScrollPane();
    this.jTable1 = new JTable();
    this.jLabel1 = new JLabel();
    this.getstuno = new JTextField();
    this.ok = new JButton();
    this.delete = new JButton();
    this.DReturn = new JButton();
    
    setDefaultCloseOperation(3);
    
    this.jLabel4.setFont(new Font("微软雅黑", 0, 24));
    this.jLabel4.setForeground(new Color(240, 240, 240));
    this.jLabel4.setText("删除学生信息");
    
    this.jDesktopPane1.setLayer(this.jLabel4, JLayeredPane.DEFAULT_LAYER.intValue());
    
    GroupLayout jDesktopPane1Layout = new GroupLayout(this.jDesktopPane1);
    this.jDesktopPane1.setLayout(jDesktopPane1Layout);
    jDesktopPane1Layout.setHorizontalGroup(
      jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jDesktopPane1Layout.createSequentialGroup()
      .addComponent(this.jLabel4, -2, 282, -2)
      .addGap(0, 395, 32767)));
    
    jDesktopPane1Layout.setVerticalGroup(
      jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel4, -1, 83, 32767));
    
    this.jScrollPane1.setViewportView(this.jTable1);
    
    this.jLabel1.setFont(new Font("微软雅黑", 0, 18));
    this.jLabel1.setText("请输入学号:");
    
    this.ok.setFont(new Font("微软雅黑", 0, 15));
    this.ok.setText("确定");
    this.ok.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        ADelete.this.okActionPerformed(evt);
      }
    });
    this.delete.setText("删除");
    this.delete.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        ADelete.this.deleteActionPerformed(evt);
      }
    });
    this.DReturn.setText("返回上一级");
    this.DReturn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        ADelete.this.DReturnActionPerformed(evt);
      }
    });
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jDesktopPane1)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.DReturn)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.delete, -2, 88, -2)
      .addGap(25, 25, 25))
      .addGroup(layout.createSequentialGroup()
      .addGap(68, 68, 68)
      .addComponent(this.jLabel1)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.getstuno, -2, 242, -2)
      .addGap(26, 26, 26)
      .addComponent(this.ok)
      .addContainerGap(-1, 32767))
      .addComponent(this.jScrollPane1));
    
    layout.linkSize(0, new Component[] { this.DReturn, this.delete });
    
    layout.setVerticalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jDesktopPane1, -2, -1, -2)
      .addGap(32, 32, 32)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel1)
      .addComponent(this.getstuno, -2, 39, -2)
      .addComponent(this.ok))
      .addGap(18, 18, 18)
      .addComponent(this.jScrollPane1, -2, 113, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 78, 32767)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.DReturn)
      .addComponent(this.delete, -2, 37, -2))
      .addGap(33, 33, 33)));
    
    layout.linkSize(1, new Component[] { this.DReturn, this.delete });
    setLocation(700, 250);
    pack();
  }
  
  private void okActionPerformed(ActionEvent evt)
  {
    String str = "select * from sims where stuno = '" + this.getstuno.getText() + "';";
    String[][] strs = Strsselect.select(str);
    if (strs[0][0] != null)
    {
      ADelete1 ad = new ADelete1(strs);
      ad.setGetstuno1(this.getstuno.getText());
      ad.setVisible(true);
      setVisible(false);
    }
    else
    {
      JOptionPane.showMessageDialog(null, "查无此人");
      this.getstuno.setText("");
    }
  }
  
  private void DReturnActionPerformed(ActionEvent evt)
  {
    String str = "select * from sims";
    String[][] strs = Strsselect.select(str);
    new Stuinedit(strs).setVisible(true);
    setVisible(false);
  }
  
  private void deleteActionPerformed(ActionEvent evt)
  {
    JOptionPane.showMessageDialog(null, "请输入学号");
  }
  
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
      Logger.getLogger(ADelete.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(ADelete.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(ADelete.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(ADelete.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new ADelete().setVisible(true);
      }
    });
  }
}
