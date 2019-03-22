// BufferedInputStream and BufferedOutputStream

/*	When we write/read data using FileInputStream then it fills itself with data, 
	write data on java program then empty itself and repeat this process. 
	{ Java Program} <-> {File Input/OutputStream} <-> {File}
	It degrades the performance, so to improve the performance Buffer Input/Output Stream came.
	It connects with the stream and receive data and once all data stored it writes in our java program.
	{ Java Program} <-> {Buffered Input/Output Stream} <-> {File Input/OutputStream} <-> {File}
*/

import java.io.*;

class RunProgram{
	
	static String src = "abc.txt";
	
	public static void main(String...a){
		
		String text = "Good Boy (Sayeed)";
		
		//Write Data
		try{
			writeData(text);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		// Read Data
		try{
			readData();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	static void writeData(String text) throws IOException{
		// Implementing try with resource (Automatic Handling)  no need to close the Stream
		try(BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(src))){
			bo.write(text.getBytes());
		}catch(IOException e){	
			e.printStackTrace();
		}
	}
	static void readData() throws IOException{
		try(BufferedInputStream bi = new BufferedInputStream(new FileInputStream(src))){
			byte b;
			while( ( b = (byte) bi.read()) != -1 ){
				System.out.print((char) b);
				try{Thread.sleep(1000);}
				catch(Exception e){}
			}
		
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}