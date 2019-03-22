/* If It does not found exact match function then it will search for bigger data type */
/* It means, it will do TypePromotion that will create confusion for compiler.*/

/*Let's see an example*/
class MOBadSituation{
	public static void main(String... a){
		
		new MOBadSituation().add(10, 20L); // right & working
		new MOBadSituation().add(25L, 10); // right & working
		
		/*Bad Code example*/
		/*As we can see arguments are in int.*/
		/*We have both function long and int so match function is not avaible*/
		/*Now it will type promotion and find if long argument is avaible to place int value*/
		/*And now both function has that long argument so JVM will confuse and print error*/
		
		new MOBadSituation().add(10, 10); // will give compilation error
		
	}
	
	int add(int x, long y){
		System.out.println(x + y);
		return 0;
	}
	
	int add(long x, int y){
		System.out.println( x + y);
		return 0;
	}
}