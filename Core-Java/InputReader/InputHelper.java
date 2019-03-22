import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputHelper{
	
	public static void main(String... ar){
		System.out.println("Guess a number between 1 to 20,000");
		
		/*BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));*/
			
							/*OR*/
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.flush();
		
		String input;
		try {
			input = br.readLine();
			System.out.println(input);
		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}	
		
	}
}