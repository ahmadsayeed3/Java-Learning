/* Steps to connect with database

1 Load the JDBC driver
2 Connection to the DBMS
3 Createing and Executing an Statement
4 Processing the data returned by the DBMS
5 Terminate the connection with the DBMS

The common interfaces that all vendor classes implements and return the object of implemented classes. 
1 Driver
2 Connection
3 Statement
4 Resultser
*/

import java.sql.*;
import java.util.*;
public class  DatabaseConnection{
	
	public static void main(String...args){
		try{
		    Class.forName("oracle.jdbc.driver.OracleDriver");
			//step2 create  the connection object  
Connection c=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:8080:xe","system","oracle");  
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM EMP101");
			while(rs.next()){
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString(1));
			}
			c.close();
		}catch(ClassNotFoundException se){ se.printStackTrace(); }
		catch(SQLException se){ se.printStackTrace(); }
		catch(Exception se){ se.printStackTrace(); }
	}
}
