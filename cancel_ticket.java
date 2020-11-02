package p2;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;
import java.awt.*;
public class cancel_ticket extends JFrame implements ActionListener{
JButton b1,b2;
JLabel l1,l2,l3,l4;
JTextField t1,t2;
ImageIcon i1,i2;
cancel_ticket()
{
Container con=getContentPane();
setSize(500,500);
i1=new ImageIcon("C:\\\\Users\\\\MY LAPPY\\\\Downloads\\\\sky.jpg");
i2=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\Airlines Reservation System Java Project\\Airlines Reservation\\web\\flashing_arrow.gif");
l1=new JLabel("Cancel Ticket");
l2=new JLabel("Flight id");
l3=new JLabel("Seat no");
l4=new JLabel(i1);
b1=new JButton("Ok");
b2=new JButton(i2);
t1=new JTextField(30);
t2=new JTextField(30);
b1.setBounds(700,400,130,50);
b2.setBounds(500,400,130,50);
t1.setBounds(700,200,200,50);
t2.setBounds(700,300,200,50);
l1.setBounds(500,100,400,100);
l2.setBounds(500,200,200,100);
l3.setBounds(500,300,200,100);
b1.addActionListener(this);
b2.addActionListener(this);
l1.setFont(new Font("Times New Roman",Font.BOLD,60));
l2.setFont(new Font("Times New Roman",Font.BOLD,30));
l3.setFont(new Font("Times New Roman",Font.BOLD,30));
t1.setFont(new Font("Times New Roman",Font.BOLD,30));
l2.setFont(new Font("Times New Roman",Font.BOLD,30));
b1.setFont(new Font("Times New Roman",Font.BOLD,30));
l4.add(b1);
l4.add(l1);
l4.add(l2);
l4.add(l3);
l4.add(t1);
l4.add(t2);
l4.add(b2);
l4.setLayout(null);
con.add(l4);
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
setVisible(true);
}

public void actionPerformed(ActionEvent ae) {
if(ae.getSource()==b1)
{
	String f=t1.getText();
	int fid=Integer.parseInt(f);
	String sno=t2.getText();
	int sn=Integer.parseInt(sno);
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
		Statement stm=con.createStatement();
		stm.executeUpdate("delete from booking_details where Flight_id='"+fid+"' AND Seat_no='"+sn+"'");
		JOptionPane.showMessageDialog(this,"Deleted successfully !!");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
else if(ae.getSource()==b2)
{
	new user_login();
	setVisible(false);
}
}
/*public static void main(String args[])
{
cancel_ticket ob=new cancel_ticket();
}*/

}

