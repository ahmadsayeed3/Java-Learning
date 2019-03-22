// Finally Block Always Executes.............. Except in Only Case if before finally block has System.exit(0);

class FinallyBlock{

	public static void main(String...a){
		
// If there is no exception, try will executes and then finally will execute.
//Program will continue.....
		try{
			System.out.println("Try Condition 1 ");
		}catch(Exception e){
			System.out.println("Catch Condition 1: " + e);
		}finally{
			System.out.println("Finally Condition 1: ");
		}
		System.out.println("");
		System.out.println("");

// If Exception came and Caught then Try will skip rest of the code. Catch and then Finally Will execute.
//Program will continue.....
		try{
			int x=10/a.length;
			System.out.println("Try Condition 2 ");
		}catch(Exception e){
			System.out.println("Catch Condition 2: " + e);
		}finally{
			System.out.println("Finally Condition 2: ");
		}

// If Exception comes and does not catch then that will become Error.
// Try will skip rest of the code. finally will execute.
// Program will terminate
		
		try{
			int x= 10/0; // creating error
			System.out.println("Try Condition 3 ");
		}catch(NullPointerException e){
			System.out.println("Catch Condition 3: " + e);
		}finally{
			System.out.println("Finally Condition 3: ");
		}

		System.out.println("This Line Won't Execute");
	}
}