package p2;
import javax.swing.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
public class update extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b1,b2,b3;
    ImageIcon i1,i2;
    JComboBox cb,cb1;
update()
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
    i2=new ImageIcon("C:\\\\Users\\\\MY LAPPY\\\\Downloads\\\\Airlines Reservation System Java Project\\\\Airlines Reservation\\\\web\\\\flashing_arrow.gif");
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
        i1=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\sky.jpg");
        l10=new JLabel(i1);
        b3=new JButton(i2);
        l1=new JLabel("FLIGHT DETAILS");
        l2=new JLabel("FLIGHT ID");
        l3=new JLabel("SOURCE");
        l4=new JLabel("DEPARTURE");
        l5=new JLabel("FLIGHT NAME");
        l6=new JLabel("FLIGHT CHARGES");
        l7=new JLabel("DATE OF DEPARTURE");
        l8=new JLabel("ARRIVAL TIME");
        l9=new JLabel("DESTINATION");
        l11=new JLabel("DATE OF ARRIVAL");
        b1=new JButton("UPDATE DETAILS");
        b2=new JButton("SEARCH");
        b2.addActionListener(this);
        b3.addActionListener(this);
        b1.addActionListener(this);
        l1.setBounds(650, 30, 200, 50);
        l2.setBounds(350, 100, 200, 50);
        l3.setBounds(350, 150, 200, 50);
        l4.setBounds(350, 200, 200, 50);
        l5.setBounds(350, 250, 200, 50);
        l6.setBounds(350, 300, 200, 50);
        l7.setBounds(350, 350, 250, 50);
        l11.setBounds(1000, 250, 200, 50);
        l8.setBounds(1000, 200, 200, 50);
        l9.setBounds(1000, 150, 200, 50);
        b1.setBounds(600, 410, 250, 50);
        b2.setBounds(900, 100, 200, 50);
        b3.setBounds(500,410,100,50);
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t6=new JTextField();
        t7=new JTextField();
        t8=new JTextField();
        t9=new JTextField();
        t1.setBounds(600, 110, 200, 30);
        cb.setBounds(600, 160, 200, 30);
        t3.setBounds(600, 210, 200, 30);    
        t4.setBounds(600, 260, 200, 30);
        t5.setBounds(600, 310, 200, 30);
        t6.setBounds(600, 360, 200, 30);
        t7.setBounds(1250, 250, 200, 30);
        cb1.setBounds(1250, 160, 200, 30);
        t9.setBounds(1250, 210, 200, 30);
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
        t1.setFont(new Font("Times New Roman",Font.BOLD,20));
        t2.setFont(new Font("Times New Roman",Font.BOLD,20));
        t3.setFont(new Font("Times New Roman",Font.BOLD,20));
        t4.setFont(new Font("Times New Roman",Font.BOLD,20));
        t5.setFont(new Font("Times New Roman",Font.BOLD,20));
        t6.setFont(new Font("Times New Roman",Font.BOLD,20));
        t7.setFont(new Font("Times New Roman",Font.BOLD,20));
        l8.setFont(new Font("Times New Roman",Font.BOLD,20));
        t9.setFont(new Font("Times New Roman",Font.BOLD,20));
        b1.setFont(new Font("Times New Roman",Font.BOLD,20));
        b2.setFont(new Font("Times New Roman",Font.BOLD,20));
        l10.add(l1);
        l10.add(l2);
        l10.add(l3);
        l10.add(l4);
        l10.add(l5);
        l10.add(l6);
        l10.add(l7);
        l10.add(l8);
        l10.add(l9);
        l10.add(t1);
        l10.add(t2);
        l10.add(t3);
        l10.add(t4);
        l10.add(t5);
        l10.add(t6);
        l10.add(t7);
        l10.add(t8);
        l10.add(t9);
        l10.add(b1);
        l10.add(b2);
        l10.add(b3);
        l10.add(l11);
        l10.add(cb);
        l10.add(cb1);
        con.add(l10);
        l10.setLayout(null);
        setVisible(true);
}
catch(Exception e)
{
System.out.println(e);
}
}
/*public static void main(String s[])
{
update ob=new update();
}*/
public void actionPerformed(ActionEvent ae) {
	// TODO Auto-generated method stub
	if(ae.getSource()==b2)
	{
		try
		{
			String s=t1.getText();
			int i=Integer.parseInt(s);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from flight_details where flight_id='"+i+"'");
			while(rs.next())
			{
				cb.setSelectedItem(rs.getString("Source"));
				cb1.setSelectedItem(rs.getString("Destination"));
				t3.setText(rs.getString("Departure_Time"));
				t4.setText(rs.getString("Flight_name"));
				t5.setText(rs.getString("Fare"));
				t6.setText(rs.getString("date_of_departure"));
				t9.setText(rs.getString("Arrival_Time"));
				t7.setText(rs.getString("date_of_arrival"));
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	else if(ae.getSource()==b1)
	{
		try
		{
			String s=cb.getSelectedItem().toString();
			String d=cb1.getSelectedItem().toString();
			String dt=t3.getText();
			String n=t4.getText();
			String fc=t5.getText();
			int c=Integer.parseInt(fc);
			String dod=t6.getText();
			String at=t9.getText();
			String doa=t7.getText();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			Statement stm=con.createStatement();
			stm.executeUpdate("update flight_details set Source='"+s+"',Destination='"+d+"',Departure_Time='"+dt+"',Arrival_Time='"+at+"',Flight_name='"+n+"',date_of_arrival='"+doa+"',Fare='"+c+"',date_of_departure='"+dod+"'");
			t3.setText(null);
			t4.setText(null);
			t5.setText(null);
			t6.setText(null);
			t7.setText(null);
			t9.setText(null);
			cb.setSelectedItem(null);
			cb1.setSelectedItem(null);
			
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
}


