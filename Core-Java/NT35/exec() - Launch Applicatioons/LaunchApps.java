/*	exec(String s) method of Runtime Class. It name of "software.exce" file as string launch/open that application.
	If the application that we want to launch is default Windows application then it does not require complete path.
	But in case other application it requires to provide complete path of that ".exe" file.

	Through this we can also run/execute java tools commands.
*/

public class LaunchApps{
	
	public static void main(String...a){
		Runtime rt = Runtime.getRuntime();
		
		try{
			rt.exec("notepad.exe");
			String app = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
			rt.exec(app);				// takes little bit time...
			
			rt.exec("C:\\Program Files\\Microsoft Office\\Office16\\MSACCESS.EXE");
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("Program is continue...");
	}
}