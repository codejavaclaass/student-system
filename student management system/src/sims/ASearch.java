package sims;

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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class ASearch
  extends JFrame
{
  private JButton SearchBut;
  private JTextField Searchname;
  private JTextField Searchstuno;
  private JButton Reset;
  private JButton ASearchReturn;
  private JDesktopPane jDesktopPane1;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JPanel jPanel1;
  private JPanel jPanel2;
  
  public ASearch()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    this.jPanel2 = new JPanel();
    this.jPanel1 = new JPanel();
    this.jLabel2 = new JLabel();
    this.jLabel3 = new JLabel();
    this.Searchname = new JTextField();
    this.SearchBut = new JButton();
    this.jDesktopPane1 = new JDesktopPane();
    this.jLabel1 = new JLabel();
    this.Reset = new JButton();
    this.ASearchReturn = new JButton();
    this.Searchstuno = new JTextField();
    
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
    
    this.jLabel2.setFont(new Font("Œ¢»Ì—≈∫⁄", 0, 14));
    this.jLabel2.setText("–’√˚");
    
    this.jLabel3.setFont(new Font("Œ¢»Ì—≈∫⁄", 0, 14));
    this.jLabel3.setText("—ß∫≈");
    
    this.Searchname.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        ASearch.this.SearchnameActionPerformed(evt);
      }
    });
    this.SearchBut.setFont(new Font("Œ¢»Ì—≈∫⁄", 0, 14));
    this.SearchBut.setText("≤È—Ø");
    this.SearchBut.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        ASearch.this.SearchButActionPerformed(evt);
      }
    });
    this.jLabel1.setFont(new Font("Œ¢»Ì—≈∫⁄", 0, 24));
    this.jLabel1.setForeground(new Color(255, 255, 255));
    this.jLabel1.setText("—ß…˙–≈œ¢≤È—Ø");
    
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
    
    this.Reset.setFont(new Font("Œ¢»Ì—≈∫⁄", 0, 14));
    this.Reset.setText("÷ÿ ‰");
    this.Reset.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        ASearch.this.ResetActionPerformed(evt);
      }
    });
    this.ASearchReturn.setFont(new Font("Œ¢»Ì—≈∫⁄", 0, 15));
    this.ASearchReturn.setText("∑µªÿ…œ“ªº∂");
    this.ASearchReturn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        ASearch.this.ASearchReturnActionPerformed(evt);
      }
    });
    this.Searchstuno.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        ASearch.this.SearchstunoActionPerformed(evt);
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
      .addGap(22, 22, 22)
      .addComponent(this.SearchBut, -2, 107, -2)
      .addGap(32, 32, 32)
      .addComponent(this.Reset, -2, 114, -2))
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(this.jLabel2)
      .addGap(18, 18, 18)
      .addComponent(this.Searchname, -2, 213, -2))
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(this.jLabel3)
      .addGap(18, 18, 18)
      .addComponent(this.Searchstuno, -2, -1, -2)))
      .addContainerGap(118, 32767))
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addComponent(this.ASearchReturn, -2, 118, -2)
      .addGap(22, 22, 22)));
    
    jPanel1Layout.linkSize(0, new Component[] { this.SearchBut, this.Reset });
    
    jPanel1Layout.linkSize(0, new Component[] { this.Searchname, this.Searchstuno });
    
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(this.jDesktopPane1, -2, -1, -2)
      .addGap(56, 56, 56)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel2)
      .addComponent(this.Searchname, -2, 29, -2))
      .addGap(16, 16, 16)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel3)
      .addComponent(this.Searchstuno, -2, -1, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 130, 32767))
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(0, 0, 32767)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.SearchBut, -2, 41, -2)
      .addComponent(this.Reset, -2, 41, -2))
      .addGap(54, 54, 54)))
      .addComponent(this.ASearchReturn, -2, 36, -2)
      .addContainerGap()));
    
    jPanel1Layout.linkSize(1, new Component[] { this.SearchBut, this.Reset });
    
    jPanel1Layout.linkSize(1, new Component[] { this.Searchname, this.Searchstuno });
    
    getContentPane().add(this.jPanel1, "Center");
    setLocation(700, 250);
    
    pack();
  }
  
  private void SearchButActionPerformed(ActionEvent evt)
  {
    String[][] strs = Search.serach(this.Searchname.getText(), this.Searchstuno.getText());
    new AInfor(strs).setVisible(true);
    setVisible(false);
  }
  
  private void SearchnameActionPerformed(ActionEvent evt) {}
  
  private void ResetActionPerformed(ActionEvent evt)
  {
    this.Searchname.setText("");
    this.Searchstuno.setText("");
  }
  
  private void ASearchReturnActionPerformed(ActionEvent evt)
  {
    String str = "select * from sims";
    String[][] strs = Strsselect.select(str);
    new aStuinfor(strs).setVisible(true);
    setVisible(false);
  }
  
  private void SearchstunoActionPerformed(ActionEvent evt) {}
  
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
      Logger.getLogger(ASearch.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(ASearch.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(ASearch.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(ASearch.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new ASearch().setVisible(true);
      }
    });
  }
}
