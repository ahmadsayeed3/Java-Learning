// Non-Generic ArrayList

import java.util.ArrayList;
import java.util.Iterator;

public class NonGenAL{

	public static void main(String... args){
		/* Non-Generic ArrayList */
		System.out.println("\n=======Non Generic ArrayList=======\n");
		
		ArrayList age = new ArrayList();
		age.add(new Integer(25));				// Auto Boxing
		age.add(new Integer(26));	// Providing wrapper class that will hold in Object
		age.add(new Integer(27));
		age.add("MY Age");		// As here no type defined. But it will raise problem while iterating
		System.out.println("Size/Length is: " + age.size());
		
		age.remove(2);
		System.out.println("After Removal Length is: " + age.size());
		
		// Iterating: It is not generic so it won't downcast implicitly, we have to do this explicitly and this is the problem.
		Iterator itr = age.iterator();
		while(itr.hasNext()){
			Object o = itr.next();
			if(o.getClass() == Integer.class){
				Integer z = (Integer)  o;
				System.out.println(z);
				//Integer z = itr.next();				// Object cannot be converted to Integer
			}else if(o.getClass() == String.class){
				String z = (String) o;
				System.out.println(z);
			}
		}
		
		/*When while loop reach to index 3 means at string value, it will throw ClassCastException */
		// Also when use Non-Generic ArrayList, compiler shows warning
	}
}