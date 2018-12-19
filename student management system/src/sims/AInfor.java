package sims;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AInfor
  extends JFrame
{
  String[][] strs;
  private JButton Button1;
  private JLabel jLabel1;
  private JScrollPane jScrollPane2;
  private JTable jTable2;
  
  public AInfor(String[][] strs)
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
    this.jTable2 = new JTable(rowData, columnNames);
    
    this.jScrollPane2.setViewportView(this.jTable2);
  }
  
  private void initComponents()
  {
    this.jLabel1 = new JLabel();
    this.Button1 = new JButton();
    this.jScrollPane2 = new JScrollPane();
    
    setDefaultCloseOperation(3);
    
    this.jLabel1.setFont(new Font("宋体", 0, 36));
    this.jLabel1.setForeground(new Color(255, 0, 0));
    this.jLabel1.setText("      学生信息");
    
    this.Button1.setText("返回上一级");
    this.Button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        AInfor.this.Button1ActionPerformed(evt);
      }
    });
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.Button1)
      .addComponent(this.jScrollPane2, -2, 774, -2))
      .addGap(46, 46, 46)
      .addComponent(this.jLabel1, -2, 368, -2)
      .addContainerGap(-1, 32767)));
    
    layout.setVerticalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(this.jLabel1, -2, 57, -2)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.Button1)
      .addGap(15, 15, 15)
      .addComponent(this.jScrollPane2, -2, -1, -2)
      .addGap(39, 39, 39)))
      .addGap(9, 9, 9)));
    
    setLocation(700, 250);
    
    pack();
  }
  
  private void Button1ActionPerformed(ActionEvent evt)
  {
    new ASearch().setVisible(true);
    setVisible(false);
  }
}
