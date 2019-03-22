import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*It requires to download MySql Connector Java*/
/*After That Put it on common place from where all your program will connect with mysql database*/
/*Copy the full path of folder including file name */
/*Go to the environment variable and create new variable "classpath" and paste the path with ;. and submit*/
/*Now Your Program will run*/

public class CRUD{
	
	private  final String USERNAME;
	private  final String PASSWORD;
	private  final String CONN_STRING;
	private Connection con;
	//Constructor
	CRUD(String userName, String password, String conString){
		this.USERNAME = userName;
		this. PASSWORD = password;
		this.CONN_STRING = conString;
	}
	
	protected void createConnection() throws SQLException{
		try{
			this.con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
		}catch(SQLException e){
			System.err.println("Connection Failed: " + e);
		}finally{
			con.close();
		}
	}
	
	public static void main(String... a) {
		
	}
}