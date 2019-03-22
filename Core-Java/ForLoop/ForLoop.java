class ForLoop{
	public static void main(String... args){
		System.out.println("-----------------------------------------");
		System.out.println("For Loop With Normal approach");
		
		for(int i=1; i<=5; ++i){
			System.out.println("Printing Numbers: " + i);
		}

		System.out.println("-----------------------------------------");
		System.out.println("For Loop With Function Parameter");
		
		for(int i = initialize(); i <= condition(); i = updation(i)){
			System.out.println("Printing Numbers: " + i);
		}

		System.out.println("-----------------------------------------");
		System.out.println("For Loop With No Parameter");
		
		for(;;){
			System.out.println("Printing Infinity Numbers");
		}
		
		/*Sometimes we don't know how much time we need to run the loop. We only know some condition*/

		/*Solution*/
		/*for(;;){
			
			if(userInput == "MatchMyCondition"){ 
				System.out.println("Do My Actions");
			}
		}*/
		
	}

	public static int initialize(){
		return 1;
	}
	
	public static int condition(){
		return 10;
	}
	
	public static int updation(int i){
		return ++i;
	}
}