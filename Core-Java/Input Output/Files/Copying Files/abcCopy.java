// Write a program which will generate copy of itself.

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.DirectoryNotEmptyException;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;

public class CopyingFiles{
	public static void main(String...a){
		CopyingFiles cf = new CopyingFiles();
		String target = "E:\\Java\\JavaPrograms\\Input Output\\Files\\Copying Files\\abcCopy.java";
		cf.copyItsef(target);
	}
	
	public String currentPath(){
		// Get the path of current file with absolute
		String s = System.getProperty("user.dir");
		s = s + "" + "\\" + this.getClass().getName()+".java";
		s = s.replace("\\", "\\\\");
		//System.out.println(s);
		
		return s;
	}
	
	public void copyItsef(String t){
		
		String s = currentPath();
		System.out.println(s);
		Path source = Paths.get(currentPath());
		Path target = Paths.get(t);
		
		//String s=" ";
		
		//Path target = Paths.get(s);
		
		try{
			Path p = Files.copy(source,target, REPLACE_EXISTING, COPY_ATTRIBUTES);
			System.out.println(source + " has been copied to " + p);
		}catch(FileAlreadyExistsException e){
			System.out.println("File already exists" + e);
		}catch(DirectoryNotEmptyException e){
			System.out.println("Directory is Empty" + e);
		}
		catch(IOException e){
			System.out.println("IOException " + e);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}