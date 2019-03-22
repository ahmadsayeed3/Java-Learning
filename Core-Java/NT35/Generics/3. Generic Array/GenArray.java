// Generic Array
class Gen<T extends Number>
{
	T ob; T vals[];
	Gen(T ob,T[] nums)
	{
		this.ob=ob;
		this.vals=nums;
	}
}
public class GenArray
{
	public static void main(String... s)
	{
	Integer n[]={1,2,3,4,5};
	
	Gen<Integer> iOb=new Gen<>(50,n);	// This is will sent an array as argument.
	
	
	//we can not create an array of type specific generic references, use only<?>
	/*If we want to make an generic array of references type then don't define any Wrapper/Class while creating an array.
		because if we define any data type then the all elements of an array will must me of that type.
		In that case we can't put different types in array elements.
	*/
	
	// As you can see 'gens' 0 position has Integer type and 1th position element is Float type
	Gen<?> gens[] = new Gen<?>[2]; 
	gens[0]= new Gen<Integer>(10,n);
	gens[1]= new Gen<Float>(2.3f,new Float[]{1.2f,2.2f});
	
	
	System.out.println(gens[0].ob);
	System.out.println(gens[1].ob);
	
	// we can get the values via loop.
	for(int i=0; i < gens[0].vals.length;i++)	System.out.println(gens[0].vals[i]);
	for(int i=0; i < gens[1].vals.length;i++)	System.out.println(gens[1].vals[i]);
    
	}
}
	


		