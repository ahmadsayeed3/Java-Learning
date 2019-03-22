import java.lang.reflect.*;
class Calculator3
{
	public int result(int a,int b,Calculation cal)
	{
		return cal.operation(a,b);//+,- depand on cal
	}
	public static void main(String... s)
	{
		Calculation add=(a,b)->a+b;//here one proxy class will be created that will be child of Calculation interface
		Calculation sub=(a,b)->a-b;
		Calculation mult=(a,b)->a*b;
		Calculation div=(a,b)->a/b;
		Calculator3 c=new Calculator3();
		System.out.println("sum of two no. is "+c.result(10,20,add));
		System.out.println("sub of two no. is "+c.result(50,20,sub));
		System.out.println("mult of two no. is "+c.result(10,20,mult));
		System.out.println("div of two no. is "+c.result(40,20,div));
	}
}
interface Calculation
{
	int operation(int a,int b);
}