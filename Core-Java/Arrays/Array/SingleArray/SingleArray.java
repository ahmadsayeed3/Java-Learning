class SingleArray{

	int number[] = {5,4,3,2};
	static String []names = {"Prem", "Parul","Padmawati"};
	
	public static void main(String...a){
		KnowClassName kcn = new KnowClassName();
	
		System.out.println(kcn.number[2]);

		for(int i =0; i< names.length; i++){
			System.out.println(names[i]);
		}

		for(int i = 0; i < kcn.number.length; i++){
			System.out.println(kcn.number[i]);		
		}
		
	}
}