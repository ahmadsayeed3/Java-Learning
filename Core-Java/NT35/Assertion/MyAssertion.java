/* Assertion: It is used to do Unit-Testing and It is done by programmer. Whenever we want to test a
	statement/condition in our program our-self then we use assertion. It checks if that condition is failing.
	We write that statement/condition in assertion that we want to test . By default assertion is disable
	 in JVM so we have to enable it while running the program. If we don't enable it and write assertion code
	 then JVM will ignore that statement/condition.
	 
	 To enable: 	java -ea className Or instead of ea => enableassertions
	 To disable:	java -da className Or instead of da => disableassertions

After testing the statement/condition, we have to remove assertion statement, we never put it in final program.
*/
	



public class MyAssertion{
	
	public static void main(String...a){
		assert a[0].equals("India"):	"Error: The word is not India";
		//assert a[0].equals("India");		// This also works but it does not show custom message.
		
		System.out.println("Program is continue...");
	}
}