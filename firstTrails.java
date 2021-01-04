import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.Map;

/* this project's intention is just to use the 'inline memeory' to access the data. Here we created the JDBC 
connection and we accessed the data from MySql and stored in inline memory(using Hash Map) and to validate the 
Username and password that we recieved from the user */

public class firstTrails {

	public static void main(String[] args) {
		
		try {
	         Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/comet","root","karuda183");  
			 //Connection has been created to database
	         Statement stmt = con.createStatement();
			 //Statement creation 
	         ResultSet rs = stmt.executeQuery("select * from project1");
	         Hashtable<String,String> hm=new Hashtable<String,String>(); 
			 //Hash Table has been created to store the Key:Value pair of Username and password
			 
	         while(rs.next()) {
	        	 hm.put(rs.getString(2),rs.getString(3)); 
				 //Since we used 'varchar' to store the data in sql but we access it through getString() method
	         }   
	         
	         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			 //using bufferreader to get the data from user
			 
	         	System.out.print("Enter your name: ");
				String name = reader.readLine();
				
	         if(hm.containsKey(name) == true){
						 System.out.print("Welcome "+ name);
					} else {
					System.out.print("Check your username");
					} 
				
				System.out.print(" Enter your password: ");
				String password = reader.readLine(); 
				 
				if (hm.values().contains(password)) {
					System.out.print("Login approved");
					} else {
					System.out.print("Wrong password");
					} 
			
				
	         }catch (Exception e){ System.out.println(e);} 
	}
}
		

