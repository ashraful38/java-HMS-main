package HMS;

import java.sql.*;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DataAccess{
    Connection conection;
    String JDBC_DRIVER;  
    String DB_URL;
    Statement statement;
    String USER;
    String PASS;
    ResultSet result;
    public DataAccess(){
    	DB_URL = "jdbc:mysql://localhost:3306/hms1";
       USER = "root";
       PASS="";
       
        
     try{
        Class.forName("com.mysql.jdbc.Driver");
        conection=(Connection)DriverManager.getConnection(DB_URL,USER,PASS);
     }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

 public ResultSet getData(String query) {
        try{
        	statement =(Statement) conection.createStatement();
        	result= statement.executeQuery(query);
         
        }
        catch(Exception ex){
            
            ex.printStackTrace();
        }
        return result;
   }
 public void addBD(String query){
        int numOfRowsAdded=0;
        try{
        	statement = (Statement)conection.createStatement(); 
        	numOfRowsAdded=statement.executeUpdate(query);
           
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
      
    }

}