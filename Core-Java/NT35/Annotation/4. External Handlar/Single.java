import java.lang.annotation.*;
import java.lang.reflect.*;

public class Single{
	
	@MySingle(100)
	public static void myMeth(){
		System.out.println("I am myMeth Method");
	}
	
	public static void main(String...a){
		System.out.println(new ExHandler().readAnnotation());
	}
}