package Helper.InputHelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadInput{
	
	public static int readInt(){
		
		String input = null;
		InputStreamReader iR = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(iR);
		
		try{
			input = br.readLine();
		}catch (Exception e){
			System.out.println("Error is: " + e.getMessage());
		}
		
		return Integer.parseInt(input);
	}
	
}