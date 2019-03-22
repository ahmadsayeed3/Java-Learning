/*This programs shows compilation error*/

class VariablesExp{
	public static void main(String ... s){
		byte b = 10;
		byte c = 20;	
		byte d = b + c;
		System.out.println(d);
		
	}
}


/*This works with final keyword*/
/*class VariablesExp{
	public static void main(String ... s){
		final byte b = 10;
		final byte c = 20;

		System.out.println(b);
		System.out.println(c);		
		byte d = b + c;
		//int d = (c+b);

		System.out.println(d);
		
	}
}*/
