package p2;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
public class flightstatus extends JFrame implements ActionListener{
JButton b1,b2,b3;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
JTextField t1,t2,t3,t4,t5,t6,t7,t8;
JComboBox cb1,cb2;
ImageIcon i1,i2;
flightstatus()
{
Container con=getContentPane();
setSize(500,500);
i1=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\sky.jpg");
i2=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\Airlines Reservation System Java Project\\Airlines Reservation\\web\\flashing_arrow.gif");
l1=new JLabel("Flight Status");
l2=new JLabel("Source");
l3=new JLabel("Destination");
l4=new JLabel("Date of departure");
l5=new JLabel(i1);
l6=new JLabel("DD/MM/YYYY");
l7=new JLabel("Flight id");
l8=new JLabel("Flight Name");
l9=new JLabel("Date of Arrival");
l10=new JLabel("Seats");
l11=new JLabel("Fare");
l12=new JLabel("Departure time");
l13=new JLabel("Arrival Time");
b1=new JButton("Search");
b2=new JButton("Book Flight");
b3=new JButton(i2);
cb1=new JComboBox();
cb2=new JComboBox();
cb1.addItem("DELHI");
cb1.addItem("AFGANISTAN");
cb1.addItem("LONDON");
cb1.addItem("MUMBAI");
cb1.addItem("SAN FRANSISCO");
cb1.addItem("NEW YORK");
cb1.addItem("CHANDIGARH");
cb1.addItem("KOLKATA");
cb1.addItem("DUBAI");
cb1.addItem("ATLANTA");
cb1.addItem("BEIJING");
cb1.addItem("LOS ANEGLES");
cb1.addItem("TOKOYO");
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
cb2.addItem("DELHI");
cb2.addItem("AFGANISTAN");
cb2.addItem("LONDON");
cb2.addItem("MUMBAI");
cb2.addItem("SAN FRANSISCO");
cb2.addItem("NEW YORK");
cb2.addItem("CHANDIGARH");
cb2.addItem("KOLKATA");
cb2.addItem("DUBAI");
cb2.addItem("ATLANTA");
cb2.addItem("BEIJING");
cb2.addItem("LOS ANEGLES");
cb2.addItem("TOKOYO");
cb2.addItem("CHICAGO");
cb2.addItem("HONG KONG");
cb2.addItem("SHANGHAI");
cb2.addItem("PARIS");
cb2.addItem("AMSTERDAM");
cb2.addItem("SEOUL");
cb2.addItem("ISTANBUL");
cb2.addItem("SINGAPORE");
cb2.addItem("DENVER");
cb2.addItem("FRANKFURT");
t1=new JTextField(30);
t2=new JTextField(30);
t3=new JTextField(30);
t4=new JTextField(30);
t5=new JTextField(30);
t6=new JTextField(30);
t7=new JTextField(30);
t8=new JTextField(30);
cb1.setBounds(700,140,200,30);
cb2.setBounds(700,200,200,30);
t1.setBounds(700,260,100,30);
l1.setBounds(600,50,200,100);
l2.setBounds(500,100,200,100);
l3.setBounds(500,160,200,100);
l4.setBounds(450,220,300,100);
l6.setBounds(850,260,250,20);
b1.setBounds(650,330,130,40);
l7.setBounds(500,400,200,30);
l8.setBounds(500,450,200,30);
l9.setBounds(500,500,200,30);
l10.setBounds(500,550,200,30);
l11.setBounds(500,600,200,30);
l12.setBounds(500,650,200,30);
l13.setBounds(500,700,200,30);
t2.setBounds(700,400,200,30);
t3.setBounds(700,450,200,30);
t4.setBounds(700,500,200,30);
t5.setBounds(700,550,200,30);
t6.setBounds(700,600,200,30);
t7.setBounds(700,650,200,30);
t8.setBounds(700,700,200,30);
b2.setBounds(650,750,130,40);
b3.setBounds(300,750,100,50);
l1.setFont(new Font("Times New Roman",Font.BOLD,30));
l2.setFont(new Font("Times New Roman",Font.BOLD,30));
l3.setFont(new Font("Times New Roman",Font.BOLD,30));
l4.setFont(new Font("Times New Roman",Font.BOLD,30));
l5.setFont(new Font("Times New Roman",Font.BOLD,30));
l6.setFont(new Font("Times New Roman",Font.BOLD,30));
l7.setFont(new Font("Times New Roman",Font.BOLD,30));
l8.setFont(new Font("Times New Roman",Font.BOLD,30));
l9.setFont(new Font("Times New Roman",Font.BOLD,30));
l10.setFont(new Font("Times New Roman",Font.BOLD,30));
l11.setFont(new Font("Times New Roman",Font.BOLD,30));
l12.setFont(new Font("Times New Roman",Font.BOLD,30));
l13.setFont(new Font("Times New Roman",Font.BOLD,30));
t1.setFont(new Font("Times New Roman",Font.BOLD,30));
t2.setFont(new Font("Times New Roman",Font.BOLD,30));
t3.setFont(new Font("Times New Roman",Font.BOLD,30));
t4.setFont(new Font("Times New Roman",Font.BOLD,30));
t5.setFont(new Font("Times New Roman",Font.BOLD,30));
t6.setFont(new Font("Times New Roman",Font.BOLD,30));
t7.setFont(new Font("Times New Roman",Font.BOLD,30));
t8.setFont(new Font("Times New Roman",Font.BOLD,30));
b1.setFont(new Font("Times New Roman",Font.BOLD,30));
b2.setFont(new Font("Times New Roman",Font.BOLD,30));
b3.setFont(new Font("Times New Roman",Font.BOLD,30));
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
l5.add(b1);
l5.add(l1);
l5.add(l2);
l5.add(l3);
l5.add(l4);
l5.add(l6);
l5.add(l7);
l5.add(l8);
l5.add(l9);
l5.add(l10);
l5.add(l11);
l5.add(l12);
l5.add(l13);
l5.add(t1);
l5.add(t2);
l5.add(t3);
l5.add(t4);
l5.add(t5);
l5.add(t6);
l5.add(t7);
l5.add(t8);
l5.add(cb1);
l5.add(cb2);
l5.add(b2);
l5.add(b3);
l5.setLayout(null);
con.add(l5);
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
try
{

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
Statement stm=con.createStatement();
String from=cb1.getSelectedItem().toString();
String to=cb2.getSelectedItem().toString();
String dod=t1.getText();
/*System.out.println(from);
System.out.println(to);
System.out.println(dod);*/
ResultSet rs=stm.executeQuery("select * from flight_details where Source='"+from+"'AND Destination='"+to+"' AND date_of_departure='"+dod+"'");
while(rs.next())
{
/*System.out.println(rs.getObject(1));
System.out.println(rs.getObject(2));
System.out.println(rs.getObject(3));*/
t2.setText(rs.getString("Flight_id"));
t3.setText(rs.getString("Flight_name"));
t4.setText(rs.getString("date_of_arrival"));
t5.setText(rs.getString("Seats"));
t6.setText(rs.getString("Fare"));
t7.setText(rs.getString("Departure_Time"));
t8.setText(rs.getString("Arrival_Time"));
}
}
catch(Exception e)
{
System.out.println(e);
}

}
 if(ae.getSource()==b2)
{
	String i=t2.getText();
	int id=Integer.parseInt(i);
	String f=t6.getText();
	int fare=Integer.parseInt(f);
	new b(id,fare);
}
 else if(ae.getSource()==b3)
 {
	 new user_login();
	 setVisible(false);
 }
}
/*public static void main(String args[])
{
flightstatus ob=new flightstatus();
}*/

}


 
