class Temp<T>
{
	T x;
	T y;
	Temp(T x,T y)
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
		Temp<Integer> t1=new Temp<Integer>(10,20);
		t1.show();
		Temp<String> t2=new Temp<>("hello","hai");
		t2.show();
		//t1=t2//not possible
	}
}