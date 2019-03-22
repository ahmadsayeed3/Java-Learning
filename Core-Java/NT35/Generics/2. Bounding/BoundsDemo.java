/*
There may be times come when we'll want to restrict the kinds of types while making an object. 
We only want to make object of those classes that is child of Number.
int, short, long, double, float, byte are child class of Number class.
*/

class Stats<T extends Number>
{
	T[] nums;
	Stats(T[] ob)
	{
		nums=ob;
	}
	double average()
	{
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
		{
			sum +=nums[i].doubleValue();
			//System.out.println(nums[i]);
		}
		return sum/nums.length;
	}
}
public class BoundsDemo
{
	public static void main(String... s)
	{
		Integer inums[]={1,2,3,4,5,6};
		Stats<Integer> iob=new Stats<>(inums);
		double v=iob.average();
		System.out.println("iob average is "+v);
		Double dnums[]={1.1,2.2,3.3,4.4,5.5};
		Stats<Double> dob=new Stats<Double>(dnums);
		double w=dob.average();
		System.out.println("dob average is "+w);
		
		/*
		// It will throw compilation error because we extended the Number class and restricted.
		String snums[] = {"a", "b"};
		Stats<String> ob1 = new Stats<> (snums);
		*/
	}
}


/*There may be times when you'll want to restrict the kinds of types that are allowed to be passed to a 
type parameter. For example, a method that operates on numbers might only want to accept instances of Number 
or its subclasses. This is what bounded type parameters are for.
To declare a bounded type parameter, list the type parameter's name, 
followed by the extends keyword, followed by its upper bound.*/

class MaximumTest {
   // determines the largest of three Comparable objects
   
   // Method:
   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
      T max = x;   // assume x is initially the largest
      
      if(y.compareTo(max) > 0) {
         max = y;   // y is the largest so far
      }
      
      if(z.compareTo(max) > 0) {
         max = z;   // z is the largest now                 
      }
      return max;   // returns the largest object   
   }
   
   public static void main(String args[]) {
      System.out.printf("Max of %d, %d and %d is %d\n\n", 
         3, 4, 5, maximum( 3, 4, 5 ));

      System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
         6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));

      System.out.printf("Max of %s, %s and %s is %s\n","pear",
         "apple", "orange", maximum("pear", "apple", "orange"));
   }
}