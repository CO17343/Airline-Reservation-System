package p2;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class fourth extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
	JTextField t1,t2,t3,t4,t5,t6;
	JPasswordField t7,t8;
	JRadioButton r1,r2,r3;
	JComboBox c1,c2,c3,c4;
	JButton b1,b2,b3;
	ButtonGroup bg;
	ImageIcon i1;
	fourth()
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
		i1=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\sky.jpg");
		l1=new JLabel("First Name");
		t1=new JTextField(20);
		l2=new JLabel("Last Name");
		t2=new JTextField(20);
		l3=new JLabel("Gender");
		l4=new JLabel("DOB");
		l5=new JLabel("Date");
		l6=new JLabel("Month");
		l7=new JLabel("Year");
		l8=new JLabel("Email id");
		t3=new JTextField(20);
		l9=new JLabel("Contact No.");
		t4=new JTextField(20);
		l10=new JLabel("Nationality");
		l11=new JLabel("Address");
		t5=new JTextField(20);
		l12=new JLabel("Username");
		t6=new JTextField(20);
		l13=new JLabel("Password");
		t7=new JPasswordField(20);
		l14=new JLabel("*");
		l15=new JLabel("*");
		l16=new JLabel("*");
		l17=new JLabel("*");
		l18=new JLabel("NOTE : Important fields are marked with asterisk !!!");
		t8=new JPasswordField(20);
		l19=new JLabel("Confirm Password");
		l20=new JLabel("*");
		l21=new JLabel(i1);
		l1.setFont(new Font("Times New Roman",Font.BOLD,20));
		l2.setFont(new Font("Times New Roman",Font.BOLD,20));
		l3.setFont(new Font("Times New Roman",Font.BOLD,20));
		l4.setFont(new Font("Times New Roman",Font.BOLD,20));
		l5.setFont(new Font("Times New Roman",Font.BOLD,20));
		l6.setFont(new Font("Times New Roman",Font.BOLD,20));
		l7.setFont(new Font("Times New Roman",Font.BOLD,20));
		l8.setFont(new Font("Times New Roman",Font.BOLD,20));
		l9.setFont(new Font("Times New Roman",Font.BOLD,20));
		l10.setFont(new Font("Times New Roman",Font.BOLD,20));
		l11.setFont(new Font("Times New Roman",Font.BOLD,20));
		l12.setFont(new Font("Times New Roman",Font.BOLD,20));
		l13.setFont(new Font("Times New Roman",Font.BOLD,20));
		l14.setFont(new Font("Times New Roman",Font.BOLD,20));
		l15.setFont(new Font("Times New Roman",Font.BOLD,20));
		l16.setFont(new Font("Times New Roman",Font.BOLD,20));
		l17.setFont(new Font("Times New Roman",Font.BOLD,20));
		l18.setFont(new Font("Times New Roman",Font.BOLD,20));
		l19.setFont(new Font("Times New Roman",Font.BOLD,20));
		l20.setFont(new Font("Times New Roman",Font.BOLD,20));
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		r3=new JRadioButton("Others");
		r1.setActionCommand(r1.getText());
		r2.setActionCommand(r2.getText());
		r3.setActionCommand(r3.getText());
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		c1=new JComboBox();
		c2=new JComboBox();
		c3=new JComboBox();
		c4=new JComboBox();
		b1=new JButton("Cancel");
		b2=new JButton("Register");
		l18.setBounds(300,20,500,30);
		l1.setBounds(300,50,100,50);
		t1.setBounds(420,50,200,50);
		l14.setBounds(630,50,50,50);
		l2.setBounds(300,120,100,50);
		t2.setBounds(420,120,200,50);
		l3.setBounds(300,190,100,50);
		r1.setBounds(420,190,100,50);
		r2.setBounds(540,190,100,50);
		r3.setBounds(660,190,100,50);
		l4.setBounds(300,260,100,50);
		l5.setBounds(420,260,50,50);
		c2.setBounds(480,275,50,20);
		l6.setBounds(540,260,50,50);
		c3.setBounds(600,275,100,20);
		l7.setBounds(720,260,50,50);
		c4.setBounds(780,275,100,20);
		l8.setBounds(300,330,100,50);
		t3.setBounds(420,330,200,50);
		l9.setBounds(300,400,150,50);
		t4.setBounds(420,400,200,50);
		l15.setBounds(630,400,50,50);
		l10.setBounds(300,470,100,50);
		c1.setBounds(420,470,200,30);
		l11.setBounds(300,540,100,50);
		t5.setBounds(420,540,200,50);
		l12.setBounds(300,610,100,50);
		t6.setBounds(420,610,200,50);
		l16.setBounds(630,610,50,50);
		l13.setBounds(300,680,100,50);
		t7.setBounds(420,680,200,50);
		l17.setBounds(630,680,50,50);
		l19.setBounds(250,750,200,50);
		t8.setBounds(420,750,200,50);
		l20.setBounds(630,750,50,50);
		b1.setBounds(300,820,100,50);
		b2.setBounds(500,820,100,50);
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
		ResultSet rs2=stm.executeQuery("select * from months");
		while(rs2.next())
		{
			String s2=rs2.getString("month");
			c3.addItem(s2);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i=1;i<=30;i++)
		{
			c2.addItem(i);
		}
		for(int j=1900;j<=2040;j++)
		{
			c4.addItem(j);
		}
		b1.addActionListener(this);
		b2.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		t4.addActionListener(this);
		t5.addActionListener(this);
		t6.addActionListener(this);
		t7.addActionListener(this);

		l21.add(l1);
		l21.add(l2);
		l21.add(l3);
		l21.add(l4);
		l21.add(l5);
		l21.add(l6);
		l21.add(l7);
		l21.add(l8);
		l21.add(l9);
		l21.add(l10);
		l21.add(l11);
		l21.add(l12);
		l21.add(l13);
		l21.add(l14);
		l21.add(l15);
		l21.add(l16);
		l21.add(l17);
		l21.add(l18);
		l21.add(l19);
		l21.add(l20);
		l21.add(t1);
		l21.add(t2);
		l21.add(t3);
		l21.add(t4);
		l21.add(t5);
		l21.add(t6);
		l21.add(t7);
		l21.add(t8);
		l21.add(c1);
		l21.add(c2);
		l21.add(c3);
		l21.add(c4);
		l21.add(r1);
		l21.add(r2);
		l21.add(r3);
		l21.add(b1);
		l21.add(b2);
		l21.setLayout(null);
		con.add(l21);
		setVisible(true);
	}
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent ae) {
	
		// TODO Auto-generated method stub
		//
		if(ae.getSource()==b2)
		{
			try
			{
				if(t1.getText().equals("")||t4.getText().equals("")||t6.getText().equals("")||t7.getText().equals("")||t8.getText().equals(""))
					JOptionPane.showMessageDialog(this,"Please enter the important fields");
				else
				{
				if(t7.getText().equals(t8.getText()))
				{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
				Statement stm=con.createStatement();
				String u=t6.getText();
				String p=t7.getText();
				String fname=t1.getText();
				String lname=t2.getText();
				String m=t3.getText();
				String contact=t4.getText();
				long c=Long.parseLong(contact);
				String ad=t5.getText();
				String nat=c1.getSelectedItem().toString();
				String date=c2.getSelectedItem().toString();
				String month=c3.getSelectedItem().toString();
				String y=c4.getSelectedItem().toString();
				String dob=date+month+y;
				String g=bg.getSelection().getActionCommand().toString();
				stm.executeUpdate("insert into signup_info values('"+u+"','"+p+"','"+fname+"','"+lname+"','"+g+"','"+dob+"','"+m+"','"+c+"','"+ad+"','"+nat+"')");
				//stm.executeUpdate("update signup_info set ='"+dob+"' where username='muskan' ");
				JOptionPane.showMessageDialog(this,"Registerd Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Please enter the password again !!!");
					t7.setText(null);
					t8.setText(null);
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
			new third();
			setVisible(false);
		}
		
	}
	/*public static void main(String args[])
	{
		fourth ob=new fourth();
	}*/


}
