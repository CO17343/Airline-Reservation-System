package p2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class second extends JFrame implements ActionListener{
	JTextField t1;
	JPasswordField t2;
	JLabel l1,l2,l3,l4;
	JButton b1,b2;
	ImageIcon i1,i2;
	second()
	{
		Container con=getContentPane();
		setSize(500,500);
		setTitle("Admin Login Page");
		i1=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\sky.jpg");
		i2=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\Airlines Reservation System Java Project\\Airlines Reservation\\web\\flashing_arrow.gif");
		l3=new JLabel(i1);
		l4=new JLabel("Welcome Admin !!!");
		l4.setFont(new Font("Times New Roman",Font.BOLD,60));
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		t1=new JTextField(200);
		t2=new JPasswordField(200);
		b1=new JButton("Login");
		b2=new JButton(i2);
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		l2.setFont(new Font("Times New Roman",Font.BOLD,30));
		t1.setFont(new Font("Times New Roman",Font.BOLD,30));
		t2.setFont(new Font("Times New Roman",Font.BOLD,30));
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
		b1.addActionListener(this);
		b2.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
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
		// TODO Auto-generated method stub
		if(ae.getSource()==b1)
		{
			if(t1.getText().contentEquals("admin")&&t2.getText().contentEquals("admin123"))
			{
				new fourteenth();
			   setVisible(false);
			}
			else if(t1.getText().contentEquals("")||t2.getText().contentEquals(""))
				JOptionPane.showMessageDialog(this,"Username Or Password must not be Null");
			else
			{
				JOptionPane.showMessageDialog(this,"Username Or Password may be incorrect");
				t1.setText(null);
				t2.setText(null);
			}
				
			//setVisible(false);
		}
		else if(ae.getSource()==b2)
		{
			new first();
		}
		
	}
	/*public static void main(String args[])
	{
		second ob=new second();
	}
	*/
	
}
