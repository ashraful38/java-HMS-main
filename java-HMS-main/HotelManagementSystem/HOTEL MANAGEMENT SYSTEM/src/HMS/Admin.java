package HMS;

import java.awt.event.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



public class Admin extends JFrame implements ActionListener{	
private Container c;
private Font f;
private JButton insertbtn,deletebtn,updatebtn,refreshbtn,logoutbtn,loadbtn,signupbtn;
private JTextArea jta;
private TextField idtxtf,nametxtf,passwordtxtf,salarytxtf,userTypetxtf;
private JLabel idlabel,namelabel,passwordlabel,salarylabel,userTypelabel;
Color mycolor;
private JTable empTable;
private JScrollPane empTableSP;
private JButton getAllBtn;

Admin(){
	super("fream");
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setBounds(350,150,950,700);
	this.setTitle("Admin");
	this.setResizable(false);
	intcomponent();
	
	
	
}
public void intcomponent(){
	
	mycolor= new Color(0,128,128);
	
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(mycolor);
	
	
	String data[][] = {{"", "", "", ""}};
	
	String head[] = {"Id", "Name", "User Type", "Salary"};
	
	empTable = new JTable(data,head);
	empTableSP = new JScrollPane(empTable);
	empTableSP.setBounds(350, 100, 400, 150);
	empTable.setEnabled(false);
	c.add(empTableSP);
	
	getAllBtn = new JButton("Get All");
	getAllBtn.setBounds(500,260,80,30);
	getAllBtn.addActionListener(this);
	c.add(getAllBtn);
	
	      // Id label
	idlabel=new JLabel();
	idlabel.setText("Id:");
	idlabel.setBounds(20,70,100,40);
	f=new Font("Arial",Font.BOLD,17);
	idlabel.setFont(f);
	c.add(idlabel);
					
					
	// Id Txtf Field 
	idtxtf= new TextField();
	idtxtf.setBounds(120,70,155,40);
	f=new Font("Arial",Font.BOLD,15);
	idtxtf.setFont(f);
	c.add( idtxtf);
	
	// Name label
	namelabel=new JLabel();
	namelabel.setText("Name:");
	namelabel.setBounds(20,130,100,40);
	f=new Font("Arial",Font.BOLD,17);
	namelabel.setFont(f);
	c.add(namelabel);
				
				
	// Name Txtf Field 
	nametxtf= new TextField();
	nametxtf.setBounds(120,130,155,40);
	f=new Font("Arial",Font.BOLD,15);
	nametxtf.setFont(f);
	c.add( nametxtf);
	
	// User Type label
	userTypelabel=new JLabel();
	userTypelabel.setText("User Type:");
	userTypelabel.setBounds(20,190,100,40);
	f=new Font("Arial",Font.BOLD,17);
	userTypelabel.setFont(f);
	c.add(userTypelabel);
	
	
	//User Type txtf
	userTypetxtf= new TextField();
	userTypetxtf.setBounds(120,190,155,40);
    f=new Font("Arial",Font.BOLD,15);
    userTypetxtf.setFont(f);
    c.add( userTypetxtf);
			
	
		// Salary Type label
	salarylabel=new JLabel();
	salarylabel.setText("Salary:");
	salarylabel.setBounds(20,250,100,40);
		f=new Font("Arial",Font.BOLD,17);
		salarylabel.setFont(f);
		c.add(salarylabel);
		
		// Salary  Type txtf Field 
					salarytxtf= new TextField();
					salarytxtf.setBounds(120,250,155,40);
				f=new Font("Arial",Font.BOLD,15);
				salarytxtf.setFont(f);
				 c.add( salarytxtf);
			
	
	 
		// Password label
				 passwordlabel=new JLabel();
				 passwordlabel.setText("Password:");
				 passwordlabel.setBounds(20,300,100,40);
			f=new Font("Arial",Font.BOLD,17);
			 passwordlabel.setFont(f);
			c.add( passwordlabel);
				
		// Password txtf Field 
			passwordtxtf= new TextField();
			passwordtxtf.setBounds(120,300,155,40);
		f=new Font("Arial",Font.BOLD,15);
		passwordtxtf.setFont(f);
		 c.add( passwordtxtf);
	 
	//load btn/
	 /*loadbtn=new JButton("Load");
		f=new Font("Arial",Font.BOLD,20);
		loadbtn.setFont(f);
		loadbtn.setBounds(15,300,120,40);
		mycolor= new Color(192,192,192);
		loadbtn.setBackground(mycolor);
		//showbtn.addActionListener(this);
		c.add(loadbtn);*/
		
		
		//Insert btn/
		insertbtn=new JButton("Insert");
		f=new Font("Arial",Font.BOLD,20);
		insertbtn.setFont(f);
		insertbtn.setBounds(150,400,120,40);
		mycolor= new Color(192,192,192);
		insertbtn.setBackground(mycolor);
		insertbtn.addActionListener(this);
		c.add(insertbtn);
		
		
		//Delete btn/
		deletebtn=new JButton("Delete");
		f=new Font("Arial",Font.BOLD,20);
		deletebtn.setFont(f);
		deletebtn.setBounds(285,400,120,40);
		mycolor= new Color(192,192,192);
		deletebtn.setBackground(mycolor);
		deletebtn.addActionListener(this);
		c.add(deletebtn);
		
		
		//"Update btn/
		updatebtn=new JButton("Update");
		f=new Font("Arial",Font.BOLD,20);
		updatebtn.setFont(f);
		updatebtn.setBounds(420,400,120,40);
		mycolor= new Color(192,192,192);
		updatebtn.setBackground(mycolor);
		updatebtn.addActionListener(this);
		c.add(updatebtn);
		
		
		//Refreshbtn btn/
		refreshbtn=new JButton("Refresh");
		f=new Font("Arial",Font.BOLD,20);
		refreshbtn.setFont(f);
		refreshbtn.setBounds(555,400,120,40);
		mycolor= new Color(192,192,192);
		refreshbtn.setBackground(mycolor);
		refreshbtn.addActionListener(this);
		c.add(refreshbtn);
		
		//logout btn/
		logoutbtn=new JButton("Log out");
		f=new Font("Arial",Font.BOLD,20);
		logoutbtn.setFont(f);
		logoutbtn.setBounds(690,400,120,40);
		mycolor= new Color(192,192,192);
		logoutbtn.setBackground(mycolor);
		logoutbtn.addActionListener(this);
		c.add(logoutbtn);
}

public void actionPerformed(ActionEvent ae) {
	String command = ae.getActionCommand();
	if(command.equals(insertbtn.getText())) {
		if(idtxtf.getText().length()!=0 || nametxtf.getText().length()!=0 ||passwordtxtf .getText().length()!=0||userTypetxtf.getText().length()!=0||salarytxtf.getText().length()!=0){
		
				String query="INSERT INTO `user`(`ID`, `Name`, `Password`, `User_Type`, `salary`) VALUES ('"+idtxtf.getText()+"','"+nametxtf.getText()+"','"+passwordtxtf.getText()+"','"+userTypetxtf.getText()+"','"+salarytxtf.getText()+"')";
				DataAccess dataAccess = new DataAccess();
				dataAccess.addBD(query);
				JOptionPane.showMessageDialog(this," Confirm Successfully ");
		}
		else{

			JOptionPane.showMessageDialog(this,"Missing Data");
			
			
		}
	
		
	}
	else if(command.equals(updatebtn.getText())) {
		if(idtxtf.getText().length()!=0 || nametxtf.getText().length()!=0 ||passwordtxtf .getText().length()!=0||userTypetxtf.getText().length()!=0||salarytxtf.getText().length()!=0){
		String query="UPDATE `user` SET `Name`='"+nametxtf.getText()+"',`Password`='"+passwordtxtf.getText()+"',`User_Type`='"+userTypetxtf.getText()+"',`salary`='"+salarytxtf.getText()+"' WHERE Id='"+idtxtf.getText()+"'";
		DataAccess da=new DataAccess();
		da.addBD(query);
		JOptionPane.showMessageDialog(this," Confirm Successfully ");
		}
		else{

			JOptionPane.showMessageDialog(this,"Missing Data");
			
			
		}
	
		
	}
	else if(command.equals(deletebtn.getText())) {
		if(idtxtf.getText().length()!=0 || nametxtf.getText().length()!=0 ||passwordtxtf .getText().length()!=0||userTypetxtf.getText().length()!=0||salarytxtf.getText().length()!=0){
		String query="DELETE FROM `user` WHERE `user`.Id='"+idtxtf.getText()+"'";
		DataAccess da=new DataAccess();
		da.addBD(query);
		JOptionPane.showMessageDialog(this," Confirm Successfully ");
		}
		else{

			JOptionPane.showMessageDialog(this,"Missing Data");
			
			
		}
	
		
	}
	else if(command.equals(refreshbtn.getText())) {
		idtxtf.setText("");
		nametxtf.setText("");
		userTypetxtf.setText("");
		salarytxtf.setText("");
		passwordtxtf.setText("");
		
	}
	else if(command.equals(getAllBtn.getText())) {
		String query="SELECT `ID`, `Name`, `User_Type`, `salary` FROM `user`";
		DataAccess dataAccess = new DataAccess();
		ResultSet rs = dataAccess.getData(query);
		
		empTable.setModel(DbUtils.resultSetToTableModel(rs));
	}
	else if(command.equals(logoutbtn.getText())) {
		Login login=new Login();
		login.setVisible(true);
		this.hide();
		
	}
	else {
		JOptionPane.showMessageDialog(this,"Login Failed");
		//break;
		
	}
}

}
