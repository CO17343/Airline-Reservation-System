package p2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class user_login extends JFrame{
	JTabbedPane tp;
	ImageIcon i1;
	user_login()
	{
		Container con=getContentPane();
		setSize(500,500);
		//setLayout(null);
		//i1=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\sky.jpg");
		//i2=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\Airlines Reservation System Java Project\\Airlines Reservation\\web\\flashing_arrow.gif");
		//l1=new JLabel(i1);
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
				});
		tp=new JTabbedPane();
		tp.addTab("Profile",new profile());
		tp.addTab("Manage Trips",new manage_trips());
		//tp.addTab("Contact",new contact());
		//tp.add(l1);
		con.add(tp);
		setVisible(true);
	}
	/*public static void main(String args[])
	{
		user_login ob=new user_login();
	}*/
	
}
class profile extends JPanel implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3;
	ImageIcon i1,i2;
	profile()
	{
		setLayout(null);
		//i1=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\sky.jpg");
		//l1=new JLabel(i1);
		i2=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\Airlines Reservation System Java Project\\Airlines Reservation\\web\\flashing_arrow.gif");
		b1=new JButton("Edit Profile");
		b2=new JButton("LogOut");
		b3=new JButton(i2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b1.setBounds(700,300,400,100);
		b2.setBounds(700,600,400,100);
		b3.setBounds(300,600,100,50);
		//add(l1);
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
	    b2.setFont(new Font("Times New Roman",Font.BOLD,30));
		add(b1);
		add(b2);
		add(b3);
		
	}
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b2)
		{
			new first();
			setVisible(false);
		}
		
		else if(ae.getSource()==b1)
		{
			new edit_profile();
			setVisible(false);
		}
		else if(ae.getSource()==b3)
		{
			new fifth();
			setVisible(false);
		}
		
	}
	
}
class manage_trips extends JPanel implements ActionListener
{
	JButton b1,b2,b3;
	ImageIcon i2;
	manage_trips()
	{
		setLayout(null);
		b1=new JButton("Check Flight Status");
		b3=new JButton("Cancel Ticket");
		i2=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\Airlines Reservation System Java Project\\Airlines Reservation\\web\\flashing_arrow.gif");
		b2=new JButton(i2);
		b1.addActionListener(this);
	    b2.addActionListener(this);
		b3.addActionListener(this);
		b1.setBounds(700,300,400,100);
		b2.setBounds(300,600,100,50);
		b3.setBounds(700,600,400,100);
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
	    b3.setFont(new Font("Times New Roman",Font.BOLD,30));
		add(b1);
		//add(b2);
		add(b2);
		add(b3);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		{
			new flightstatus();
			setVisible(false);
		}
		else if(ae.getSource()==b2)
		{
			new fifth();
			setVisible(false);
		}
		else if(ae.getSource()==b3) {
			new cancel_ticket();
			setVisible(false);
		}
	}
	
}
