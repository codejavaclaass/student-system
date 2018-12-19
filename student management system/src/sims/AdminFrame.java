package sims;

import db.Strsselect;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class AdminFrame
  extends JFrame
{
  private static final long serialVersionUID = 1L;
  private JButton AStuinfor;
  private JButton Edit;
  private JButton jButton4;
  private JDesktopPane jDesktopPane1;
  private JLabel jLabel1;
  private JLabel jLabel2;
  
  public AdminFrame()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    this.jDesktopPane1 = new JDesktopPane();
    this.jLabel1 = new JLabel();
    this.AStuinfor = new JButton();
    this.Edit = new JButton();
    this.jButton4 = new JButton();
    this.jLabel2 = new JLabel();
    
    setDefaultCloseOperation(3);
    
    this.jLabel1.setFont(new Font("微软雅黑", 0, 24));
    this.jLabel1.setForeground(new Color(255, 255, 255));
    this.jLabel1.setText("管理员界面");
    
    this.jDesktopPane1.setLayer(this.jLabel1, JLayeredPane.DEFAULT_LAYER.intValue());
    
    GroupLayout jDesktopPane1Layout = new GroupLayout(this.jDesktopPane1);
    this.jDesktopPane1.setLayout(jDesktopPane1Layout);
    jDesktopPane1Layout.setHorizontalGroup(
      jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jDesktopPane1Layout.createSequentialGroup()
      .addComponent(this.jLabel1, -2, 193, -2)
      .addGap(0, 0, 32767)));
    
    jDesktopPane1Layout.setVerticalGroup(
      jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel1, -1, 63, 32767));
    
    this.AStuinfor.setText("查看学生信息");
    this.AStuinfor.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        AdminFrame.this.AStuinforActionPerformed(evt);
      }
    });
    this.Edit.setText("管理学生信息");
    this.Edit.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        AdminFrame.this.EditActionPerformed(evt);
      }
    });
    this.jButton4.setText("退出登录");
    this.jButton4.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        AdminFrame.this.jButton4ActionPerformed(evt);
      }
    });
    this.jLabel2.setText("功能选择");
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGap(118, 118, 118)
      .addComponent(this.AStuinfor)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.Edit))
      .addGroup(layout.createSequentialGroup()
      .addGap(42, 42, 42)
      .addComponent(this.jLabel2)))
      .addContainerGap(100, 32767))
      .addComponent(this.jDesktopPane1)
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addGap(0, 0, 32767)
      .addComponent(this.jButton4)
      .addGap(26, 26, 26)));
    
    layout.setVerticalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jDesktopPane1, -2, -1, -2)
      .addGap(66, 66, 66)
      .addComponent(this.jLabel2)
      .addGap(16, 16, 16)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.AStuinfor)
      .addComponent(this.Edit))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 109, 32767)
      .addComponent(this.jButton4)
      .addGap(19, 19, 19)));
    
    setLocation(700, 250);
    pack();
  }
  
  private void jButton4ActionPerformed(ActionEvent evt)
  {
    Login L = new Login();
    L.setVisible(true);
    setVisible(false);
  }
  
  private void AStuinforActionPerformed(ActionEvent evt)
  {
    String str = "select * from sims";
    String[][] strs = Strsselect.select(str);
    new aStuinfor(strs).setVisible(true);
    setVisible(false);
  }
  
  private void EditActionPerformed(ActionEvent evt)
  {
    String str = "select * from sims";
    String[][] strs = Strsselect.select(str);
    Stuinedit Stuinedit = new Stuinedit(strs);
    Stuinedit.setVisible(true);
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
      Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new AdminFrame().setVisible(true);
      }
    });
  }
}
