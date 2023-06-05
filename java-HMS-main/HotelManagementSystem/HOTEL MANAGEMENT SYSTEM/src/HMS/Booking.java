package HMS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;
import javax.swing.*;



public class Booking extends JFrame implements ActionListener{	
private Container c;
private Font f;
private TextField roomNumbertxtf,roomTypetxtf, roomRenttxtf,statustxtf;
private JLabel roomNumberlabel,roomTypelabel, roomRentlabel,statuslabel;
private JButton confirmbtn,backbtn;
//private JLabel userlab,passlab;
Color mycolor;

Booking(){
	super("fream");
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setBounds(220,50,1070,620);
	this.setTitle("Booking");
	this.setResizable(false);
	intcomponent();
	
	
}
public void intcomponent(){
	
	mycolor= new Color(0,128,128);
	
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(mycolor);
	
	
	
	// Room Number label
	roomNumberlabel=new JLabel();
	roomNumberlabel.setText("Room Number:");
	roomNumberlabel.setBounds(55,60,190,40);
		f=new Font("Arial",Font.BOLD,17);
		roomNumberlabel.setFont(f);
		c.add(roomNumberlabel);
			
			
			// Room Number Txtf Field 
		roomNumbertxtf= new TextField();
		roomNumbertxtf.setBounds(260,60,400,40);
			 f=new Font("Arial",Font.BOLD,15);
			 roomNumbertxtf.setFont(f);
			 c.add( roomNumbertxtf);
			
			
			
			//Room Type label
			 roomTypelabel=new JLabel();
			 roomTypelabel.setText("Room Type:");
			 roomTypelabel.setBounds(55,135,190,40);
			f=new Font("Arial",Font.BOLD,17);
			roomTypelabel.setFont(f);
			c.add(roomTypelabel);
					
					
			// Room Type Txtf Field 
			roomTypetxtf= new TextField();
			roomTypetxtf.setBounds(260,135,400,40);
			f=new Font("Arial",Font.BOLD,15);
			roomTypetxtf.setFont(f);
			c.add(roomTypetxtf);
			
			
			// Room Rent label
			roomRentlabel=new JLabel();
			roomRentlabel.setText("Room Rent:");
			roomRentlabel.setBounds(55,210,190,40);
			f=new Font("Arial",Font.BOLD,17);
			roomRentlabel.setFont(f);
			c.add(roomRentlabel);
					
					
			// Room Rent Txtf Field 
			roomRenttxtf= new TextField();
			roomRenttxtf.setBounds(260,210,400,40);
			f=new Font("Arial",Font.BOLD,15);
			roomRenttxtf.setFont(f);
			c.add(roomRenttxtf);
			
			
			//status label
			statuslabel=new JLabel();
			statuslabel.setText("Status:");
			statuslabel.setBounds(55,285,190,40);
			f=new Font("Arial",Font.BOLD,17);
			statuslabel.setFont(f);
			c.add(statuslabel);
					
					
			//Status Txtf Field 
			statustxtf= new TextField();
			statustxtf.setBounds(260,285,400,40);
			f=new Font("Arial",Font.BOLD,15);
			statustxtf.setFont(f);
			c.add(statustxtf);
			
			
			//back btn/
			 backbtn=new JButton("Back");
				f=new Font("Arial",Font.BOLD,20);
				backbtn.setFont(f);
				backbtn.setBounds(490,420,120,50);
				mycolor= new Color(192,192,192);
				backbtn.setBackground(mycolor);
				backbtn.addActionListener(this);
				c.add(backbtn);
				
				/*backbtn.addActionListener(new ActionListener () {
					public void actionPerformed(ActionEvent ae) {
						
						
						//CustomerInformation bokking=new CustomerInformation ();
						Employee employe=new Employee();
						//bokking.setVisible(false);
						employe.setVisible(true);
					}
				});*/
				
				//Confirm btn/
				confirmbtn=new JButton("Confirm");
				f=new Font("Arial",Font.BOLD,20);
				confirmbtn.setFont(f);
				confirmbtn.setBounds(300,420,120,50);
				mycolor= new Color(192,192,192);
				confirmbtn.setBackground(mycolor);
				confirmbtn.addActionListener(this);
				c.add(confirmbtn);
			}

public void actionPerformed(ActionEvent ae){
	String s=ae.getActionCommand();
		
	if(s.equals("Confirm")){
			
		if(roomNumbertxtf.getText().length()!=0 || roomTypetxtf.getText().length()!=0 ||roomRenttxtf .getText().length()!=0||statustxtf.getText().length()!=0){
			String query="UPDATE `booking` SET `Room_Number`='"+roomNumbertxtf.getText()+"',`Room_Type`='"+roomTypetxtf.getText()+"',`Room_Rent`='"+roomRenttxtf.getText()+"',`Status`='"+statustxtf.getText()+"' WHERE Room_Number='"+roomNumbertxtf.getText()+"'";
			DataAccess da = new DataAccess();
			da.addBD(query);
			
			JOptionPane.showMessageDialog(this," Confirm Successfully ");
		     this.setVisible(false);
		     CustomerInformation customerInformation=new CustomerInformation();
		     customerInformation.setVisible(true);
		    
			
		}
	else{

		JOptionPane.showMessageDialog(this,"Missing Data");
		
		
	}
}
	else if(s.equals("Back")) {

		//CustomerInformation bokking=new CustomerInformation ();
		Employee employe=new Employee();
		//bokking.setVisible(false);
		employe.setVisible(true);
		this.hide();
	}
		
	
	
	
	
	
	
	
	
	
	
	
}
			
}

