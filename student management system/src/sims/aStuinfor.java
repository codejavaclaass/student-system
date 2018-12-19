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
import javax.swing.table.DefaultTableModel;

public class aStuinfor
  extends JFrame
{
  String[][] strs;
  private JButton jButton1;
  private JButton ASSearch;
  private JDesktopPane jDesktopPane1;
  private JLabel jLabel1;
  private JScrollPane jScrollPane1;
  private JTable jTable1;
  private JButton sreturn;
  
  public aStuinfor(String[][] strs)
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
  
  public aStuinfor()
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
    this.sreturn = new JButton();
    this.ASSearch = new JButton();
    
    setDefaultCloseOperation(3);
    
    this.jLabel1.setFont(new Font("微软雅黑", 0, 24));
    this.jLabel1.setForeground(new Color(240, 240, 240));
    this.jLabel1.setText("学生信息 ");
    
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
    
    this.jTable1.setModel(new DefaultTableModel(
      new Object[][] {
      new Object[8], 
      new Object[8], 
      new Object[8], 
      new Object[8], 
      new Object[8], 
      new Object[8], 
      new Object[8], 
      new Object[8], 
      new Object[8], 
      new Object[8], 
      new Object[8], 
      new Object[8], 
      new Object[8], 
      new Object[8], 
      new Object[8] }, 
      
      new String[] {
      "学号", "姓名", "性别", "出生日期", "政治面貌", "家庭住址", "电话", "宿舍号" })
      {
        Class[] types = {
          String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class };
        
        public Class getColumnClass(int columnIndex)
        {
          return this.types[columnIndex];
        }
      });
    this.jScrollPane1.setViewportView(this.jTable1);
    
    this.jButton1.setText("退出登录");
    this.jButton1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        aStuinfor.this.jButton1ActionPerformed(evt);
      }
    });
    this.sreturn.setText("返回上一级");
    this.sreturn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        aStuinfor.this.sreturnActionPerformed(evt);
      }
    });
    this.ASSearch.setText("查询");
    this.ASSearch.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        aStuinfor.this.ASSearchActionPerformed(evt);
      }
    });
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jDesktopPane1)
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addGap(21, 21, 21)
      .addComponent(this.ASSearch)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.sreturn)
      .addGap(18, 18, 18)
      .addComponent(this.jButton1)
      .addGap(26, 26, 26))
      .addComponent(this.jScrollPane1, -1, 663, 32767));
    
    layout.setVerticalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jDesktopPane1, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.jScrollPane1, -2, 316, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, 32767)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jButton1)
      .addComponent(this.sreturn)
      .addComponent(this.ASSearch))
      .addGap(22, 22, 22)));
    
    setLocation(700, 250);
    
    pack();
  }
  
  private void jButton1ActionPerformed(ActionEvent evt)
  {
    Login L = new Login();
    L.setVisible(true);
    setVisible(false);
  }
  
  private void ASSearchActionPerformed(ActionEvent evt)
  {
    ASearch se = new ASearch();
    se.setVisible(true);
    setVisible(false);
  }
  
  private void sreturnActionPerformed(ActionEvent evt)
  {
    AdminFrame stu = new AdminFrame();
    stu.setVisible(true);
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
      Logger.getLogger(aStuinfor.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(aStuinfor.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(aStuinfor.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(aStuinfor.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new aStuinfor().setVisible(true);
      }
    });
  }
}
