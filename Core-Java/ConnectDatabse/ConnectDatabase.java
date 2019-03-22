import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*It requires to download MySql Connector Java*/
/*After That Put it on common place from where all your program will connect with mysql database*/
/*Copy the full path of folder including file name */
/*Go to the environment variable and create new variable "classpath" and paste the path with ;. and submit*/
/*Now Your Program will run*/

public class ConnectDatabase{
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String CONN_STRING = "jdbc:mysql://localhost/wordpress";
	
	//Constructor
	
	
	public static void main(String... a) throws SQLException{
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			System.out.println("Database Connect");
		} catch (SQLException e){
				System.err.println(e);
			}finally{
				conn.close();
			}
	}
}