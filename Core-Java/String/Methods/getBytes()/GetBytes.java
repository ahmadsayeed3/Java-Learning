/*
	1. public byte[] getBytes()  
	The java string getBytes() method returns the byte array of the string. 
	In other words, it returns sequence of bytes. In Sky Value
	
*/

/*
	2. getBytes(Charset charset)
	Encodes this String into a sequence of bytes using the given charset, storing the result into a new byte array.
	The Charset to be used to encode the String. 
*/

/* 3. public byte[] getBytes(String charsetName) */
import java.nio.charset.Charset;
class GetBytes{
	public static void main(String...a){
		String s = "Ahmad Sayeed";
		
		//1. public byte[] getBytes()  
		byte[] b = s.getBytes();
		
		for(int i=0; i<b.length; i++){
			System.out.println(b[i]);
		}
		
		//2. getBytes(Charset charset)
		byte[] b1 = s.getBytes(Charset.forName("ASCII"));
		for(int i=0; i<b1.length; i++){
			System.out.println(b1[i]);
		}
		
		// 3. public byte[] getBytes(String charsetName)
	}
}