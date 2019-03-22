public class GenMethDemo {
	
	//determine if an object is in array.
	static<T,V extends T> boolean isIn(T x,V[] y){
		
		for(int i=0;i<y.length;i++)
			if(x.equals(y[i]))
				return true;
			return false;
	}
	/*There may be times when you'll want to restrict the kinds of types that are allowed to be passed to a 
	type parameter. For example, a method that operates on numbers might only want to accept instances of Number 
	or its subclasses. This is what bounded type parameters are for.
	To declare a bounded type parameter, list the type parameter's name, 
	followed by the extends keyword, followed by its upper bound.*/

	static<T extends Number> double add(T x,T y){
		double d=x.doubleValue()+y.doubleValue();
		return d;
	}
	
	public static void main(String... s){
		
		//use isIn() on integers
		Integer nums[]={1,2,3,4,5,6};
		if(isIn(2,nums))
			System.out.println("2 is in nums");
		
		if(!isIn(7,nums))
			System.out.println("7 is not in nums");
		
		System.out.println();
		
		//use isIn on Strings
		String strs[]={"one","two","three","four","five"};
		if(isIn("two",strs))
			System.out.println("two is in strs");
		
		if(!isIn("seven",strs))
			System.out.println("seven is not in strs");
		
		System.out.println(add(10,20));
		System.out.println(add(10.5f,27.5f));
		System.out.println(add(10.5,22.5));
		System.out.println(add(10L,28L));//it is l(Long)
	}
}
		
		
			