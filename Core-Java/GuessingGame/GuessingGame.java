/*How to create a package*/
/*create a folder and put java code file. put at 1st line: package FolderName.FolderName;*/
/*import that class on your program.ex: import FolderName.FolderName.FileName;*/
/*Now call it as normal class*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import Helper.InputHelper.ReadInput;
import java.util.Random;

class GuessingGame{
	
	public static void main(String... ar){
		
		int num, userInput, chances = 15;
	
		/*Generate system radom no*/
		Random rand = new Random();
		num = Math.abs(rand.nextInt())%20000+1;
		
		System.out.println("Guess a number between 1 to 20000");
		while(chances > 0){
			
			/*take input from user. calling static function from package*/
			userInput = ReadInput.readInt();
			
			/*check if chances are available else less this attemp*/
			if (chances == 0){ System.out.println("You Lost!!!!"); break; }
			else chances--;
			
			/*if user find the number else give him hint number is lower or greater*/
			if (num == userInput) {	System.out.println("You Won!!!!!. Number is " + num " Still Chances has: " + chances);	break;	}
			else if (userInput < num){System.out.println("Number is Greater. Left Chances: " + chances);  }
			else { System.out.println("Number is Lower. Left Chances: " + chances); }
			
			
		}
	}
	
	/*static int readInt(){
		
		String input = null;
		InputStreamReader iR = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(iR);
		
		try{
			input = br.readLine();
		}catch (Exception e){
			System.out.println("Error is: " + e.getMessage());
		}
		
		return Integer.parseInt(input);
	}*/
	
}