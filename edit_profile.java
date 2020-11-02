package p2;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class edit_profile extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l16;
JTextField t1,t2,t3,t4,t5,t8,t9,t10;
JPasswordField t6,t7;
JRadioButton r1,r2,r3;
JComboBox c1,c2,c3,c4;
JButton b1,b2,b3;
ButtonGroup bg;
ImageIcon i1;
edit_profile()
{
Container con=getContentPane();
setSize(500,500);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
l1=new JLabel("First Name");
t1=new JTextField(20);
l2=new JLabel("Last Name");
t2=new JTextField(20);
l3=new JLabel("Gender");
l4=new JLabel("DOB");
/*l5=new JLabel("Date");
l6=new JLabel("Month");
l7=new JLabel("Year");*/
l8=new JLabel("Email id");
t3=new JTextField(20);
l9=new JLabel("Contact No.");
t4=new JTextField(20);
l10=new JLabel("Nationality");
l11=new JLabel("Address");
l12=new JLabel("Password");
l13=new JLabel("Confirm Password");
l14=new JLabel("Username");
t8=new JTextField(20);
t9=new JTextField(20);
t10=new JTextField(20);
i1=new ImageIcon("C:\\\\Users\\\\MY LAPPY\\\\Downloads\\\\sky.jpg");
l16=new JLabel(i1);
t5=new JTextField(20);
t6=new JPasswordField(20);
t7=new JPasswordField(20);
/*r1=new JRadioButton("Male");
r2=new JRadioButton("Female");
r3=new JRadioButton("Others");
r1.setActionCommand(r1.getText());
r2.setActionCommand(r2.getText());
r3.setActionCommand(r3.getText());
bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);
bg.add(r3);*/
c1=new JComboBox();
/*c2=new JComboBox();
c3=new JComboBox();
c4=new JComboBox();*/
b1=new JButton("Cancel");
b2=new JButton("Update");
b3=new JButton("Search");
l1.setBounds(300,50,100,50);
t1.setBounds(420,50,200,50);
l14.setBounds(700,50,100,50);
t8.setBounds(820,50,200,50);
b3.setBounds(820,110,100,50);
l2.setBounds(300,120,100,50);
t2.setBounds(420,120,200,50);
l3.setBounds(300,190,100,50);
t9.setBounds(420,190,200,50);
/*r1.setBounds(420,190,80,80);
r2.setBounds(500,190,80,80);
r3.setBounds(580,190,80,80);*/
l4.setBounds(300,260,100,50);
t10.setBounds(420,260,200,50);
//l5.setBounds(420,260,50,50);
//c2.setBounds(480,275,50,20);
//l6.setBounds(540,260,50,50);
//c3.setBounds(600,275,100,20);
//l7.setBounds(720,260,50,50);
//c4.setBounds(780,275,100,20);
l8.setBounds(300,330,100,50);
t3.setBounds(420,330,200,50);
l9.setBounds(300,400,200,50);
t4.setBounds(420,400,200,50);
l10.setBounds(300,470,100,50);
c1.setBounds(420,470,200,30);
l11.setBounds(300,540,100,50);
t5.setBounds(420,540,200,50);
l12.setBounds(300,610,100,50);
l13.setBounds(250,680,200,50);
t6.setBounds(420,610,200,50);
t7.setBounds(420,680,200,50);
b1.setBounds(300,750,100,50);
b2.setBounds(420,750,100,50);
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
Statement stm=con1.createStatement();
ResultSet rs1=stm.executeQuery("select * from nationality");
while(rs1.next())
{
String s1=rs1.getString("country");
c1.addItem(s1);
}
/*ResultSet rs2=stm.executeQuery("select * from months");
while(rs2.next())
{
String s2=rs2.getString("month");
c3.addItem(s2);
}*/
}
catch(Exception e)
{
System.out.println(e);
}
/*for(int i=1;i<=31;i++)
{
c2.addItem(i);
}
for(int j=1900;j<=2040;j++)
{
c4.addItem(j);
}*/
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
t1.addActionListener(this);
t2.addActionListener(this);
t3.addActionListener(this);
t4.addActionListener(this);
t5.addActionListener(this);
l1.setFont(new Font("Times New Roman",Font.BOLD,20));
l2.setFont(new Font("Times New Roman",Font.BOLD,20));
l3.setFont(new Font("Times New Roman",Font.BOLD,20));
l4.setFont(new Font("Times New Roman",Font.BOLD,20));
/*l5.setFont(new Font("Times New Roman",Font.BOLD,20));
l6.setFont(new Font("Times New Roman",Font.BOLD,20));
l7.setFont(new Font("Times New Roman",Font.BOLD,20));*/
l8.setFont(new Font("Times New Roman",Font.BOLD,20));
l9.setFont(new Font("Times New Roman",Font.BOLD,20));
l10.setFont(new Font("Times New Roman",Font.BOLD,20));
l11.setFont(new Font("Times New Roman",Font.BOLD,20));
l12.setFont(new Font("Times New Roman",Font.BOLD,20));
l13.setFont(new Font("Times New Roman",Font.BOLD,20));
t1.setFont(new Font("Times New Roman",Font.BOLD,20));
t2.setFont(new Font("Times New Roman",Font.BOLD,20));
t3.setFont(new Font("Times New Roman",Font.BOLD,20));
t4.setFont(new Font("Times New Roman",Font.BOLD,20));
t5.setFont(new Font("Times New Roman",Font.BOLD,20));
t6.setFont(new Font("Times New Roman",Font.BOLD,20));
t7.setFont(new Font("Times New Roman",Font.BOLD,20));
b1.setFont(new Font("Times New Roman",Font.BOLD,20));
b2.setFont(new Font("Times New Roman",Font.BOLD,20));
l14.setFont(new Font("Times New Roman",Font.BOLD,20));
b3.setFont(new Font("Times New Roman",Font.BOLD,20));
b1.setFont(new Font("Times New Roman",Font.BOLD,20));
t8.setFont(new Font("Times New Roman",Font.BOLD,20));
l16.add(l1);
l16.add(l2);
l16.add(l3);
l16.add(l4);
/*l16.add(l5);
l16.add(l6);
l16.add(l7);*/
l16.add(l8);
l16.add(l9);
l16.add(l10);
l16.add(l11);
l16.add(l12);
l16.add(l13);
l16.add(l14);
l16.add(t1);
l16.add(t2);
l16.add(t3);
l16.add(t4);
l16.add(t5);
l16.add(t6);
l16.add(t7);
l16.add(t8);
l16.add(c1);
/*l16.add(c2);
l16.add(c3);
l16.add(c4);
l16.add(r1);
l16.add(r2);
l16.add(r3);*/
l16.add(t9);
l16.add(t10);
l16.add(b1);
l16.add(b2);
l16.add(b3);
con.add(l16);
l16.setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent ae) {
if(ae.getSource()==b3)
{
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
	Statement stm=con.createStatement();
	ResultSet rs=stm.executeQuery("select * from signup_info");
	while(rs.next())
	{
		t1.setText(rs.getString("First_name"));
		t2.setText(rs.getString("Last_name"));
		t3.setText(rs.getString("Email_id"));
		t4.setText(rs.getString("Contact_no"));
		t5.setText(rs.getString("Address"));
		t6.setText(rs.getString("Password"));
		t7.setText(rs.getString("Password"));
		//t7.setText(rs.getString(1));
		t9.setText(rs.getString("Gender"));
		t10.setText(rs.getString("Date_of_birth"));
		c1.setSelectedItem(rs.getString("Nationality"));
	}
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
if(ae.getSource()==b2)
{
try
{
	if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||t7.getText().equals("")||t9.getText().equals("")||t10.getText().equals(""))
		JOptionPane.showMessageDialog(this,"Please all the important fields");
	else
	{
if(t6.getText().equals(t7.getText()))
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
Statement stm=con.createStatement();
String fname=t1.getText();
String lname=t2.getText();
String m=t3.getText();
String contact=t4.getText();
long c=Long.parseLong(contact);
String ad=t5.getText();
String nat=c1.getSelectedItem().toString();
/*String date=c2.getSelectedItem().toString();
String month=c3.getSelectedItem().toString();
String y=c4.getSelectedItem().toString();*/
String dob=t10.getText();
String p=t6.getText();
String u=t8.getText();
String g=t9.getText();
//stm.executeUpdate("insert into signup_info values('"+fname+"','"+lname+"','"+g+"','"+dob+"','"+m+"','"+c+"','"+ad+"','"+nat+"')");
stm.executeUpdate("update signup_info set First_name='"+fname+"',Last_name='"+lname+"',Gender='"+g+"',Date_of_birth='"+dob+"',Email_id='"+m+"',Contact_no='"+c+"',Address='"+ad+"',Nationality='"+nat+"',Password='"+p+"' where Username='"+u+"'");
JOptionPane.showMessageDialog(this,"Updated Successfully");
}
else if(!t6.getText().equals(t7.getText()))
{
	JOptionPane.showMessageDialog(this,"Please re-enter the password");
	t6.setText(null);
	t7.setText(null);
}
}
}
catch(Exception e)
{
System.out.println(e);
}
}
else if(ae.getSource()==b1)
{
new user_login();
setVisible(false);
//setVisible(false);

}
}
/*public static void main(String args[])
{
	edit_profile ob=new edit_profile();
}*/


}














