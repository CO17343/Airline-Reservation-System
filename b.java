package p2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class b extends JFrame implements ActionListener
{
	int id,fare;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JButton b1,b2;
	ImageIcon i1,i2;
	b(int id,int fare)
	{
		this.id=id;
		this.fare=fare;
		Container con=getContentPane();
		setSize(400,400);
		i1=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\sky.jpg");
		i2=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\Airlines Reservation System Java Project\\Airlines Reservation\\web\\flashing_arrow.gif");
		l1=new JLabel("username");
		l2=new JLabel("password");
		l3=new JLabel("Flight id");
		l4=new JLabel(i1);
		l5=new JLabel("Seat number");
		l6=new JLabel("Pay via Credit Card");
		l7=new JLabel("Amount");
		l8=new JLabel("Card number");
		l9=new JLabel("Validity");
		l10=new JLabel("CVV");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		t6=new JTextField(20);
		t7=new JTextField(20);
		t8=new JTextField(20);
		b1=new JButton("Save");
		b2=new JButton(i2);
		l1.setBounds(500,50,100,50);
		l2.setBounds(500,100,100,50);
		l3.setBounds(500,150,100,50);
		l5.setBounds(500,200,100,50);
		l6.setBounds(500,250,100,50);
		l7.setBounds(500,300,100,50);
		l8.setBounds(500,350,100,50);
		l9.setBounds(500,400,100,50);
		l10.setBounds(500,450,100,50);
		t1.setBounds(650,50,200,50);
		t2.setBounds(650,100,200,50);
		t3.setBounds(650,150,200,50);
		t4.setBounds(650,200,200,50);
		t5.setBounds(650,300,200,50);
		t6.setBounds(650,350,200,50);
		t7.setBounds(650,400,200,50);
		t8.setBounds(650,450,200,50);
		b1.setBounds(650,550,100,50);
		b2.setBounds(500,550,100,50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		l4.add(l1);
		l4.add(l2);
		l4.add(l3);
		l4.add(l6);
		l4.add(l7);
		l4.add(l8);
		l4.add(l9);
		l4.add(l10);
		l4.add(t1);
		l4.add(t2);
		l4.add(t3);
		l4.add(t5);
		l4.add(t6);
		l4.add(t7);
		l4.add(t8);
		l4.add(b1);
		l4.add(b2);
		l4.add(l5);
		l4.add(t4);
		t3.setText(Integer.toString(id));
		t5.setText(Integer.toString(fare));
		con.add(l4);
		l4.setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		int flag=0;
		if(ae.getSource()==b1)
		{
			String u=t1.getText();
			String p=t2.getText();
			String i=t3.getText();
			int id=Integer.parseInt(i);
			String s=t4.getText();
			String a=t5.getText();
			int amn=Integer.parseInt(a);
			String cn=t6.getText();
			String v=t7.getText();
			String c=t8.getText();
			int cvv=Integer.parseInt(c);
			try
			{

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			//stm.executeQuery("select * from flight_details where Source='"+from+"'AND Destination='"+to+"' AND date_of_departure='"+dod+"'");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select Username,Password from signup_info");
			while(rs.next())
			{
				if(rs.getString(1).equals(t1.getText())&&rs.getString(2).equals(t2.getText()))
				{
					stm.executeUpdate("insert into booking_details values(null,'"+u+"','"+p+"','"+id+"','"+s+"','"+amn+"','"+cn+"','"+cvv+"','"+v+"')");
					flag=1;
					JOptionPane.showMessageDialog(this,"your seat has been reserved !!");
				}
			}
			if(t1.getText().equals("")||t2.getText().equals("")||t4.getText().equals(""))
			{	
			JOptionPane.showMessageDialog(this,"please fill all the fields !!");
			}
			else if(flag!=1)
			{
				JOptionPane.showMessageDialog(this,"username or password is incorrect !!");
			}
			
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
		}
		else if(ae.getSource()==b2)
		{
			new flightstatus();
			setVisible(false);
		}
			
	}
	/*public static void main (String args[])
	{
		b ob = new b();

	}*/
	
}