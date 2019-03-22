// This is external handler for AllAnnotations.java

import java.lang.annotation.*;
import java.lang.reflect.*;

class ExHandler{
	
	Employee aa;
	Class cc;
	
	// Constructor
	ExHandler(){
		aa = new Employee();
		cc = aa.getClass();
		
		// reading class annotation
		AnnoCommon ac = (AnnoCommon) cc.getAnnotation(AnnoCommon.class);
		System.out.println("Class Level: name = " + ac.name() + ", number = " + ac.number());
		
		// Checking if any annotation is present. 
		if(cc.isAnnotationPresent(MyMarker.class)){
			System.out.println("Yes. MyMarker annotation is present in the class");
		}
		System.out.println();
	}
	
	public void readFieldsAnno(){
		try{
			Field f = cc.getDeclaredField("eID");
			AnnoField af = f.getAnnotation(AnnoField.class);
			System.out.println("Field type is = " + af.fieldType() + ", Min value is = " + af.Min_Value() 
			+ ", Max value is = " + af.Max_Value());
		}catch(Exception e){
			System.err.println("No Field Found: " + e);
		}
	}
	
	public void readMethodAnno(){
		try{
			// Now, get a method object that represents this method.
			Method m1 = cc.getMethod("salary");
			System.out.println(m1);
			
			// Now get the annotation for this class.
			AnnoMethod am = m1.getAnnotation(AnnoMethod.class);
				
				// finally display the values.
				String about = am.about();
				System.out.println(about);
				System.out.println("");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void readConstructorAnno(){
		try{
			
			Constructor c1 = cc.getDeclaredConstructor(String.class);
			AnnoConstructor ac = (AnnoConstructor) c1.getAnnotation(AnnoConstructor.class);
			System.out.println(c1);
			System.out.println("Number of Para: " + ac.number_of_para());
			System.out.println("Para Type: " + ac.para_type());
			System.out.println("");
		}catch(Exception e){
			System.err.println("Constructor: " + e);
		}
	}
	
	
	
	public static void main(String...a){
		ExHandler ex = new ExHandler();
		ex.readConstructorAnno();
		ex.readMethodAnno();
		ex.readFieldsAnno();
		
	}
}