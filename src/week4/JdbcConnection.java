package week4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException 
	{
		String host="localhost";
		String port="3306";
		String database="university";
		
		
		
	String url = "jdbc:mysql://"+host+":"+port+"/"+database; // table details
    String username = "root"; // MySQL credentials
    String password = "Testing@1984";
    String query = "select *from student"; // query to be run
  /*  try {
		Class.forName(
		    "com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} // Driver name*/
   
		Connection con = DriverManager.getConnection(url, username, password);
	
    System.out.println("Connection Established successfully");
   
    Statement st = con.createStatement();
    ResultSet rs= st.executeQuery(query); // Execute query
   
    System.out.print("name			Age"); 
    System.out.println();
    System.out.println("----------------------------");
    while(rs.next())
    {
   
    String name = rs.getString("firstname"); // Retrieve name from db
    int number= rs.getInt(4); // Retrieve age from db
    
    System.out.println(name+"			"+number);   // Print result on console
    }
    con.close(); // close connection
    System.out.println("Connection Closed....");

	}

}
