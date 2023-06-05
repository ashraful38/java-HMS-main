package HMS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;



public class CustomerInformation extends JFrame implements ActionListener{	
private Container c;
private Font f;
private TextField customeridtxtf,nametxtf, addresstxtf,mobiletxtf,emailtxtf,nationalidtxtf,arrivalDatetxtf,departureDatetxtf,creditCardtxtf;
private JLabel customeridlabel,namelabel, addresslabel,mobilelabel,emaillabel,nationalidlabel,arrivalDatelabel,departureDatelabel,creditCardlabel;
private JButton confirmbtn,backbtn;
//private JLabel userlab,passlab;
Color mycolor;

CustomerInformation(){
	super("fream");
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setBounds(220,50,1070,920);
	this.setTitle("Booking");
	this.setResizable(false);
	intcomponent();
	
	
}
public void intcomponent(){
	
	mycolor= new Color(0,128,128);
	
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(mycolor);
	
	
	
	// CustomerId label
	customeridlabel=new JLabel();
	customeridlabel.setText("Customer Id:");
	customeridlabel.setBounds(55,60,190,40);
	f=new Font("Arial",Font.BOLD,17);
	customeridlabel.setFont(f);
	c.add(customeridlabel);
		
		
		// CustomerId Txtf Field 
		 customeridtxtf= new TextField();
		 customeridtxtf.setBounds(260,60,400,40);
		 f=new Font("Arial",Font.BOLD,15);
		 customeridtxtf.setFont(f);
		 c.add( customeridtxtf);
		
		
		
		//Name label
		 namelabel=new JLabel();
		 namelabel.setText("User name:");
		 namelabel.setBounds(55,135,190,40);
		f=new Font("Arial",Font.BOLD,17);
		namelabel.setFont(f);
		c.add(namelabel);
				
				
		// Name Txtf Field 
		nametxtf= new TextField();
		nametxtf.setBounds(260,135,400,40);
		f=new Font("Arial",Font.BOLD,15);
		nametxtf.setFont(f);
		c.add(nametxtf);
		
		
		//Address label
		addresslabel=new JLabel();
		addresslabel.setText("Parmanent Address:");
		addresslabel.setBounds(55,210,190,40);
		f=new Font("Arial",Font.BOLD,17);
		addresslabel.setFont(f);
		c.add(addresslabel);
				
				
		// Address Txtf Field 
		addresstxtf= new TextField();
		addresstxtf.setBounds(260,210,400,40);
		f=new Font("Arial",Font.BOLD,15);
		addresstxtf.setFont(f);
		c.add(addresstxtf);
		
		
		//Mobile No label
		mobilelabel=new JLabel();
		mobilelabel.setText("Mobile No:");
		mobilelabel.setBounds(55,285,190,40);
		f=new Font("Arial",Font.BOLD,17);
		mobilelabel.setFont(f);
		c.add(mobilelabel);
				
				
		// Mobile No Txtf Field 
		mobiletxtf= new TextField();
		mobiletxtf.setBounds(260,285,400,40);
		f=new Font("Arial",Font.BOLD,15);
		mobiletxtf.setFont(f);
		c.add(mobiletxtf);
		
		
		//email label
		emaillabel=new JLabel();
		emaillabel.setText("Email:");
		emaillabel.setBounds(55,360,190,40);
		f=new Font("Arial",Font.BOLD,17);
		emaillabel.setFont(f);
		c.add(emaillabel);
				
				
		// email  Txtf Field 
		emailtxtf= new TextField();
		emailtxtf.setBounds(260,360,400,40);
		f=new Font("Arial",Font.BOLD,15);
		emailtxtf.setFont(f);
		c.add(emailtxtf);
		
		//nationalid label
		nationalidlabel=new JLabel();
		nationalidlabel.setText("National_Id:");
		nationalidlabel.setBounds(55,435,190,40);
		f=new Font("Arial",Font.BOLD,15);
		nationalidlabel.setFont(f);
		c.add(nationalidlabel);
		
		
		//nationalid Txtf Field
		nationalidtxtf= new TextField();
		nationalidtxtf.setBounds(260,435,400,40);
		f=new Font("Arial",Font.BOLD,15);
		nationalidtxtf.setFont(f);
		c.add(nationalidtxtf);
		
		
		//Arrival Date label
		arrivalDatelabel=new JLabel();
		arrivalDatelabel.setText("Arrival Date:");
		arrivalDatelabel.setBounds(55,510,190,40);
		f=new Font("Arial",Font.BOLD,15);
		arrivalDatelabel.setFont(f);
		c.add(arrivalDatelabel);
				
				
		//Arrival Date Txtf Field
		arrivalDatetxtf= new TextField();
		arrivalDatetxtf.setBounds(260,510,400,40);
		f=new Font("Arial",Font.BOLD,15);
		arrivalDatetxtf.setFont(f);
		c.add(arrivalDatetxtf);
		
				
		//Departure Date label
		departureDatelabel=new JLabel();
		departureDatelabel.setText("Departure Date:");
		departureDatelabel.setBounds(55,585,190,40);
		f=new Font("Arial",Font.BOLD,15);
		departureDatelabel.setFont(f);
		c.add(departureDatelabel);
				
				
		//Departure Date Txtf Field
		departureDatetxtf= new TextField();
		departureDatetxtf.setBounds(260,585,400,40);
		 f=new Font("Arial",Font.BOLD,15);
		 departureDatetxtf.setFont(f);
		 c.add(departureDatetxtf);
		 
			
		 //Credit Card label
		 creditCardlabel=new JLabel();
		 creditCardlabel.setText("Credit Card:");
		 creditCardlabel.setBounds(55,660,190,40);
		 f=new Font("Arial",Font.BOLD,15);
		 creditCardlabel.setFont(f);
		 c.add(creditCardlabel);
					
					
		 // Credit Card Txtf Field
		 creditCardtxtf= new TextField();
		 creditCardtxtf.setBounds(260,660,400,40);
		 f=new Font("Arial",Font.BOLD,15);
		 creditCardtxtf.setFont(f);
		 c.add(creditCardtxtf);
		 
		 
		 
		 
		 
		//back btn/
		 backbtn=new JButton("Back");
			f=new Font("Arial",Font.BOLD,20);
			backbtn.setFont(f);
			backbtn.setBounds(490,750,120,50);
			mycolor= new Color(192,192,192);
			backbtn.setBackground(mycolor);
			//bookingbtn.addActionListener(this);
			c.add(backbtn);
			
			backbtn.addActionListener(new ActionListener () {
				public void actionPerformed(ActionEvent ae) {
					
					
					CustomerInformation bokking=new CustomerInformation ();
					Employee employe=new Employee();
					bokking.setVisible(false);
					employe.setVisible(true);
				}
			});
			
			//Confirm btn/
			confirmbtn=new JButton("Confirm");
			f=new Font("Arial",Font.BOLD,20);
			confirmbtn.setFont(f);
			confirmbtn.setBounds(300,750,120,50);
			mycolor= new Color(192,192,192);
			confirmbtn.setBackground(mycolor);
			confirmbtn.addActionListener(this);
			c.add(confirmbtn);
		}

public void actionPerformed(ActionEvent ae){
	String s=ae.getActionCommand();
		
	if(s.equals("Confirm")){
			
		if(customeridtxtf.getText().length()!=0 || nametxtf.getText().length()!=0 ||addresstxtf .getText().length()!=0||mobiletxtf.getText().length()!=0 || emailtxtf.getText().length()!=0 || nationalidtxtf .getText().length()!=0 || arrivalDatetxtf .getText().length()!=0 || departureDatetxtf .getText().length()!=0 || creditCardtxtf .getText().length()!=0){
		

			//String query="INSERT INTO `customer_information`(`Customer_Id`, `Name`, `Permanent_Address`, `Mobile_No`, `Email`, `National_Id`, `Arrival_Date`, `Departure_Date`, `Credit_Card`,`Departure_Date`, `Credit_Card`) VALUES ('"+customeridtxtf.getText()+"','"+nametxtf.getText()+"','"+addresstxtf.getText()+"','"+mobiletxtf.getText()+"','"+emailtxtf.getText()+"','"+nationalidtxtf.getText()+"','"+arrivalDatetxtf.getText()+"','"+departureDatetxtf.getText()+"','"+creditCardtxtf.getText()+"')";
			String query="INSERT INTO `customer` (`Customer_Id`, `Name`, `Permanent_Address`, `Mobile_No`, `Email`, `National_id`, `Arrival_Date`, `Departure_Date`, `Credit_Card`) VALUES ('"+customeridtxtf.getText()+"', '"+nametxtf.getText()+"', '"+addresstxtf.getText()+"', '"+mobiletxtf.getText()+"', '"+emailtxtf.getText()+"', '"+nationalidtxtf.getText()+"', '"+arrivalDatetxtf.getText()+"', '"+departureDatetxtf.getText()+"', '"+creditCardtxtf.getText()+"');";
			DataAccess da = new DataAccess();
			da.addBD(query);
			
			JOptionPane.showMessageDialog(this," Confirm Successfully ");
		     //this.setVisible(false);
		     Employee employee=new Employee();
		     employee.setVisible(true);
		     this.hide();
		    
			
		}
	else{

		JOptionPane.showMessageDialog(this,"Missing Data");
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
}








}

