// Check file content type...
/*	MIME: Multipurpose Internet Mail Extension
	The method returns the content type  in the form of string value of MIME content type.
	If the content type is not determined, it returns null.
	Uses: Like browser checks the file type and open file in that way.
*/

// Doing this program with the help of java.nio packages.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class CheckContentType{
	
	public static void main(String...a){
		String s1 = checkFileType("E:\\Java\\JavaPrograms\\Input Output\\Files\\Check Content Type\\1.txt");
		String s2 = checkFileType("E:\\Java\\JavaPrograms\\Input Output\\Files\\Check Content Type\\2.docx");
		String s3 = checkFileType("E:\\Java\\JavaPrograms\\Input Output\\Files\\Check Content Type\\3.xlsx");
		
		System.out.format("File 1.txt is: %s\n", s1);
		System.out.format("File 2.docx is: %s\n", s2);
		System.out.format("File 3.xlsx is: %s\n", s3);
	}
	
	public static String checkFileType(String path){
		// get static method of Paths class. Return Path object
		Path p = Paths.get(path);
		
		
		try{
			//Returns the content type as string value. Accepts Path class object
			String s = Files.probeContentType(p);
			return s;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
}