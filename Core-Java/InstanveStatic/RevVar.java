/*What happens when print the Reffrenece Vriable that contain ref id*/
/*It won't show the ref id but it will show the string*/
/*That String is combination of three string*/
/*1. is the class name*/
/*2. i the @ symbol*/
/*3. is the hexadecimal represation of # code*/
class RevVar{
	public static void main(String... args){
		RevVar cn = new RevVar();
		System.out.println("The Value of RevVar Reffrenece Vriable is: "+ cn);
		
		Class2 c2 = new Class2();
		System.out.println("The Value of RevVar Reffrenece Vriable is: "+ c2);
		
		/*Output: ClassName@HexaDecimal represation of # code*/
		
	}
}

class Class2{
	public static void main(String... args){
		//Class2 c2 = new Class2();
		//System.out.println("The Value of RevVar Reffrenece Vriable is: "+ c2);
	}
}