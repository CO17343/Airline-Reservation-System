package p2;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class add extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JButton b1,b2,b3;
    ImageIcon i1,i2;
    JComboBox cb,cb1;
    add()
    {
    Container con=getContentPane();
    setSize(400,500);
    addWindowListener(new WindowAdapter()
    {
     	public void WindowClosing(WindowEvent we)
     	{
     	System.exit(0);
     	}
    });
    i2=new ImageIcon("C:\\\\Users\\\\MY LAPPY\\\\Downloads\\\\Airlines Reservation System Java Project\\\\Airlines Reservation\\\\web\\\\flashing_arrow.gif");
    b3=new JButton(i2);
    cb=new JComboBox();
    cb1=new JComboBox();
    cb.addItem("DELHI");
    cb.addItem("AFGHANISTAN");
    cb.addItem("LONDON");
    cb.addItem("MUMBAI");
    cb.addItem("SAN FRANSISCO");
    cb.addItem("NEW YORK");
    cb.addItem("CHANDIGARH");
    cb.addItem("KOLKATA");
    cb.addItem("DUBAI");
    cb.addItem("ATLANTA");
    cb.addItem("BEIJING");
    cb.addItem("LOS ANGELES");
    cb.addItem("TOKYO");
    cb.addItem("CHICAGO");
    cb.addItem("HONG KONG");
    cb.addItem("SHANGHAI");
    cb.addItem("PARIS");
    cb.addItem("AMSTERDAM");
    cb.addItem("SEOUL");
    cb.addItem("ISTANBUL");
    cb.addItem("SINGAPORE");
    cb.addItem("DENVER");
    cb.addItem("FRANKFURT");
    cb1.addItem("DELHI");
    cb1.addItem("AFGHANISTAN");
    cb1.addItem("LONDON");
    cb1.addItem("MUMBAI");
    cb1.addItem("SAN FRANSISCO");
    cb1.addItem("NEW YORK");
    cb1.addItem("CHANDIGARH");
    cb1.addItem("KOLKATA");
    cb1.addItem("DUBAI");
    cb1.addItem("ATLANTA");
    cb1.addItem("BEIJING ");
    cb1.addItem("LOS ANGELES");
    cb1.addItem("TOKYO");
    cb1.addItem("CHICAGO");
    cb1.addItem("HONG KONG");
    cb1.addItem("SHANGHAI");
    cb1.addItem("PARIS");
    cb1.addItem("AMSTERDAM");
    cb1.addItem("SEOUL");
    cb1.addItem("ISTANBUL");
    cb1.addItem("SINGAPORE");
    cb1.addItem("DENVER");
    cb1.addItem("FRANKFURT");
    cb.addActionListener(this);
    cb1.addActionListener(this);
    cb1.setBounds(1200, 160, 200, 30);
    cb.setBounds(600, 160, 200, 30);
    i1=new ImageIcon("C:\\\\Users\\\\MY LAPPY\\\\Downloads\\\\sky.jpg");
   	l10=new JLabel(i1);
    l1=new JLabel("FLIGHT DETAILS");
    //l2=new JLabel("FLIGHT ID");
    l3=new JLabel("SOURCE");
    l4=new JLabel("DEPARTURE TIME");
    l5=new JLabel("DATE OF DEPARTURE");
    l6=new JLabel("FLIGHT NAME");
    l7=new JLabel("FLIGHT CHARGES");
    l8=new JLabel("ARRIVAL TIME");
    l9=new JLabel("DESTINATION");
    l11=new JLabel("SEATS");
    l12=new JLabel("DATE OF ARRIVAL");
    b1=new JButton("ADD FLIGHT");
    b1.addActionListener(this);
    b3.addActionListener(this);
    //b2=new JButton("SEARCH");
    l1.setBounds(650, 50, 200, 50);
    //l2.setBounds(350, 100, 100, 50);
    l3.setBounds(350, 150,200, 50);
    l4.setBounds(350, 200,200, 50);
    l5.setBounds(350, 250, 250, 50);
    l6.setBounds(350, 300, 200, 50);
    l7.setBounds(350, 350, 200, 50);
    l8.setBounds(1000, 200, 200, 50);
    l9.setBounds(1000, 150, 200, 50);
    l11.setBounds(350, 400, 200, 50);
    l12.setBounds(350,460,200,50);
    b1.setBounds(600, 550, 200, 50);
    b3.setBounds(500, 550, 100, 50);
    //b2.setBounds(750, 100, 100, 50);
    //t1=new JTextField();
    //t2=new JTextField();
    t3=new JTextField();
    t4=new JTextField();
    t5=new JTextField();
    t6=new JTextField();
    t7=new JTextField();
    t8=new JTextField();
    t10=new JTextField();
    t3.setBounds(600, 210, 200, 30);    
    t4.setBounds(600, 260, 200, 30);
    t5.setBounds(600, 310, 200, 30);
    t6.setBounds(600, 360, 200, 30);
    t7.setBounds(600, 410, 200, 30);
    t8.setBounds(1200, 210, 200, 30);
    t10.setBounds(600,460,200,30);
    l1.setFont(new Font("Times New Roman",Font.BOLD,20));
    l3.setFont(new Font("Times New Roman",Font.BOLD,20));
    l4.setFont(new Font("Times New Roman",Font.BOLD,20));
    l5.setFont(new Font("Times New Roman",Font.BOLD,20));
    l6.setFont(new Font("Times New Roman",Font.BOLD,20));
    l7.setFont(new Font("Times New Roman",Font.BOLD,20));
    l8.setFont(new Font("Times New Roman",Font.BOLD,20));
    l9.setFont(new Font("Times New Roman",Font.BOLD,20));
    l12.setFont(new Font("Times New Roman",Font.BOLD,20));
    l10.setFont(new Font("Times New Roman",Font.BOLD,20));
    l11.setFont(new Font("Times New Roman",Font.BOLD,20));
    t3.setFont(new Font("Times New Roman",Font.BOLD,20));
    t4.setFont(new Font("Times New Roman",Font.BOLD,20));
    t5.setFont(new Font("Times New Roman",Font.BOLD,20));
    t6.setFont(new Font("Times New Roman",Font.BOLD,20));
    t7.setFont(new Font("Times New Roman",Font.BOLD,20));
    l8.setFont(new Font("Times New Roman",Font.BOLD,20));
    l11.setFont(new Font("Times New Roman",Font.BOLD,20));
    b1.setFont(new Font("Times New Roman",Font.BOLD,20));
    l10.add(l1);
    l10.add(l3);
    l10.add(l4);
    l10.add(l5);
    l10.add(l6);
    l10.add(l7);
    l10.add(l8);
    l10.add(l9);
    l10.add(l12);
    l10.add(b1);
    l10.add(b3);
    l10.add(t3);
    l10.add(t4);
    l10.add(t5);
    l10.add(t6);
    l10.add(t7);
    l10.add(t8);
    l10.add(l11);
    l10.add(cb);
    l10.add(cb1);
    l10.add(t10);
    con.add(l10);
    l10.setLayout(null);
    setVisible(true);
    }
public void actionPerformed(ActionEvent ae) {
// TODO Auto-generated method stub
	if(ae.getSource()==b1)
	{
		try
		{
			String s=cb.getSelectedItem().toString();
			String d=cb1.getSelectedItem().toString();
			String dt=t3.getText();
			String dod=t4.getText();
			//int i=Integer.parseInt(id);
			String n=t5.getText();
			String charges=t6.getText();
			int c=Integer.parseInt(charges);
			String seat=t7.getText();
			int seats=Integer.parseInt(seat);
			String doa=t10.getText();
			String at=t8.getText();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			Statement stm=con.createStatement();
			//stm.executeUpdate("insert into flight_details values('"+i+"','"+n+"','"+s+"','"+d+"','"+fc+"','"+dt+"','"+at+"','"+seats+"','"+c"')");
			stm.executeUpdate("insert into flight_details values(null,'"+n+"','"+s+"','"+d+"','"+dt+"','"+at+"','"+seats+"','"+c+"','"+dod+"','"+doa+"')");		
			JOptionPane.showMessageDialog(this,"added successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	else if(ae.getSource()==b3)
	{
		new fourteenth();
		setVisible(false);
	}

}
/*public static void main(String s[])
{
add ob=new add();
}*/
}


