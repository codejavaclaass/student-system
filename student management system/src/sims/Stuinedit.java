package sims;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Stuinedit
  extends JFrame
{
  String[][] strs;
  private JButton jButton1;
  private JButton jButton3;
  private JButton add;
  private JButton delete;
  private JButton mod;
  private JDesktopPane jDesktopPane1;
  private JLabel jLabel1;
  private JScrollPane jScrollPane1;
  private JTable jTable1;
  
  public Stuinedit(String[][] strs)
  {
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
  
  public Stuinedit()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    this.jDesktopPane1 = new JDesktopPane();
    this.jLabel1 = new JLabel();
    this.jScrollPane1 = new JScrollPane();
    this.jTable1 = new JTable();
    this.jButton1 = new JButton();
    this.jButton3 = new JButton();
    
    this.add = new JButton();
    this.delete = new JButton();
    this.mod = new JButton();
    
    setDefaultCloseOperation(3);
    
    this.jLabel1.setFont(new Font("微软雅黑", 0, 24));
    this.jLabel1.setForeground(new Color(255, 255, 255));
    this.jLabel1.setText("学生信息管理");
    
    this.jDesktopPane1.setLayer(this.jLabel1, JLayeredPane.DEFAULT_LAYER.intValue());
    
    GroupLayout jDesktopPane1Layout = new GroupLayout(this.jDesktopPane1);
    this.jDesktopPane1.setLayout(jDesktopPane1Layout);
    jDesktopPane1Layout.setHorizontalGroup(
      jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jDesktopPane1Layout.createSequentialGroup()
      .addComponent(this.jLabel1, -2, 208, -2)
      .addGap(0, 0, 32767)));
    
    jDesktopPane1Layout.setVerticalGroup(
      jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel1, -1, 63, 32767));
    
    this.jScrollPane1.setViewportView(this.jTable1);
    
    this.jButton1.setFont(new Font("微软雅黑", 0, 15));
    this.jButton1.setText("退出登录");
    this.jButton1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Stuinedit.this.jButton1ActionPerformed(evt);
      }
    });
    this.jButton3.setFont(new Font("微软雅黑", 0, 15));
    this.jButton3.setText("返回上一级");
    this.jButton3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Stuinedit.this.jButton3ActionPerformed(evt);
      }
    });
    this.add.setText("新增");
    this.add.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Stuinedit.this.addActionPerformed(evt);
      }
    });
    this.delete.setText("删除");
    this.delete.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Stuinedit.this.deleteActionPerformed(evt);
      }
    });
    this.mod.setText("修改");
    this.mod.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Stuinedit.this.modActionPerformed(evt);
      }
    });
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jDesktopPane1)
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addContainerGap()
      
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.add)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.delete)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.mod)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 130, 32767)
      .addComponent(this.jButton3)
      .addGap(18, 18, 18)
      .addComponent(this.jButton1)
      .addGap(26, 26, 26))
      .addComponent(this.jScrollPane1));
    
    layout.setVerticalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jDesktopPane1, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.jScrollPane1, -2, 317, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, 32767)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jButton1)
      .addComponent(this.jButton3)
      
      .addComponent(this.add)
      .addComponent(this.delete)
      .addComponent(this.mod))
      .addGap(22, 22, 22)));
    
    setLocation(700, 250);
    
    pack();
  }
  
  protected void modActionPerformed(ActionEvent evt)
  {
    new AModify().setVisible(true);
    setVisible(false);
  }
  
  protected void deleteActionPerformed(ActionEvent evt)
  {
    new ADelete().setVisible(true);
    setVisible(false);
  }
  
  private void jButton1ActionPerformed(ActionEvent evt)
  {
    Login L = new Login();
    L.setVisible(true);
    setVisible(false);
  }
  
  private void jButton3ActionPerformed(ActionEvent evt)
  {
    AdminFrame adf = new AdminFrame();
    adf.setVisible(true);
    setVisible(false);
  }
  
  private void addActionPerformed(ActionEvent evt)
  {
    new Insert().setVisible(true);
    setVisible(false);
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
      Logger.getLogger(Stuinedit.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(Stuinedit.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(Stuinedit.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(Stuinedit.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Stuinedit().setVisible(true);
      }
    });
  }
}
