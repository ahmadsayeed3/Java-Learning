/*return type of function do not play any role in case of function overloading*/
/*Below program will show error because their arguments are same and retun type does not affect*/
/*Access specifier/modifier don't play any role in case of function overloading*/

class MOThroughReturn{
	public static void main(String... a){
		
		new MOThroughReturn().add("Ahmad ", "Sayeed");
		new MOThroughReturn().add("Ahmad ", "Sayeed");
	}
	
	public float add(String s1, String s2){
		System.out.println(s1);
	}
	
	public int add(String s1, String s2){
		System.out.println(s1);
	}

}