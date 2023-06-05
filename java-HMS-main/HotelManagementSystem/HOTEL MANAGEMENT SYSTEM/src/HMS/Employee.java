package HMS;

import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



public class Employee extends JFrame implements ActionListener {	
private Container c;
private Font f;
private JButton showbtn,bookingbtn,logoutbtn;
private 
Color mycolor;

private JTable empTable;
private JScrollPane empTableSP;
private JButton getAllBtn;

Employee(){
	super("fream");
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setBounds(350,150,900,650);
	this.setTitle("Employee");
	this.setResizable(false);
	intcomponent();
	
	
}
public void intcomponent(){
	
	mycolor= new Color(0,128,128);
	
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(mycolor);
	
	
String data[][] = {{"", "", "",""}};
	
	String head[] = {"Room_Number", "Room_Type","Room_Rent","Status"};
	
	empTable = new JTable(data,head);
	empTableSP = new JScrollPane(empTable);
	empTableSP.setBounds(90, 60, 700, 280);
	empTable.setEnabled(false);
	c.add(empTableSP);
	
	getAllBtn = new JButton("Get All");
	f=new Font("Arial",Font.BOLD,20);
	getAllBtn.setFont(f);
	getAllBtn.setBounds(60,390,120,50);
	mycolor= new Color(192,192,192);
	getAllBtn.setBackground(mycolor);
	getAllBtn.addActionListener(this);
	c.add(getAllBtn);
	
	/*//Show btn/
	showbtn=new JButton("Show");
	f=new Font("Arial",Font.BOLD,20);
	showbtn.setFont(f);
	showbtn.setBounds(60,390,120,50);
	mycolor= new Color(192,192,192);
	showbtn.setBackground(mycolor);
	//showbtn.addActionListener(this);
	c.add(showbtn);*/
	
	


	
	
	//Booking btn/
	bookingbtn=new JButton("Booking");
	f=new Font("Arial",Font.BOLD,20);
	bookingbtn.setFont(f);
	bookingbtn.setBounds(300,390,120,50);
	mycolor= new Color(192,192,192);
	bookingbtn.setBackground(mycolor);
	bookingbtn.addActionListener(this);
	c.add(bookingbtn);
	
	/*bookingbtn.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent ae) {
			
			
			Booking booking=new Booking ();
			Employee employe=new Employee();
			employe.setVisible(false);
			booking.setVisible(true);
			//booking.hide();
		}
	});*/
	
	
	//Logout btn/
	logoutbtn=new JButton("Back");
	f=new Font("Arial",Font.BOLD,20);
	logoutbtn.setFont(f);
	logoutbtn.setBounds(540,390,120,50);
	mycolor= new Color(192,192,192);
	logoutbtn.setBackground(mycolor);
	logoutbtn.addActionListener(this);
	c.add(logoutbtn);
	
	/*backbtn.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent ae) {
			
			
			CustomerInformation bocking=new CustomerInformation ();
			Login login=new Login();
			bocking.setVisible(false);
			login.setVisible(true);
			//login.hide();
		}
	});*/
	
	
	
}
public void actionPerformed(ActionEvent ae) {
	String command = ae.getActionCommand();
	/*if(command.equals(showbtn.getText())) {
		
	}*/
	 if(command.equals(getAllBtn.getText())) {
		String query="SELECT `Room_Number`, `Room_Type`, `Room_Rent`, `Status` FROM `booking`";
		DataAccess dataAccess = new DataAccess();
		ResultSet rs = dataAccess.getData(query);
		
		empTable.setModel(DbUtils.resultSetToTableModel(rs));
	}
	else if(command.equals(logoutbtn.getText())) {
		CustomerInformation bocking=new CustomerInformation ();
		Login login=new Login();
		bocking.setVisible(false);
		login.setVisible(true);
		this.hide();
	
	}
	else if(command.equals(bookingbtn.getText())) {
		
		Booking booking=new Booking ();
		Employee employe=new Employee();
		employe.setVisible(false);
		booking.setVisible(true);
		this.hide();
		
	}
	
	
	
	
}
}