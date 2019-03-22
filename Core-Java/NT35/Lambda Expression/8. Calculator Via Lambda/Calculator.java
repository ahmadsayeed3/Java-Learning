import java.lang.reflect.*;
public class Calculator
{
	public int operateBinary(int a,int b,IntegerMath op)
	{
		return op.operation(a,b);
	}
	public static void main(String... s)throws Exception
	{
		Calculator myapp=new Calculator();
		IntegerMath addition=(int a,int b)->a+b;//here one proxy class will be created and object of proxy class pass to addition
		System.out.println(addition);		
		IntegerMath subtraction=(a,b)->a-b;
		Class c=subtraction.getClass();
		/* Method mm[]=c.getMethods();//here we get proxy class has method operation
		for(int i=0;i<mm.length;i++)
			System.out.println(mm[i].getName()+" hello");  */
        /* Field mm[]=c.getFields();
		for(int i=0;i<mm.length;i++)
			System.out.println(mm[i].getName()+" hello");	*/
		if(c.isInterface())
			System.out.println("it is interface");
		else if(c.isPrimitive())
			System.out.println("it is primitive");
		else if(c.isArray())
			System.out.println("it is array");
		else
			System.out.println("it is a class");
		System.out.println(c.getName());
		Class in[]=c.getInterfaces();
		for(Class t:in)
			System.out.println(t.getName()+" "+"interface");
		//Method m=c.getDeclaredMethod("operation",int.class,int.class);//method name with arguments
		//System.out.println(m.getName());
		System.out.println("40+2= "+myapp.operateBinary(40,2,addition));
		System.out.println("20-10= "+myapp.operateBinary(20,10,subtraction));
	}
}
interface IntegerMath
{
	int operation(int a,int b);
}