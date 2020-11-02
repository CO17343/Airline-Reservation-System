package p2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class third extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	JLabel l1,l2,l3;
	ImageIcon i1,i2;
	third()
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
		i2=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\Airlines Reservation System Java Project\\Airlines Reservation\\web\\flashing_arrow.gif");
		l2=new JLabel(i1);
		l1=new JLabel("New User");
		b1=new JButton("Login");
		b2=new JButton("Sign Up");
		b3=new JButton(i2);
		l3=new JLabel("Welcome User !!!");
		l3.setFont(new Font("Times New Roman",Font.BOLD,60));
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
		b2.setFont(new Font("Times New Roman",Font.BOLD,30));
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b1.setBounds(800,300,200,100);
		b2.setBounds(800,500,200,100);
		l1.setBounds(600,500,200,100);
		b3.setBounds(600,650,50,30);
		l3.setBounds(700,100,600,70);
		l2.add(b1);
		l2.add(b2);
		l2.add(l1);
		l2.add(b3);
		l2.add(l3);
		con.add(l2);
		l2.setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			new fifth();
			setVisible(false);
		}
		else if(ae.getSource()==b2)
		{
			new fourth();
			setVisible(false);
			
		}
		else if(ae.getSource()==b3)
		{
			new first();
			setVisible(false);
	   }
	/*public static void main(String args[])
	{
		third ob=new third();
	}*/
}
}
