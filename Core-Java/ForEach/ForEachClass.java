class ForEachClass{

	int number[] = {5,4,3,2};
	static String []names = {"Prem", "Parul","Padmawati"};
	
	public static void main(String...a){
		ForEachClass fec = new ForEachClass();
	
		// For Each
		for(String p : names){
			System.out.println(p);
		}

// For Each
		for(int p : fec.number){
			System.out.println(p);
		}
	}
}