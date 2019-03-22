// Annonymous Array

class AsArray{
	
	void PrintNumbers(int z[]){
		for(int num : z){
			System.out.println(num);
		}	
	}
	
	

	public static void main(String...a){
		AsArray as = new AsArray();
		
		int x[] = {10,20,30};
		as.PrintNumbers(x);

		//Annonimous Array
		as.PrintNumbers(
			new int[]{50,60,70}
		);
		
//Advantage Of Annonymous Array
	int y[];
	y = new int[]{10,20,30,40,50,60};	

	for(int p: y){
		System.out.println(p);
	}
	
	
	}
}