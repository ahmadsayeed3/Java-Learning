class GetObject{
	
	static int num(){
		int x=0;
		return x++;
	} 
	
	public static void main(String...a){
		int y=1;
		String s1 ="0";
		s1 += new String("Hello" + y++);
		System.out.println(s1);
		String s2 = s1;
		
		
		
		s1 = "Welcome";
		
		System.out.println(s2);
		
	}
}