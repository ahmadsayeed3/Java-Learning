// Via this way, we can add any type reference variable in the array.
class Temp1<T>
{
	T x;
	T y;
	Temp1(T x,T y)
	{
		this.x=x;
		this.y=y;
	}
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String... s)
	{
		// <?> it allows our array to accepts any type that come from right side.
		Temp1<?> t[]=new Temp1<?>[10];
		t[0]=new Temp1<Integer>(10,20);
		t[1]=new Temp1<String>("Hello","Hay");
		t[0].show();
		t[1].show();
	}
}
		
