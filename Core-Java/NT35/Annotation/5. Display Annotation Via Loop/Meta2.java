// Display the all annotations of a class.

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String str();
	int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What{
	String description();
}

// Going to implement the annotations
@What(description = "Annotation Test Class")
@MyAnno(str= "Class", val= 100)
public class Meta2{
	
	//Constructor
	Meta2(){}
	
	public static void main(String...a){
		myMeth();
	}
	
	@What(description = "Annotation Test Method")
	@MyAnno(str= "Method", val= 500)
	public static void myMeth(){
		
		//reading the annotations
		Meta2 ob = new Meta2();
		try{
			
			// Get annotation of class "MyAnno"
			MyAnno mm = ob.getClass().getAnnotation(MyAnno.class);
			System.out.println(mm.getClass().getName());
			System.out.println(mm.str());
			System.out.println("\n" + mm.val());
			
			// Now get the all annotations of class "MyAnno and What"
			Annotation annos[] = ob.getClass().getAnnotations();
			System.out.println("/nNow get the all annotations of class 'MyAnno and What'");
			for(Annotation an: annos){
				System.out.println(an);
			}
			
			// Now Display all the annotations of method myMeth()
			System.out.println("\n Now Display all the annotations of method myMeth()");
			Method m = ob.getClass().getMethod("myMeth");
			annos = m.getAnnotations();
			
			for(Annotation an: annos){
				System.out.println(an);
			}
			
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}