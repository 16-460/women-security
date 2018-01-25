import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
class NextPage extends JFrame implements ActionListener{
	JButton SUBMIT1,SUBMIT2,SUBMIT3,SUBMIT4,SUBMIT5,SUBMIT6; 
	JPanel panel;
	JLabel label3;
	JTextField UserId;
	public NextPage(){
		label3 = new JLabel();
		label3.setText("UserId:");
		UserId = new JTextField(15);
		panel=new JPanel(new GridLayout(3,1));
		panel.add(label3);
		panel.add(UserId);
		add(panel,BorderLayout.CENTER);
	}


		public void showButton(){
			SUBMIT1=new JButton("Facebook");
			SUBMIT2=new JButton("Instagram");
			SUBMIT3=new JButton("SnapChat");
			SUBMIT4=new JButton("WhatsApp");
			SUBMIT5 = new JButton("Twitter");
			SUBMIT6=new JButton("Hike");
			panel=new JPanel(new GridLayout(3,1));
			panel.add(SUBMIT1);
			panel.add(SUBMIT2);
			panel.add(SUBMIT3);
			panel.add(SUBMIT4);
			panel.add(SUBMIT5);
			panel.add(SUBMIT6);
			add(panel,BorderLayout.CENTER);
			SUBMIT1.addActionListener(this);
			SUBMIT2.addActionListener(this);
			SUBMIT3.addActionListener(this);
			SUBMIT5.addActionListener(this);

			
		}	

		public void actionPerformed(ActionEvent ae)
		{
		String value3=UserId.getText();
		if (value3.equals(null)){
			System.out.println("This field is required");
		}
		else{
		NextPage page = new NextPage ();
		page.setVisible(true);
		        page.setSize(400,200);

		}

		}

}	
				

		                                                                                   
class Login extends JFrame implements ActionListener
 {
	 JButton SUBMIT;
	 JPanel panel;
	 JLabel label1,label2;
	 final JTextField  text1,text2;
	Login()
	{
	label1 = new JLabel();
	label1.setText("Username:");
	text1 = new JTextField(15);
	label2 = new JLabel();
	label2.setText("Password:");
	text2 = new JPasswordField(15);
	SUBMIT=new JButton("SUBMIT");
	panel=new JPanel(new GridLayout(3,1));
	panel.add(label1);
	panel.add(text1);
	panel.add(label2);
	panel.add(text2);
	panel.add(SUBMIT);
	add(panel,BorderLayout.CENTER);
	SUBMIT.addActionListener(this);
	setTitle("LOGIN FORM");
	}
	public void actionPerformed(ActionEvent ae)
	{
	String value1=text1.getText();
	String value2=text2.getText();
	if ((value1.equals("roshini") && value2.equals("roshini"))||(value1.equals("keerthana")&&value2.equals("keerthana"))||(value1.equals("s			hireesha")&&value2.equals("shireesha"))) {
	NextPage page=new NextPage();
	page.setVisible(true);
	page.setSize(400,200);
	JLabel label = new JLabel("Welcome:"+value1);
	page.getContentPane().add(label);
	page.showButton();
	}
	else{
	System.out.println("enter the valid username and password");
	JOptionPane.showMessageDialog(this,"Incorrect login or password",
	"Error",JOptionPane.ERROR_MESSAGE);
	}
	}
 
 }	
public  class hack 
   {
	      public static void main(String args[])
		         {
				 try
				{
				Login frame=new Login();
				frame.setSize(300,100);
				frame.setVisible(true);
}
catch(Exception e)
{JOptionPane.showMessageDialog(null, e.getMessage());}
			 }
   }

 
