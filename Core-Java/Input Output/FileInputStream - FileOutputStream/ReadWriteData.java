// FileInputStream and FileOutputStream

import java.io.FileInputStream;
import java.io.FileOutputStream;

class ReadWriteData{
	
	public static void main(String...a){
		String text = "I am a good boy. This is my first I/O program\n";
		
		ReadWriteData rw = new ReadWriteData();
		rw.WriteData(text);
	}
	
	public void ReadData(){
		/*try{
			FileInputStream fi = new FileInputStream();
		}catch(Exception e){
			e.printStackTrace();
		}*/
	}
	
	public void WriteData(String text){
		
		try{
			FileOutputStream fo = new FileOutputStream("abc.txt");
			// void write(byte[] array);
				fo.write(text.getBytes());
			
			// void write(int b)
			/*fo.write(32);
			fo.write(65);	*/
			
			// void write (byte[] array, int offset, int length)
				// offset = start position	// length = number of characters
			text = "\n"+text;
			fo.write(text.getBytes(), 0, 5);
			
			
			// it is used close the File Output Stream
			/*fo.close();
				FileOutputStream fo1 = new FileOutputStream("abc.txt");
					// void write(byte[] array);
						fo1.write("Ahmad Sayeed".getBytes());
			*/
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}