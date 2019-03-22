// Access private constructor 

import java.lang.reflect.*;

class Temp{
	private Temp(){
		System.out.println("Default Constructor");
	}
	
	private Temp(int x){
		System.out.println(x + " Via Parameterized Constructor");
	}
	
	void show(){
		System.out.println("Show Method");
	}
}

class PrivateConstructor{
	
	public static void main(String...a){
		try{
			
			Class cl = Temp.class;
			
			//Acceding Default Constructor
			Constructor c = cl.getDeclaredConstructor();
			c.setAccessible(true);
			Temp t1 = (Temp) c.newInstance();
			t1.show();
			
			//Acceding Parameterized Constructor
			Constructor c1 = cl.getDeclaredConstructor(int.class);
			c1.setAccessible(true);
			Temp t2 = (Temp) c1.newInstance(5000);
			t2.show();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}