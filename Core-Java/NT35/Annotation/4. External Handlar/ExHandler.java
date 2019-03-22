// Annotation External Hander

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention (RetentionPolicy.RUNTIME)
@interface MySingle{
	int value();
}

public class ExHandler{
	public int readAnnotation(){
		Single ob = new Single();
		int x=0;
		try{
			Method m = ob.getClass().getMethod("myMeth");
			MySingle anno = m.getAnnotation(MySingle.class);
			
		    x = anno.value();
			System.out.println(x);
			System.out.println(anno.getClass().getName());
		}
		catch(NoSuchMethodException e){
			System.out.println("Method Not Found");
		}
		return x;
	}
	
	/* public static void main(String...a){
		readAnnotation();
	} */
}