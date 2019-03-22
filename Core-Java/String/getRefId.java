class getRefId{

	/*public String toString(String s){
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}*/
	
	public static void main(String...a){
		
		// Prove that Sring Object Is Immutable.
		String name = "Hello";
		System.out.println(name.hashCode());
		
		name = "Welcome";
		System.out.println(name.hashCode());
		
		String name2 = "Hello";
		System.out.println(name2.hashCode());
		
		// If Object Is Created In Heand And Assigned New Value In Literal Way Then New Value will go on 
				//String Constant Pool.
		System.out.println("------------------------");
		String s = new String("Sayeed");
		System.out.println(s.hashCode());
		
		s = "Ahmad";
		System.out.println(s.hashCode());
		
		String s1 = "Ahmad";
		System.out.println(s1.hashCode());
		String a[]={"mm","aa"};
		String... sss=a;
		String[] s6 = {"Morning", "Evening"};
		String[] s7 = {"Morning", "Evening"};
		System.out.println("Morning S6: " + s6[0].hashCode());
		System.out.println("Morning S7: " + s7[0].hashCode());
	}
}
