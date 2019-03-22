/*

System class in java is one of the core classes. One of the easiest way to log information for debugging is System.out.print() function. 
System class is final and all of it’s members and methods are static so that we can’t subclass and override it’s behavior through inheritance.

System class in java doesn’t provide any public constructors. So we can’t instantiate this class (for argument sake, we can instantiate it using Java Reflection) and that’s why all of it’s methods are static.
Here we will look into the different features provided by java.lang.System class.

1. Java System class provides a native method for copying data from one array to another. This is a native implementation and supposed to be 	faster than other ways to copy array data.

System array copy method throws IndexOutOfBoundsException if copying would cause access of data outside array bounds. It also throws ArrayStoreException if an element in the source array could not be stored into the destination array because of a type mismatch and NullPointerException if either source or destination array is null. 
*/

/*
Java System.getProperty() method is very useful to find out the operating system information. 
We can use System.getProperty() method to find out the Operating System information, user home directory, Java runtime version, path separator, line separator, user working directory, java home, java classpath and various other useful information.

*/
import java.util.Map;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Properties;

public class MyClass{
	public static void main(String[] args){
		
		// System.arraycopy();
		int x[] = {50, 51,52,53};
		int y[] = {1,2,3,4, 5, 6};
		
		for(int y1: y) System.out.print(y1+" ");
		
		// After copying elements from x to y.	
		//System.arraycopy(copyFromVariable, copyFromIndex, pasteToVariable, pasteFromIndex, pasteToIndex);
		System.arraycopy(x, 1, y, 2, 3);
		
		System.out.println("");
		System.out.print("After Copying: ");
		for(int y1: y) System.out.print(y1+" ");

		// System.getProperty()
		/*Java System class getProperties() method returns the Set of keys for the properties and here we will use it to list out all 			the system properties.*/

		Properties sysProp = System.getProperties();
		SortedMap sMap = new TreeMap(sysProp);
		
		Set key = sMap.keySet();
		Iterator itr = key.iterator();
		while(itr.hasNext()){
			String propertyName = (String)	itr.next();
			String propertyValue = sysProp.getProperty(propertyName);
			System.out.println(propertyName + " = " + propertyName);
		}

		System.out.println("\nuser.language: " + System.getProperty("user.language"));
		System.out.println("user.timezone: " + System.getProperty("user.timezone"));
	}
}
