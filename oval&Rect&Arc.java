//rect oval and arc

import java.awt.*;
import java.awt.event.*;
class Fdemo extends Frame implements ActionListener 
{
	Button b1,b2,b3;
	int c=0;
	boolean b=false;
	TextField t1,t2,t3;
  	Fdemo()
	{
		
		Font f=new Font("Century Schoolbook",Font.ITALIC,30);
		setFont(f);
		setLayout(null);
		setTitle("Games");
		 
		  b1=new Button("Rect");
		b1.setSize(100,50);
		b1.setLocation(50,50);
		add(b1);
		 
		  b2=new Button("Oval");
		b2.setLocation(150,50);	
		b2.setSize(100,50);
		add(b2);

		  b3=new Button("arc");
		b3.setLocation(250,50);	
		b3.setSize(100,50);
		add(b3);
		
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
		 
	}
	public void paint(Graphics g)
	{
		if(b)
		{
		
	       if(c==1)g.fillRect(100,200,100,100);
	      else if(c==2)g.fillOval(100,200,100,100);
	      else if(c==3) g.fillArc(100,200,100,100,0,180);
			 
 		}
	}
	public void actionPerformed(ActionEvent e)
	{ 
		b=true;
		
		  
		if(e.getSource()==b1)c=1;
		else if(e.getSource()==b2)c=2;
		else if(e.getSource()==b3)c=3;
	        repaint();
	}
}
class demo
{
public static void main(String ar[]) 
{
 Fdemo f=new Fdemo();
f.setVisible(true); 
f.setSize(700,600);
f.setBackground(Color.black);
f.setForeground(Color.white);
}
}