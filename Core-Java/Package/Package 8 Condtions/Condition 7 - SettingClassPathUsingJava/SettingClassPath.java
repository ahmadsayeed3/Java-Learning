// This classpath will only be available until the program executes.
// Don't consider that it will available until CMD opened. It only exists until program run. 


class SettingClassPath{

	public static void main(String...a){

		//getting current classpath.
		String CurrentPath = System.getProperty("java.classpath");
		System.out.println(CurrentPath);
		
		//Setting classpath
		System.setProperty("java.classpath", "C:/PackageFolder");
		
		//Getting new classpath
		String NewPath = System.getProperty("java.classpath");
		System.out.println(NewPath);
	}

}