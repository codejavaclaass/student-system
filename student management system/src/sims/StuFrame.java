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

public class StuFrame
  extends JFrame
{
  private JButton SFSearch;
  private JButton jButton2;
  private JDesktopPane jDesktopPane1;
  private JLabel jLabel1;
  private JLabel jLabel2;
  
  public StuFrame()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    this.jDesktopPane1 = new JDesktopPane();
    this.jLabel2 = new JLabel();
    this.jLabel1 = new JLabel();
    this.SFSearch = new JButton();
    this.jButton2 = new JButton();
    
    setDefaultCloseOperation(3);
    
    this.jLabel2.setFont(new Font("微软雅黑", 0, 24));
    this.jLabel2.setForeground(new Color(255, 255, 255));
    this.jLabel2.setText("学生界面");
    
    this.jDesktopPane1.setLayer(this.jLabel2, JLayeredPane.DEFAULT_LAYER.intValue());
    
    GroupLayout jDesktopPane1Layout = new GroupLayout(this.jDesktopPane1);
    this.jDesktopPane1.setLayout(jDesktopPane1Layout);
    jDesktopPane1Layout.setHorizontalGroup(
      jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jDesktopPane1Layout.createSequentialGroup()
      .addComponent(this.jLabel2, -2, 175, -2)
      .addGap(0, 0, 32767)));
    
    jDesktopPane1Layout.setVerticalGroup(
      jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel2, -1, 63, 32767));
    
    this.jLabel1.setText("功能选择");
    
    this.SFSearch.setText("学生信息查询");
    this.SFSearch.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        StuFrame.this.SFSearchActionPerformed(evt);
      }
    });
    this.jButton2.setText("退出登录");
    this.jButton2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        StuFrame.this.jButton2ActionPerformed(evt);
      }
    });
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGap(33, 33, 33)
      .addComponent(this.jLabel1))
      .addGroup(layout.createSequentialGroup()
      .addGap(102, 102, 102)
      .addComponent(this.SFSearch)))
      .addContainerGap(231, 32767))
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addGap(0, 0, 32767)
      .addComponent(this.jButton2)
      .addGap(29, 29, 29))
      .addComponent(this.jDesktopPane1));
    
    layout.setVerticalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jDesktopPane1, -2, -1, -2)
      .addGap(36, 36, 36)
      .addComponent(this.jLabel1)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.SFSearch)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 116, 32767)
      .addComponent(this.jButton2)
      .addGap(18, 18, 18)));
    
    setLocation(700, 250);
    
    pack();
  }
  
  private void jButton2ActionPerformed(ActionEvent evt)
  {
    Login L = new Login();
    L.setVisible(true);
    setVisible(false);
  }
  
  private void SFSearchActionPerformed(ActionEvent evt)
  {
    String str = "select * from sims";
    String[][] strs = Strsselect.select(str);
    
    new sStuinfor(strs).setVisible(true);
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
      Logger.getLogger(StuFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(StuFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(StuFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(StuFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new StuFrame().setVisible(true);
      }
    });
  }
}
