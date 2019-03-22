// FileOutputStream 

import java.io.*;

class RunProgram{
	
	public static void main(String...a){
		String text = "Good Boy.";
		
		// Constructor 1
		try{
			constructorOne(text);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		// Constructor 2
		try{
			constructorTwo(text);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		// Constructor 3
		try{
			constructorThree(text);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		// Constructor4
			try{
				constructorFour(text);
			}catch(IOException e){
				e.printStackTrace();
			}
			
		System.out.println("All Constructor Run Successfully");
	}
	
	static void constructorOne(String text) throws IOException{
		// 1. constructor, accepts file name as string. If "one.txt" is not available the it will create new one.
				// if "one.txt" is available then it will make it on "Write Mode", 
					// it means old data will override, but it will append until we close the connection  
		
		// It will create object as well as a file with name that we provide in the constructor.
		FileOutputStream fout = new FileOutputStream("one.txt");
		// write method does write but accepts value in byte data type.
		fout.write(text.getBytes());
		
		/*
			fout.write(" Appending More Data".getBytes());
			fout.close();
			
			FileOutputStream fout1 = new FileOutputStream("one.txt");
			fout1.write("Again New Data".getBytes());
		*/
	}
	
	static void constructorTwo(String text) throws IOException{
		// 2. Second constructor is same as 1st constructor but it does not override the old values.
			// but it appends new values in file. It accepts two parameter fileName and boolean value.
			 // It will append even after I close the connection and create a new one.
		
		FileOutputStream fout = new FileOutputStream("two.txt", true);
		fout.write(text.getBytes());
		fout.write(" Appending New Data.".getBytes());
		
		/*
			fout.close();
			FileOutputStream fout1 = new FileOutputStream("two.txt", true);
			fout1.write(" 3rd Time Appending New Data".getBytes());
		*/
	}
	
	
	static void constructorThree(String text) throws IOException{
		// 3. Accepts object of File class with "path" and create new file in that path location.
			// Except file creation, it works same as Constructor One means also create file as write mode.
			FileOutputStream fout = new FileOutputStream(new File("E:\\Java\\JavaPrograms\\Input Output\\FileInputStream - FileOutputStream\\FileInputStream\\OuterFolder\\three.txt"));
			fout.write("First Data".getBytes());
			
			FileOutputStream fout1 = new FileOutputStream(new File("OuterFolder\\three2.txt"));
			fout1.write("First Data".getBytes());
	}
	
	static void constructorFour(String text) throws IOException{
		// 4. Accepts object of File class with "path" and create new file in that path location.
			// Except file creation, it works same as 2nd constructor means it creates file with Append mode.
			FileOutputStream fout = new FileOutputStream(new File("OuterFolder\\four.txt"), true);
			fout.write("First Data Constructor 4.".getBytes());
			
			fout.close();
			
			FileOutputStream fout1= new FileOutputStream(new File("OuterFolder\\four.txt"), true);
			fout1.write(" Appending New Data.".getBytes());
			
			// We can Also send value one by one byte in write() Method
			byte[] b = "One By One Byte".getBytes();
			for(int i=0; i < b.length; i++){
				fout1.write(b[i]);
			}
			
	}
}