// Automatic Resource Handler (ARE)
// We don't need to close the resource explicitly, the JVM will close all resources automatically
// From JDK 9, We can have parantheses after "try" where we will write syntax to open all resources and JVM-
//		JVM will automatically close all opened resources when cursor reach at end of try block.
//	Only the obects of those classes can be created within parantheses of try block which are implementing AutoCloseable interface

import java.io.*;
import java.util.*;

class ARE{
	
	private static void printFileJava7() throws IOException{
		try(FileInputStream input = new FileInputStream("abc.txt"); BufferedInputStream fin = new BufferedInputStream(input)){
			int data = input.read();
			while(data != -1){
				System.out.println((char) data);
				data = input.read();
			}
		}
	}
	
	public static void main(String...a){
		
	}
}