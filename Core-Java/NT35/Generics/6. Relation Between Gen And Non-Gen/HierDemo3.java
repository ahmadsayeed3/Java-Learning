class Gen<T>
{
	T ob;
	Gen(T ob)
	{
		this.ob=ob;
	}
	//return ob
	T getOb()
	{
		return ob;
	}
}
//a subclass of Gen
class Gen2<T> extends Gen<T>
{
	Gen2(T ob)
	{
		super(ob);
	}
}
public class HierDemo3
{
	public static void main(String... s)
	{
		//create a Gen object for Integer
		Gen<Integer> iOb=new Gen<Integer>(88);
		
		//create a Gen2 object for Integer
		Gen2<Integer> iOb2=new Gen2<>(99);
		
		//create a Gen2 object for String
		Gen2<String> strOb2=new Gen2<>("Generics Test");
		if(iOb2 instanceof Gen2<?>)
			System.out.println("iOb2 is instance of Gen2");
		if(iOb2 instanceof Gen<?>)
			System.out.println("iOb2 is instance of Gen");
		System.out.println();
		if(strOb2 instanceof Gen2<?>)//do not use here Gen2<Integer> use only ?
			System.out.println("strOb2 is instance of Gen2");
		if(strOb2 instanceof Gen<?>)
			System.out.println("strOb2 is instance of Gen");
		System.out.println();
		//see if iOb is an instance of Gen2, which is not
		if(iOb instanceof Gen2<?>)
			System.out.println("iOb is instance of Gen2");
		//see if iOb is an instance of Gen, which is
		if(iOb instanceof Gen<?>)
			System.out.println("iOb is instance of Gen");
	}
}
		

