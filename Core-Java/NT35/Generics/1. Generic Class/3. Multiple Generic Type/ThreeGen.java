class ThreeGen<T,V,lalu>
{
	T ob1;
	V ob2;
	lalu ob3;
	ThreeGen(T ob1,V ob2,lalu ob3)
	{
		this.ob1=ob1;
		this.ob2=ob2;
		this.ob3=ob3;
	}
	void showTypes()
	{
		System.out.println("Types of T is "+ob1.getClass().getName());
		System.out.println("Types of T is "+ob2.getClass().getName());
		System.out.println("Types of T is "+ob3.getClass().getName());
	}
	T getOb1()
	{
		return ob1;
	}
	V getOb2()
	{
		return ob2;
	}
	lalu getOb3()
	{
		return ob3;
	}
	public static void main(String... s)
	{
		ThreeGen<Integer,String,Double> tgObj=new ThreeGen<>(88,"Generics",2.4);
		tgObj.showTypes();
		int v=tgObj.getOb1();
		System.out.println("value "+v);
		String str=tgObj.getOb2();
		System.out.println("value "+str);
		Double d=tgObj.getOb3();
		System.out.println("value "+d);
	}
}