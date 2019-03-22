/* Java has his own compression tool called "jar tool". With the help of this tool we can do three kind of compression.
	1. WAR: Web Archive File Format contains file of a web project. It may have servlet, xml, jsp, images, html, css, js, etc.
	2. JAR: Java Archive File: contains normal .java files.
	3. EAR: Enterprise Application Archive Format

Command to make jar file: jar cvf t1.jar folder1 folder2 folder3
						  jar cvf t1.jar *.class 				All .class file.
						  jar cvf t1.jar *.*					Everything

						  In the given command v is an optional. It prints the compression information like size etc.
						  
How to decompress the file
	jar xvf make1.jar

*/

	
/*
We can make other compression type WEF and EAR, all we replace .jar wit .wef/.jaf

						jar cvf t1.waf folder1 folder2 folder3
						  jar cvf t1.jaf *.class 				All .class file.
						  jar cvf t1.ear *.*					Everything
						  
*/

/*
How to make executable jar file?
	We can make ".exe" of java files but Java does not provide this feature. We have to take from third-party.
		".exe" file will only run on windows platform but ".jar" is able to run on different OS including MAC, Windows, Linux.
		
		Only GUI application can execute from executable jar file. Console based application can't execute.
		We also have to define that which ".class" has to run first because lot's of ".class" will be inside .jar file.
		For this we have to make ".mf" file and write few commands. ".txt" file also works but the correct way is ".mf" file 
		
					Command: "Main-Class: MyClass after that press enter"
		JVM looks for new line after end of the command so we are giving a new line.
		
		Command to make executable .jar file: 	jar cvmf Make1.jar My.mf *.class
		
		Applying the command: jar cvfm MyPaint.jar MyFile.mf *.* Extra images sid
		
		sub directory does not comes apply *.*  we have to sub directories name explicitly.