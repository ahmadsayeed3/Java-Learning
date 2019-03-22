import java.io.*;

public class ListAllFiles{
	
	public static void main(String...a){
		
		String path = "D:\\";
		showAll(path);
		//showAll("D:\\Zoe\\");
	}
	
	public static void showAll(String p){
		File all = new File(p);
		// return array of all files and directories that is available in given path.
		File[] list = all.listFiles();
		
		// Now when we have all list, let's print them
		for(int i =0; i<list.length; i++){
			if(list[i].isFile()){	// if coming content is file type.
				System.out.println(i+". File: " + list[i].getPath());
			}else if(list[i].isDirectory()){
				// It must be a directory.
				System.out.println(i+". Directory: " + list[i].getPath());
			}
		}
	}
	
}