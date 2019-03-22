/* For Each: We don't need to set any condition in ForEach it implicitly starts from 0 index 
	and ends at last index. */
	
class MyForEach{
	
	public static void main(String...a){
		int[] x = new int[]{5,2,4,8,9,3};
		
		for(int k : x){				// it gets the "x" current index value and put in k.
			System.out.println(k);
		}
		
		// it requires to match the data type of array and defined variable data type in foreach block
		String[] str = new String[]{"Ahmad", "Sayeed", "Asmal", "Babu"};
		
		for(String s: str){
			System.out.println(s);
		}
	}
}
