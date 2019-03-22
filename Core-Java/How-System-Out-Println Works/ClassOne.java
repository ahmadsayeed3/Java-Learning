import java.io.*;

class Please{
	static Write write;
	static{
		write = new Write();
	}
}

class Write{
	
	void myString(String s){
		System.out.println(s);
	}
	
	
}

class ClassOne{
	
	public static void main(String... a) throws Exception{
		Please.write.myString("Ahmad Sayeed");
		String s = new String("Ahmad Sayeed");
	
		System.out.write(s);
		
	
	}
}

