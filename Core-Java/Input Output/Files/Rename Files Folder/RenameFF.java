// Let's rename a file/folder

import java.io.*;
public class RenameFF{
	
	public static void main(String...a){
		String oldPath = "E:\\ZoeLove\\";
		String newPath = "E:\\ILoveYou\\";
		
		doRename(oldPath, newPath);
	}
	
	public static void doRename(String oldPath, String newPath){
		File old = new File(oldPath);
		File newName = new File(newPath);
		
		// apply rename and check success.
	
		if(old.renameTo(newName)){
			System.out.println(old.getName() + " is renamed to " + newName.getName());
		}else{
			System.out.println("Renaming process failed");
		}
	}
}