package p2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class fourteenth extends JFrame{
	JTabbedPane tp;
	fourteenth()
	{
		Container con=getContentPane();
		tp=new JTabbedPane();
		tp.addTab("Schedule Flights",new schedule_flight());
		//tp.addTab("View Passenger",new view_passenger());
		setSize(500,500);
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
				});
		con.add(tp);
		setVisible(true);
	}
	/*public static void main(String args[])
	{
		fourteenth ob=new fourteenth();
	}*/
	
}
class schedule_flight extends JPanel implements ActionListener
{
	JButton b1,b2,b3,b4;
	ImageIcon i2;
	schedule_flight()
	{
		setLayout(null);
		 i2=new ImageIcon("C:\\\\Users\\\\MY LAPPY\\\\Downloads\\\\Airlines Reservation System Java Project\\\\Airlines Reservation\\\\web\\\\flashing_arrow.gif");
		b1=new JButton("Add Flight");
		b2=new JButton("Update Flight");
		b3=new JButton("Delete Flight");
		b4=new JButton(i2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b1.setBounds(700,200,400,100);
		b2.setBounds(700,400,400,100);
		b3.setBounds(700,600,400,100);
		b4.setBounds(300,600,100,50);
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
	    b2.setFont(new Font("Times New Roman",Font.BOLD,30));
	    b3.setFont(new Font("Times New Roman",Font.BOLD,30));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1)
		{
			new add();
			setVisible(false);
		}
		else if(ae.getSource()==b2)
		{
			new update();
			setVisible(false);
		}
		else if(ae.getSource()==b3)
		{
			new delete1();
			setVisible(false);
		}
		else if(ae.getSource()==b4)
		{
			new second();
			setVisible(false);
		}
	}
	
}
/*class view_passenger extends JPanel
{
	JButton b1,b2,b3;
	view_passenger()
	{
		
	}
}*/