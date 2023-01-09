//calculator in swing


 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import javax.script.*;
class Fdemo extends JFrame implements ActionListener
{
	JButton b[];
	int i,j,x=0,y=100,w=100,h=100;
	int k=0;
	String data[]={"B","C","1/x","sqrt","7","8","9","/","4","5","6","*"
	,"1","2","3","-","0",".","=","+"};
	JTextField t1,t2,t3;
Fdemo()
{
	ButtonGroup bg=new ButtonGroup();
	setTitle("Games");
	setResizable(false);
	Font f=new Font("",Font.BOLD,30);
	setLayout(null);
	  t1=new JTextField(10);
     t1.setSize(400,100);  
     t1.setLocation(0,0);	  
	t1.setFont(f);
	t1.setHorizontalAlignment(JTextField.RIGHT);
	add(t1);
	b=new JButton[20];
	 for(i=1;i<=5;i++)
	 {
		 for(j=1;j<=4;j++)
		 {
	    b[k]=new JButton(data[k]); 
	    b[k].setFont(f);
        b[k].setSize(w,h);	  
        b[k].setLocation(x,y);	  
     	add(b[k]);
	    b[k].addActionListener(this);
         x+=100;
		 k++;
	  }
	    x=0;
		y+=100;
    }
 }  
public void actionPerformed(ActionEvent e)
{
	if(b[0]==e.getSource())
	{
		String s1=t1.getText();
		t1.setText(s1.substring(0,s1.length()-1));
	}
	else if(b[1]==e.getSource())
	{
		t1.setText("");
	}
	else if(b[2]==e.getSource())
	{
		String s1=t1.getText();
		double d1=Double.parseDouble(s1);
		d1=1/d1;
		t1.setText(""+d1);
	}
	else if(b[3]==e.getSource())
	{
		String s1=t1.getText();
		double a=Double.parseDouble(s1);
		t1.setText(""+Math.sqrt(a));
	}
	else if(b[18]==e.getSource())
	{
		String s1=t1.getText();
		ScriptEngineManager sem=new ScriptEngineManager();
		ScriptEngine se=sem.getEngineByName("js");
		try
		{
          t1.setText(""+se.eval(s1));
      }
		catch(Exception e1)
		{
		}
	}
	else
	{
	JButton b1=(JButton)e.getSource();
	 String s1=t1.getText()+b1.getLabel();
	 t1.setText(s1);
	}
}
}
class demo
{
	public static void main(String ar[])
	{
	Fdemo f=new Fdemo();
	f.setVisible(true);
	f.setSize(600,800);
 	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}