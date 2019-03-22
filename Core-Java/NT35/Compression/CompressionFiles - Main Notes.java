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

