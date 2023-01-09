import java.awt.*;
import java.awt.event.*;
class Fdemo extends Frame implements ActionListener 
{
	Button b1[];
	int i,j,k=0;
	int x=100,y=100,w=100,h=100;
	Fdemo()
	{
		Font f=new Font("Century Schoolbook",Font.ITALIC,50);
		setFont(f);
		setLayout(null);
		
		b1=new Button[9];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b1[k]=new Button("");
				b1[k].setSize(w,h);
				b1[k].setLocation(x,y);
				add(b1[k]);
				b1[k].addActionListener(this);
				k++;
				x+=100;
			}
			x=100;
			y+=100;
		}
	}
	int c=0;
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(c%2==0)b.setLabel("0");
		else b.setLabel("X");
	
 if((b1[0].getLabel()=="0" && b1[1].getLabel()=="0"&&b1[2].getLabel()=="0")||
(b1[0].getLabel()=="0" && b1[3].getLabel()=="0"&&b1[6].getLabel()=="0")||
(b1[0].getLabel()=="0" && b1[4].getLabel()=="0"&&b1[8].getLabel()=="0")||
(b1[1].getLabel()=="0" && b1[4].getLabel()=="0"&&b1[7].getLabel()=="0")||
(b1[2].getLabel()=="0" && b1[5].getLabel()=="0"&&b1[8].getLabel()=="0")||
(b1[3].getLabel()=="0" && b1[4].getLabel()=="0"&&b1[5].getLabel()=="0")||
(b1[6].getLabel()=="0" && b1[7].getLabel()=="0"&&b1[8].getLabel()=="0")||
(b1[2].getLabel()=="0" && b1[4].getLabel()=="0"&&b1[6].getLabel()=="0"))
		{
		 Label w=new Label("First Player is Winner");
			w.setSize(500,60);
			w.setLocation (100,450);
			w.setForeground(Color.red);
			add(w);
		}
		else if((b1[0].getLabel()=="X" && b1[1].getLabel()=="X"&&b1[2].getLabel()=="X")||
(b1[0].getLabel()=="X" && b1[3].getLabel()=="X"&&b1[6].getLabel()=="X")||
(b1[0].getLabel()=="X" && b1[4].getLabel()=="X"&&b1[8].getLabel()=="X")||
(b1[1].getLabel()=="X" && b1[4].getLabel()=="X"&&b1[7].getLabel()=="X")||
(b1[2].getLabel()=="X" && b1[5].getLabel()=="X"&&b1[8].getLabel()=="X")||
(b1[3].getLabel()=="X" && b1[4].getLabel()=="X"&&b1[5].getLabel()=="X")||
(b1[6].getLabel()=="X" && b1[7].getLabel()=="X"&&b1[8].getLabel()=="X")||
(b1[2].getLabel()=="X" && b1[4].getLabel()=="X"&&b1[6].getLabel()=="X"))
		{
		 Label w=new Label("second Player is Winner");
			w.setSize(500,60);
			w.setLocation (100,450);
			w.setForeground(Color.red);
			add(w);
 		}
		b.removeActionListener(this);
		c++;
	}
}
class demo
{
	public static void main(String [] ar)
	{
		Fdemo f=new Fdemo();
		f.setVisible(true);
		f.setSize(700,600);
		f.setBackground(Color.black);
		f.setForeground(Color.yellow);
		
	}
}
