class Gen<T>{
	T ob;	// declare an object type T
	
	/* Pass the constructor a reference to an object of type T.*/
	Gen(T ob){
		this.ob=ob;
	}
	
	// return ob.
	T getOb(){
		System.out.println("Gen's getOb(): ");
		return ob;
	}
}
class Gen2<T> extends Gen<T>{
	Gen2(T ob){
		super(ob);
	}
	
	T getOb(){
		System.out.println("Gen2's getOb(): ");
		return ob;
	}
}
public class OverrideDemo
{
	public static void main(String... s)
	{
		Gen<Integer> iOb=new Gen<>(88);
		Gen2<Integer> iOb2=new Gen2<>(99);
		Gen2<String> striOb2=new Gen2<>("Hello dost");
		
		System.out.println(iOb.getOb());
		System.out.println(iOb2.getOb());
		System.out.println(striOb2.getOb());
	}
}