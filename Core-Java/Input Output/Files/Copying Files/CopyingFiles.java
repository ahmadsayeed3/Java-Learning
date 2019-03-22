// Copying Files:

/*
Files class -> public static Path copy(Path source, Path target, CopyOption... options):
*. This method can copy the specified source path to the specified target path.

*. If the source file is a symbolic link, the target of the symbolic link is copied, not the symbolic link.
*. If the specified source file is a directory, an empty directory at the target location is created.
	without copying the contents of the the directory.
*. We can specify more than one or more of the following options with the copy() method.
		#. StandardCopyOption.REPLACE_EXISTING
		#. StandardCopyOption.COPY_ATTRIBUTES
		#. LinkOption.NOFOLLOW_LINKS
*. We can specify the REPLACE_EXISTING option to replace the existing target file.
*. If the target file is symbolic link an if it exists, the symbolic link is replaced by specifying
	the REPLACE_EXISTING option, not the target of the symbolic link.
*. The COPY_ATTRIBUTES option copies the attributes of the source file to the target file. 
*. If the NOFOLLOW_LINKS option is used, the copy() method copies the symbolic, not the target 
	of the symbolic link.
	
*/

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
		Path source = Paths.get("E:\\Java\\JavaPrograms\\Input Output\\Files\\Copying Files\\abc.txt");
		// Path target = Paths.get("E:\\Java\\JavaPrograms\\Input Output\\Files\\Copying Files\\abcCopy.txt");
		
		// Get the path of current directory
		String s = System.getProperty("user.dir");
		s = s + "" + "\\abcCopy.txt";
		s = s.replace("\\", "\\\\");
		//System.out.println(s);
		Path target = Paths.get(s);
		
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