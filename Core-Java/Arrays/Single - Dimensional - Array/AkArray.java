class AkArray
{
	String country [];	// Declaration
	String city[]= {"Delhi", "Mumbai", "Chennai"};
	
	int x[];
	public static void main(String... s)
	{		
	// Non static thus need to create an object to access
	AkArray a= new AkArray();

		a.country= new String[3];// Instantion
		a.country[0]= "India";
		a.country[1]= "United Kingdom";
		a.country[2]= "Oman";
		

     System.out.println(a.country[2]);
	 System.out.println(a.city[0]);

	 
	x = new int[]{10,20,30};
		
		
		
		
		
	}
}


