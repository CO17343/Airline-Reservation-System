package p2;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class fifth extends JFrame implements ActionListener{
	JTextField t1,t2;
	JLabel l1,l2,l3,l4;
	JButton b1,b2;
	ImageIcon i1,i2;
	int flag;
	fifth()
	{
		Container con=getContentPane();
		setSize(500,500);
		setTitle("User Login Page");
		i1=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\sky.jpg");
		i2=new ImageIcon("C:\\\\Users\\\\MY LAPPY\\\\Downloads\\\\Airlines Reservation System Java Project\\\\Airlines Reservation\\\\web\\\\flashing_arrow.gif");
		l3=new JLabel(i1);
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		t1=new JTextField(200);
		t2=new JTextField(200);
		b1=new JButton("Login");
		b2=new JButton(i2);
		l4=new JLabel("User Login Portal");
		l4.setFont(new Font("Times New Roman",Font.BOLD,60));
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		l2.setFont(new Font("Times New Roman",Font.BOLD,30));
		t1.setFont(new Font("Times New Roman",Font.BOLD,30));
		t2.setFont(new Font("Times New Roman",Font.BOLD,30));
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
		b1.addActionListener(this);
		b2.addActionListener(this);
		l1.setBounds(400,300,200,70);
		l2.setBounds(400,500,200,70);
		t1.setBounds(700,300,200,70);
		t2.setBounds(700,500,200,70);
		b1.setBounds(700,700,200,70);
		b2.setBounds(400,700,50,30);
		l4.setBounds(400,100,600,70);
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
				});
		l3.add(l1);
		l3.add(l2);
		l3.add(t1);
		l3.add(t2);
		l3.add(b1);
		l3.add(b2);
		l3.add(l4);
		con.add(l3);
		l3.setLayout(null);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae) {
		try 
		{
			if(ae.getSource()==b1)
			{
			if(t1.getText().contentEquals("")||t2.getText().contentEquals(""))
			{
				JOptionPane.showMessageDialog(this,"Username Or Password must not be Null");
				return;
			}
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select username,password from signup_info");
		    while(rs.next())
		    {
		    	if(t1.getText().contentEquals(rs.getString(1))&&t2.getText().contentEquals(rs.getString(2)))
		    	{
		    		String u=rs.getString("Username");
		    		String p=rs.getString("Password");
		    		flag=1;
		    		break;
		    	}
		    	
		    }
		    if(flag==1)
		    {
		    	setVisible(false);
		    	new user_login();
		    	
		    }
			 else 
			    {
			    	JOptionPane.showMessageDialog(this,"Username Or Password may be incorrect");
			    	t1.setText(null);
			    	t2.setText(null);
			    }
			}
			else if(ae.getSource()==b2)
			{
				new third();
				setVisible(false);
			}
		    
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//setVisible(false);
		
	}
	/*public static void main(String args[])
	{
		fifth ob=new fifth();
	}*/
	
	
}

