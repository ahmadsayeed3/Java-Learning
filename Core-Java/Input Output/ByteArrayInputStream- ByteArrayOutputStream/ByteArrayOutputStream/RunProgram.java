// ByteArrayOutputStream

// When we use FileOutputStream then it connects with file. when it writes the data and it empty itself. 
	// But What if we want to write the same data to the file, printer and network at a time. int this case
		// file will write and FileOutputStream will empty. There will be no data to write on printer and network.
		
// To solve this problem we make general buffer and store data to re-use.
	// So to solve this problem ByteArrayOutputStream came. We write the data in ByteArrayOutputStream buffer and	
	// it won't empty the data until we call close() method. 
	
import java.io.*;

class RunProgram{
	public static void main(String...a){
		String text = "Good Boy";
		try{
			myByteWriter(text);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	static void myByteWriter(String text) throws IOException{
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		bo.write(text.getBytes());
		
		// Now ByteArrayOutputStream has writeTo() method that accepts object of Stream where we want write data.
		bo.writeTo(new FileOutputStream("abc.txt"));
		bo.writeTo(new FileOutputStream("xyz.txt"));
		
		// bo.writeTo(Object of printer);
		// bo.writeTo(Object of Networking);
		System.out.println(bo.toString());
		
		/* =============  OR  we rarely use this way ===============*/
		byte[] b = bo.toByteArray();
		ByteArrayInputStream bin = new ByteArrayInputStream(b);
		
		int i = 0;
		while((i = bin.read()) !=-1 ){
			
			System.out.print((char) i);
		}
		
		System.out.println("\n  Me Here: " + new String(b));
	}
}