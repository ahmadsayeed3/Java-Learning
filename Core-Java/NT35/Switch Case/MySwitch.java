/* switch case: In earlier versions, only primitives were allowed.
We were not allowed to check condition with string values. Now we can also pass String in switch case. */

class MySwitch{
	
	public static void main(String...a){
		
		String day = "WED";
		
		switch(day){
			case "MON":
				System.out.println("It is Monday");
				break;
			case "TUE": 
				System.out.println("It is Tuesday");
				break;
			case "WED":
				System.out.println("It is Wednesday");
				break;
			case "THU":
				System.out.println("It is Thursday");
				break;
			case "FRI":
				System.out.println("It is Friday");
				break;
			case "SAT": 
				System.out.println("It is Saturday");
				break;
			case "SUN":
				System.out.println("It is Sunday");
				break;
			default:
				System.out.println("Invalid");
				System.out.println("Invalid AGain");
				System.out.println("Invalid Again and Again and So On");
				break;
		}
	}
}