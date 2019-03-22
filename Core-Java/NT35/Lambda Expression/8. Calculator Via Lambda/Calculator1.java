import java.lang.reflect.*;
public class Calculator1
{
	public int operateBinary(int a,int b,IntegerMath op)
	{
		return op.operation(a,b);
	}
	public static void main(String... s)throws Exception
	{
		Calculator1 myapp=new Calculator1();
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
		Method mm[]=c.getMethods();
		for(int i=0;i<mm.length;i++)
		{
			Class type[]=mm[i].getParameterTypes();
			System.out.print(mm[i].getName()+" ");
			for(int ii=0;ii<type.length;ii++)
				System.out.print(type[ii].getName()+" , ");
			System.out.println();
		}
		//if(c.isClass())//we can not write this statement c.isInterface()
			System.out.println("it is a class");
		System.out.println(c.getName());
		Class in[]=c.getInterfaces();
		for(Class t:in)
			System.out.println(t.getName()+" "+"interface");
		System.out.println("40+2= "+myapp.operateBinary(40,2,addition));
		System.out.println("20-10= "+myapp.operateBinary(20,10,subtraction));
	}
}
interface IntegerMath
{
	int operation(int a,int b);
}