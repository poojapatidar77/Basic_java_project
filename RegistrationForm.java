//Registration form

import java.awt.*;
import java.awt.event.*;
class Fdemo extends Frame //implements ActionListener
{
	TextField t1;
	Button b1;
	TextArea a1;
	CheckboxGroup cbg;
  	Fdemo()
	{
		setTitle("Registration Form");
 		Font f=new Font("Arial Black",Font.ITALIC,30);
		setFont(f);
		setLayout(null);
     //a1=new TextArea("Registration Form",30,70,1);
 		//add(a1); 
		cbg=new CheckboxGroup();
		TextField t1=new TextField();
		t1.setSize(230,45);
		t1.setLocation(400,200);
		add(t1);
		
		TextField t2=new TextField();
		t2.setSize(230,45);
		t2.setLocation(400,300);
		add(t2);
		
		Choice c1=new Choice();
		c1.add("java");
		c1.add("php");
		c1.add("python");
		c1.add("c++");
		c1.add("c");
		c1.add("c#");
		c1.add("css");
		c1.add("android");
		c1.setLocation(100,450);
		add(c1);
		
		
		Checkbox cb1=new Checkbox("Male",false,cbg);
   		cb1.setLocation(400,460);
        cb1.setSize(80,50);
		add(cb1);
		
		Checkbox cb2=new Checkbox("Female",false,cbg);
		cb2.setLocation(500,460);
        cb2.setSize(200,50);
		add(cb2);
		
		Choice c2 =new Choice();
	   c2.add("");
		c2.add("jan");
		c2.add("feb");
		c2.add("march");
		c2.add("april");
		c2.add("may");
		c2.add("june");
		c2.add("july");
		c2.add("aug");
		c2.add("sep");
		c2.add("oct");
		c2.add("nov");
		c2.add("dec");
		c2.setLocation(470,540);
		add(c2);
		
	   Choice c3=new Choice();
	   int i;
	   c3.add("");
 	   for(i=1;i<=30;i++)
	   {
		   c3.add(""+i);
	   }
	  c3.setLocation(700,540);
	   add(c3);
	   
	   Choice c4=new Choice();
	   c4.add("");
	   for(i=0;i<=20;i++)
	   {
		   c4.add("200"+i);
	   }
		c4.setLocation(900,540);
		add(c4);
		
		TextField t3=new TextField();
		t3.setSize(300,45);
        t3.setLocation(300,670);
		add(t3);
      
        Checkbox cb3=new Checkbox("I agree with terms & conditions");	
        cb3.setLocation(200,750);
        cb3.setSize(900,70);
      add(cb3);		
		
		Button b1=new Button("Register");
		b1.setLocation(500,900);
		b1.setBackground(Color.green);
		b1.setSize(200,50);
		add(b1);
		
	setResizable(false);
	}		
	 public void paint(Graphics g)
	 {
		 
		g.drawString("REIGSTRATION FORM ",400,100);
		g.drawString("Student Name",100,230);
		g.drawString("Father Name",100,330);
		g.drawString("course",100,430);
		g.drawString("Gender",400,440);
		g.drawString("Birth date",100,575);
		g.drawString("month",350,570);
		g.drawString("date",600,570);
		g.drawString("Year",800,570);
		g.drawString("Email Id",100,700);
   
	 }
}
class demo
{
	public static void main(String ar[])
	{
		Fdemo f=new Fdemo();
		f.setVisible(true);
		f.setSize(1200,1000);
		f.setBackground(Color.white);
		f.setForeground(Color.black);
	}
}