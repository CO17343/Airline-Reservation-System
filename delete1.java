package p2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class delete1 extends JFrame implements ActionListener{
       JButton b1,b2;
       JLabel l1,l2;
       JTextField t1;
       ImageIcon i1,i2;
       delete1()
       {
      try {
        Container con=getContentPane();
       	setSize(400,500);
       	addWindowListener(new WindowAdapter()
       	{
       	public void WindowClosing(WindowEvent we)
       	{
       	System.exit(0);
       	}
       	});
        t1=new JTextField();
        i1=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\sky.jpg");
        i2=new ImageIcon("C:\\\\Users\\\\MY LAPPY\\\\Downloads\\\\Airlines Reservation System Java Project\\\\Airlines Reservation\\\\web\\\\flashing_arrow.gif");
        l2=new JLabel(i1);
        l1=new JLabel("FLIGHT ID");
        b2=new JButton(i2);
        t1.setBounds(500, 200, 200, 50);
        l1.setBounds(350, 200, 200, 50); 
        b1=new JButton("DELETE");
        b1.addActionListener(this);
        b1.setBounds(750, 200, 200, 50);
        b2.setBounds(300, 400, 100, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        l1.setFont(new Font("Times New Roman",Font.BOLD,20));
        l2.setFont(new Font("Times New Roman",Font.BOLD,20));
        b1.setFont(new Font("Times New Roman",Font.BOLD,20));
        l2.add(t1);
        l2.add(l1);
        l2.add(b1);
        l2.add(b2);
        con.add(l2);
        l2.setLayout(null);
        setVisible(true);
       }
       catch(Exception e)
       {
      System.out.println(e);
       }
       }
      /*public static void main(String s[])
      {
      delete1 ob=new delete1();
      }*/
public void actionPerformed(ActionEvent ae) {
String s=t1.getText();
int id=Integer.parseInt(s);
if(ae.getSource()==b1)
{
	try
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
		Statement stm=con.createStatement();
		stm.executeUpdate("delete from  flight_details where Flight_id='"+id+"'");		
		JOptionPane.showMessageDialog(this,"deleted successfully");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
else if(ae.getSource()==b2)
{
	new fourteenth();
	setVisible(false);
}
}
}


