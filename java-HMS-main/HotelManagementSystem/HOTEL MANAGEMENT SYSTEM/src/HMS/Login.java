package HMS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.Color;
public class Login extends JFrame implements ActionListener{	
private Container c;
private Font f;
private TextField usertxtf,passwordtxtf;

private JButton loginbtn,exitbtn;
private JLabel userlab,passlab;
Color mycolor;
//String Employee;
//String Customer;


public Login(){
	super("fream");
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setBounds(650,300,550,450);
	this.setTitle("HOTEL MANAGEMENT SYSTEM");
	this.setResizable(false);
	intcomponent();	
}
	
	
public void intcomponent(){
	
	mycolor= new Color(0,128,128);
	
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(mycolor);
	
	
	
	//User text field 
	usertxtf= new TextField();
	usertxtf.setBounds(150,60,250,40);
	f=new Font("Arial",Font.BOLD,15);
	usertxtf.setFont(f);
	c.add(usertxtf);
	
	
	//Pass Text Field
	passwordtxtf= new TextField();
	passwordtxtf.setBounds(150,120,250,40);
	f=new Font("Arial",Font.BOLD,15);
	passwordtxtf.setFont(f);
	c.add(passwordtxtf);
	
	//User label
	userlab=new JLabel();
	userlab.setText("User name:");
	userlab.setBounds(50,60,180,40);
	f=new Font("Arial",Font.BOLD,17);
	userlab.setFont(f);
	c.add(userlab);
	
	//Pass Label
	passlab=new JLabel();
	passlab.setText("Password:");
	passlab.setBounds(50,120,180,40);
	f=new Font("Arial",Font.BOLD,17);
	passlab.setFont(f);
	c.add(passlab);
	
	
	/*Login button*/
	loginbtn=new JButton("Login");
	f=new Font("Arial",Font.BOLD,20);
	loginbtn.setFont(f);
	loginbtn.setBounds(140,185,120,60);
	mycolor= new Color(192,192,192);
	loginbtn.setBackground(mycolor);
	c.add(loginbtn);
	loginbtn.addActionListener(this);
	
	/*Exit button*/
	exitbtn=new JButton("Exit");
	f=new Font("Arial",Font.BOLD,20);
	exitbtn.setFont(f);
	exitbtn.setBounds(275,185,120,60);
	mycolor= new Color(192,192,192);
	exitbtn.setBackground(mycolor);
	c.add(exitbtn);
	exitbtn.addActionListener(this);
	
	
}
	
	


public void actionPerformed(ActionEvent ae){
	String s=ae.getActionCommand();
		
	if(s.equals("Login")){
		DataAccess da =new DataAccess();
		String typeName=usertxtf.getText();
		String typeedpassword=passwordtxtf.getText();
		String query="SELECT Name,Password, User_Type from user";
		
		
		ResultSet result=null;
		
		try{
			result=da.getData(query);
			
			while(result.next()){
				String n = result.getString("Name");
				String p= result.getString("Password");
				String ut = result.getString("User_type");
				if(n.equals(typeName) && p.equals(typeedpassword)){
					
					JOptionPane.showMessageDialog(this,"Successfully Logged In");
					if(ut.equals("Employee")) {
						JOptionPane.showMessageDialog(this,"Employee");
						 Employee employee = new Employee();
						 employee.setVisible(true);
						 this.hide();
						break;
					}
					else if(ut.equals("Admin")) {
						JOptionPane.showMessageDialog(this,"Admin");
						 Admin admin = new Admin();
						 admin .setVisible(true);
						 this.hide();
						
						break;
					}
					else  {
						JOptionPane.showMessageDialog(this,"Login Failed");
						
					}
					
				}
				//else {
					//JOptionPane.showMessageDialog(this,"Login Failed");
					//break;
		//}
		
	        }	
			
 

    }
	catch(Exception ex){
			JOptionPane.showMessageDialog(this,"Error!");
   }
	}
	else if(s.equals("Exit")){
		System.exit(0);
		
		
	
}
	}
}
		
		
		
	
		
		





		
		




