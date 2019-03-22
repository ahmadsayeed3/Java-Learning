class NeedOfFinally{
	
	public static void main(String...a){
		
		// Case 1
		try {
			boolean con;
			con = true;
			System.out.println("Case 1 Inserting");
			System.out.println("Case 1 Updating");
			System.out.println("Case 1 Fetching");
			
			// But Somehow Error Comes and Try Will Skip the Rest Code
			// BackUP task won't perform and resource will be open
			
			
			// Make DataBase Backup (Most Important - Required To Perform)
			// Close Connection
			con false;
		}catch(Exception e){
			// somehow catch also did not run
			// Make DataBase Backup (Most Important - Required To Perform)
			// Close Connection 
			con = false;
			System.out.println("Case 1 Catch");
		}finally{
			// It will run in every case except System.exit(0 OR 1) statement is not before finally
		}
	}
}