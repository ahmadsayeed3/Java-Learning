// MainProgram
import java.sql.SQLException;
@SuppressWarnings("")
class Main{
	
	//constructor
	
	public Main(){
		try{
			CRUD crud = new CRUD("root", "", "jdbc:mysql://localhost/wordpress");
		crud.createConnection();
		System.out.println("Success");
		}catch(SQLException e){
			System.err.println("Connection Failed: " + e);
		}
	}
	
	public static void main(String...a){
		new Main();
	}
	
}