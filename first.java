package p2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class first extends JFrame implements ActionListener{
	JButton b1,b2;
	JLabel l1,l2;
	ImageIcon i1;
	first()
	{
		try {
		Container con=getContentPane();
		setSize(500,500);
		i1=new ImageIcon("C:\\Users\\MY LAPPY\\Downloads\\sky.jpg");
		l1=new JLabel(i1);
		l2=new JLabel("Welcome to Indian Airlines");
		b1=new JButton("Admin");
		b2=new JButton("User");
		l2.setFont(new Font("Times New Roman", Font.BOLD,60));
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
		b2.setFont(new Font("Times New Roman",Font.BOLD,30));
		l2.setBounds(600,100,800,100);
		b1.setBounds(800,300,200,100);
		b2.setBounds(800,500,200,100);
		b1.addActionListener(this);
		b2.addActionListener(this);
		l1.add(b1);
		l1.add(b2);
		l1.add(l2);
		l1.setLayout(null);
		con.add(l1);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		setVisible(true);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1)
		{
			new second();
			setVisible(false);
		}
		else if(ae.getSource()==b2)
		{
			new third();
			setVisible(false);
		}
		
	}
	public static void main(String args[])
	{
		first ob=new first();
	}

}
