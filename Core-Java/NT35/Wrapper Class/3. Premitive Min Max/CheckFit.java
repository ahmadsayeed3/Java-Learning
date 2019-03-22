/* 	byte: 	-128 to 127
	short 	-32768 to 32767
	int		-2147483646 to 2147483647
	long	-9223372036854775808 to 9223372036854775807
*/

import java.util.*;
class CheckFit{
	
	public static void main(String...a){
		Scanner sc = new Scanner(System.in);
		String str="";
		try{
			str = sc.next();
			if(str.length() < 20 && Long.parseLong(str) < 9223372036854775807L){
				long lg = Long.parseLong(str);
				checkSize(lg);
			}
			else{
				System.out.println(str + " is not fit in anywhere.");
			}
		}catch(Exception e){
			System.out.println(str + " is not fit in anywhere.");
		}
	}
	
	public static void checkSize(long lg){
		
		if(lg >= Byte.MIN_VALUE && lg <= Byte.MAX_VALUE)
			System.out.println(lg + " can fit in byte. ");
		
		if(lg >= Short.MIN_VALUE && lg <= Short.MAX_VALUE)
			System.out.println(lg + " can fit in short ");
		
		if(lg >= Integer.MIN_VALUE && lg <= Integer.MAX_VALUE)
			System.out.println(lg + " can fit in int ");
		
		//if(lg >= -9223372036854775808L && lg <= 9223372036854775807L)
			if(lg >= Long.MIN_VALUE && lg <= Long.MAX_VALUE)
			System.out.println(lg + " can fit in long ");
	}
}