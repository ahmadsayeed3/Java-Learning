// Int to Binary, Hex, Octal as String

class InttoBinary{
	
	public static void main(String...s){
		String s1 = Integer.toBinaryString(15);
		String s2 = Integer.toHexString(15);
		String s3 = Integer.toOctalString(15);
		
		System.out.println("15 as Binary: " + s1);
		System.out.println("15 as Hexadecimal: " + s2);
		System.out.println("15 as Octal: " + s3);
	}
}