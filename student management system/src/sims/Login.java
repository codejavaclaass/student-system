package sims;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login
  extends JFrame
{
  private JButton Login;
  private JPasswordField Password;
  private JTextField Username;
  private JButton jButton1;
  private JDesktopPane jDesktopPane1;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JPanel jPanel1;
  private JPanel jPanel2;
  
  public Login()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    this.jPanel2 = new JPanel();
    this.jPanel1 = new JPanel();
    this.jLabel2 = new JLabel();
    this.jLabel3 = new JLabel();
    this.Username = new JTextField();
    this.Login = new JButton();
    this.jDesktopPane1 = new JDesktopPane();
    this.jLabel1 = new JLabel();
    this.Password = new JPasswordField();
    this.jButton1 = new JButton();
    
    GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
    this.jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGap(0, 100, 32767));
    
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGap(0, 100, 32767));
    
    setDefaultCloseOperation(3);
    
    this.jPanel1.setForeground(new Color(153, 255, 153));
    
    this.jLabel2.setFont(new Font("Î¢ÈíÑÅºÚ", 0, 12));
    this.jLabel2.setText("ÓÃ»§Ãû");
    
    this.jLabel3.setFont(new Font("Î¢ÈíÑÅºÚ", 0, 12));
    this.jLabel3.setText("ÃÜÂë");
    
    this.Username.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Login.this.UsernameActionPerformed(evt);
      }
    });
    this.Login.setFont(new Font("Î¢ÈíÑÅºÚ", 0, 14));
    this.Login.setText("µÇÂ¼");
    this.Login.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Login.this.LoginActionPerformed(evt);
      }
    });
    this.jLabel1.setFont(new Font("Î¢ÈíÑÅºÚ", 0, 24));
    this.jLabel1.setForeground(new Color(255, 255, 255));
    this.jLabel1.setText("ÏµÍ³µÇÂ¼");
    
    this.jDesktopPane1.setLayer(this.jLabel1, JLayeredPane.DEFAULT_LAYER.intValue());
    
    GroupLayout jDesktopPane1Layout = new GroupLayout(this.jDesktopPane1);
    this.jDesktopPane1.setLayout(jDesktopPane1Layout);
    jDesktopPane1Layout.setHorizontalGroup(
      jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jDesktopPane1Layout.createSequentialGroup()
      .addComponent(this.jLabel1, -2, 174, -2)
      .addGap(0, 0, 32767)));
    
    jDesktopPane1Layout.setVerticalGroup(
      jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel1, GroupLayout.Alignment.TRAILING, -1, 66, 32767));
    
    this.Password.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Login.this.PasswordActionPerformed(evt);
      }
    });
    this.jButton1.setFont(new Font("Î¢ÈíÑÅºÚ", 0, 14));
    this.jButton1.setText("ÍË³ö");
    this.jButton1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Login.this.jButton1ActionPerformed(evt);
      }
    });
    GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
    this.jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jDesktopPane1)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(71, 71, 71)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(this.Login, -2, 146, -2)
      .addGap(28, 28, 28)
      .addComponent(this.jButton1))
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(this.jLabel2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.Username, -2, 213, -2))
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(this.jLabel3)
      .addGap(18, 18, 18)
      .addComponent(this.Password, -2, 93, -2)))
      .addContainerGap(82, 32767)));
    
    jPanel1Layout.linkSize(0, new Component[] { this.Login, this.jButton1 });
    
    jPanel1Layout.linkSize(0, new Component[] { this.Password, this.Username });
    
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(this.jDesktopPane1, -2, -1, -2)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(56, 56, 56)
      .addComponent(this.jLabel2))
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(52, 52, 52)
      .addComponent(this.Username, -2, 29, -2)))
      .addGap(18, 18, 18)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel3)
      .addComponent(this.Password, -2, 15, -2))
      .addGap(68, 68, 68)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.Login, -2, 41, -2)
      .addComponent(this.jButton1))
      .addContainerGap(85, 32767)));
    
    jPanel1Layout.linkSize(1, new Component[] { this.Login, this.jButton1 });
    
    jPanel1Layout.linkSize(1, new Component[] { this.Password, this.Username });
    
    setLocation(700, 250);
    getContentPane().add(this.jPanel1, "Center");
    
    pack();
  }
  
  private void LoginActionPerformed(ActionEvent evt)
  {
    String user = this.Username.getText().trim();
    
    String pass = this.Password.getText().trim();
    if (user.length() == 0)
    {
      JOptionPane.showMessageDialog(null, "ÓÃ»§Ãû²»ÄÜÎª¿Õ");
    }
    else if (pass.length() == 0)
    {
      JOptionPane.showMessageDialog(null, "ÃÜÂë²»ÄÜÎª¿Õ");
    }
    else if ((user.equals("admin")) && (pass.equals("123456")))
    {
      AdminFrame L1 = new AdminFrame();
      L1.setVisible(true);
      setVisible(false);
    }
    else if ((user.equals("113")) && (pass.equals("123456")))
    {
      StuFrame L = new StuFrame();
      L.setVisible(true);
      setVisible(false);
    }
    else
    {
      JOptionPane.showMessageDialog(null, "µÇÂ¼Ê§°Ü ÇëÖØÐÂµÇÂ¼");
      this.Username.setText("");
      this.Password.setText("");
    }
  }
  
  private void PasswordActionPerformed(ActionEvent evt) {}
  
  private void UsernameActionPerformed(ActionEvent evt) {}
  
  private void jButton1ActionPerformed(ActionEvent evt)
  {
    int yes = JOptionPane.showConfirmDialog(this, "È·ÈÏÍË³ö?", "ÌáÊ¾", 0);
    if (yes == 0) {
      System.exit(0);
    }
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
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Login().setVisible(true);
      }
    });
  }
}
