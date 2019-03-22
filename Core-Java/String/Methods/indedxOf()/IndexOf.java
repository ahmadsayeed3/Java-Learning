class IndexOf{

	
	public static void main(String...a){
	/* ---------------- indexOf() -----	returns -1 if does not find the match  ---------------*/
		
		// Method 4: indexOf(); return the index(position) of character (First Come First Return)
		String s1 = "Ahmad Sayeed";
		System.out.println("indexOf() :" + s1.indexOf('S'));
		
		// Method 5: int indexOf(int ch, int fromIndex): returns specified char value index starting with given index
		s1 = "Ahamd Sayeed";
		System.out.println("indexOf(int ch, int fromIndex) - " + s1.indexOf('a', 4));
		
		// Method 6: int indexOf(String substring): returns specified substring index
		s1 = "India is good country";
		System.out.println("indexOf(String substring) - " + s1.indexOf("good"));
		
		// Method 7: int indexOf(String substring, int fromIndex): returns specified substring index starting with given index
		s1 = "India is good country";
		System.out.println("indexOf(String substring, int fromIndex) - " + s1.indexOf("is ", 5));
	}

}