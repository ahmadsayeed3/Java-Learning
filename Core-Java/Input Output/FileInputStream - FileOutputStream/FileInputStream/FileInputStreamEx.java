// FileInputStream Constructors
import java.io.*;

class FileInputStreamEx{
	// for compiling and running
}

class RunProgram{
	
	public static void main(String...a){
		
		// Constructor 1
		try{
			constructorOne();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		// Constructor 2
		try{
			constructorTwo();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	static void constructorOne() throws IOException{
		// accepts file name as parameter and fetch data in form of bytes
		FileInputStream fin = new FileInputStream("one.txt");
		
		// Reading data way 1:
		int i=0;
		while((i = fin.read()) !=-1){
			System.out.print((char)i);
		}
		fin.close();
		System.out.println("===============");
		
		// Reading data way two:
		FileInputStream fin1 = new FileInputStream("one.txt");
		//declaring byte type array and also instantiation. available() returns length of file data in bytes.
		byte[] b = new byte[fin1.available()]; 
		
		fin1.read(b); // sending the reference id of byte array, read() method will insert all values in byte array.
		
		// convert byte values to a string
		String s = new String(b);
		System.out.println("using available(): " + s);
	}
	
	
	static void constructorTwo() throws IOException{
		// accepts File class Object with path as parameter and fetch data in form of bytes
		FileInputStream fin = new FileInputStream("E:\\Java\\JavaPrograms\\Input Output\\FileInputStream - FileOutputStream\\FileInputStream\\OuterFolder\\two.txt");
		int i=0;
		while((i = fin.read()) !=-1){
			System.out.print((char)i);
		}
		System.out.println("");
	}
}



