/* java compile API: Using this api we can compile a java program from our java program. There is a package "javax.tools" that has
	class "ToolProvider". Inside that class a named getSystemJavaCompiler that compiles our java program.
	*/

//import javax.tools.ToolProvider;
//import javax.tools.JavaCompiler;

// This program does not work withJDK 9. But works with JDK 8
// set path = C:\Program Files\Java\jdk1.8.0_151\bin;

import javax.tools.*;
class MyJavaCompiler{
	
	public static void main(String...a){
		// getting reference id
		JavaCompiler c = ToolProvider.getSystemJavaCompiler();
		
		int i = c.run(System.in, System.out, System.err, "ABC.java");
		System.out.println(i);
		
		if(i == 0){
			System.out.println("Successfully compiled");
		}else{
			System.out.println("Something wrong in ABC.java");
		}
	}
}