package sims;

import db.Strsselect;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AModify
  extends JFrame
{
  private JButton DReturn;
  private JTextField getstuno;
  private JDesktopPane jDesktopPane1;
  private JLabel jLabel1;
  private JLabel jLabel4;
  private JButton ok;
  
  public AModify()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    this.jDesktopPane1 = new JDesktopPane();
    this.jLabel4 = new JLabel();
    this.jLabel1 = new JLabel();
    this.getstuno = new JTextField();
    this.ok = new JButton();
    this.DReturn = new JButton();
    
    setDefaultCloseOperation(3);
    
    this.jLabel4.setFont(new Font("微软雅黑", 0, 24));
    this.jLabel4.setForeground(new Color(240, 240, 240));
    this.jLabel4.setText("修改学生信息");
    
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
    
    this.jLabel1.setFont(new Font("微软雅黑", 0, 18));
    this.jLabel1.setText("请输入学号:");
    
    this.ok.setFont(new Font("微软雅黑", 0, 15));
    this.ok.setText("确定");
    this.ok.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        AModify.this.okActionPerformed(evt);
      }
    });
    this.DReturn.setText("返回上一级");
    this.DReturn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        AModify.this.DReturnActionPerformed(evt);
      }
    });
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jDesktopPane1)
      .addGroup(layout.createSequentialGroup()
      .addGap(100, 100, 100)
      .addComponent(this.jLabel1)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.getstuno, -2, 242, -2)
      .addGap(26, 26, 26)
      .addComponent(this.ok)
      .addContainerGap(-1, 32767))
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addComponent(this.DReturn, -2, 123, -2)
      .addGap(31, 31, 31)));
    
    layout.setVerticalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jDesktopPane1, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 143, 32767)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel1)
      .addComponent(this.getstuno, -2, 39, -2)
      .addComponent(this.ok))
      .addGap(109, 109, 109)
      .addComponent(this.DReturn, -2, 37, -2)
      .addGap(22, 22, 22)));
    
    setLocation(700, 250);
    
    pack();
  }
  
  private void okActionPerformed(ActionEvent evt)
  {
    String str = "select * from sims where stuno = '" + this.getstuno.getText().trim() + "';";
    String[][] strs = Strsselect.select(str);
    if (strs[0][0] != null)
    {
      AModifystu adm = new AModifystu(strs);
      adm.setVisible(true);
      setVisible(false);
    }
    else
    {
      JOptionPane.showMessageDialog(null, "查无此人!");
      this.getstuno.setText("");
    }
  }
  
  private void DReturnActionPerformed(ActionEvent evt)
  {
    String str = "select * from sims;";
    String[][] strs = Strsselect.select(str);
    new Stuinedit(strs).setVisible(true);
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
      Logger.getLogger(AModify.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(AModify.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(AModify.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(AModify.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new AModify().setVisible(true);
      }
    });
  }
}
