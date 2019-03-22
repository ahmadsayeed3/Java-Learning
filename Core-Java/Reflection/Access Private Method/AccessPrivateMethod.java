// Access Private Methods

import java.lang.reflect.*;

class GetMethods{
	private double div(int num1, int num2){
		return num1/num2;
	}
}

class AccessPrivateMethod{
	
	public static void main(String...a){
		try{
			GetMethods gm = new GetMethods();
			Class cl = gm.getClass();
			
			Method mt = cl.getDeclaredMethod("div", int.class, int.class);
			mt.setAccessible(true);
			System.out.println("Method Name: " + mt.getName());
			
			Double d = (Double) mt.invoke(gm, 10,5);
			System.out.println(d.doubleValue());
		}catch(Exception e){
			System.out.println(e);
		}
	}
}