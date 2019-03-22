class NonGen	//a non generic class
{
	int num;
	NonGen(int i)
	{
		num=i;
	}
	int getNum()
	{
		return num;
	}
}
class Gen<T> extends NonGen		//a generic class
{
	T ob;		//declare an object of Type T
	Gen(T ob,int i)
	{
		super(i);
		this.ob=ob;
	}
	T getOb()//Return ob
	{
		return ob;
	}
}
public class HierDemo2
{
	public static void main(String... s)
	{
		//create a gen Object for String
		Gen<String> w=new Gen<String>("Hello",47);
		System.out.println(w.getOb()+" ");
		System.out.println(w.getNum()+" ");
	}
}
		
