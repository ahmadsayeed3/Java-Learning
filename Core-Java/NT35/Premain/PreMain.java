/* premain() method executes before main() if we write it before the main() method
 As we know size of an object is 4 bytes. We were are not able to know the size of object but with the help
	premain() we can know size of object.
 */
 
 import java.lang.instrument.*;
 
 class PreMain{
	 
	 // It accepts object of Instrumentation class
	 public static void premain(String s, Instrumentation inst){
		 System.out.println("This is premain method");
		 
		 A a1 = new A();
		 long size = inst.getObjectSize(a1);
		 System.out.println("The Size of the object is: " + size);
		 
		 // Calling the main() of A class.
		 A.main();
		 
		 // calling own main() method
		 main();
	 }
	 
	 public static void main(String...a){
		 System.out.println("main method");
	 }
 }
 
 class A{
	 int x = 200;	// for this it only creates 16 size
	 
	 // int y = 400;
	 
	 public static void main(String...a){
		 System.out.println("I am main() of A Class");
	 }
 }
 
 
/*
To run the premain method we have to follow few different steps
	1. Compile .java file that has premain() method: 	javac PreMain.java
	2. Create .mf file: Premain-Class: PreMain -> Enter.
			here Premain is the class name that contain premain().
	
	3. Create jar file: 	jar -cmf abc.mf  t2.jar PreMain.class

	4. Run the java file:	java -javaagent:t2.jar PreMain
*/

/*
	By default object creates with size 16. It increases ++8 when need to increase.

*/