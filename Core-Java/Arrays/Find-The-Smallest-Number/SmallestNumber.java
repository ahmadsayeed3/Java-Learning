class SmallestNumber{

	static int min;
	public static void main(String...a){
		int numbers[] = {5,8,4,9,14};
	
		min = numbers[0];
		for(int i = 1; i<numbers.length; i++){
			if(min > numbers[i]){
				min = numbers[i];
			}
		}
		System.out.println(min);
	}
	
}

//If min is greater than indexValue then put that indexValue inside min.
//repeat untill get the smalles value