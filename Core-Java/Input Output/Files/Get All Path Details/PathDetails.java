// All Details of a particular path.
// java PathDetails E:\\Java\\
// java PathDetails E:\\ZoeLove\\

import java.io.*;
public class PathDetails{
	
	public static void main(String...a){
		// Going to take "path" input using CLA...
		getPathDetails(a[0]);
	}
	
	public static void getPathDetails(String p){
		File f = new File(p);
		// check if file exists
		if(f.exists()){
			System.out.println("File/Folder exists...");
			System.out.println("Name: " + f.getName());
			System.out.println("Length: " + f.length());
			System.out.println("Path: " + f.getPath());
		}else{
			System.out.println("File or Folder does not exists....");
			f.mkdir();	// used to create a folder
			System.out.println("Created a new folder...");
		}
		
		System.out.println("");
		// now let's show the information by content type file/folder	
		if(f.isFile()){
			System.out.println("It is a file");
		}else if(f.isDirectory()){
			System.out.println("It is a folder");
			String[] list = f.list();		// Also can store in String
			
			// Let's print all those lists.
			for(int i =0; i<list.length; i++){
				System.out.println(list[i]);
			}
		}
	}
}