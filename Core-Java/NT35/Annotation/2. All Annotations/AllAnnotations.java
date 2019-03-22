// Create And Read All Annotations: AllAnnotations.java

import java.lang.annotation.*;
//import java.lang.reflect.*;

// Creating Common Annotation that will work everywhere. Can be applied to any element of class.
//@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface AnnoCommon{
		String name();
		int number() default 9009999;
}

// Creating Annotation for Field
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface AnnoField{
	String fieldType();
	long Min_Value();
	long Max_Value();
}

// Creating Annotation for Constructor
@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
@interface AnnoConstructor{
	int number_of_para();
	String para_type();
}

// Creating Annotation for Method
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface AnnoMethod{
	String about();
}

// Creating Annotation for Local_Variable
@Target(ElementType.LOCAL_VARIABLE)
@Retention(RetentionPolicy.RUNTIME)
@interface AnnoLocalVariable{
	String about();
}

// Creating Annotation for Parameter
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface AnnoParameter{
	String about();
}

// Creating Marker Annotation: It is only to check if marker annotation is there on any part of the class.
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{}


// Creating Annotation for Annotation:	Indicates that the declared type itself is an annotation type.


// Implementing All Annotations Int Below Class.

@AnnoCommon(name="Hello")		// Only sending name, number will fetch the default value.
@MyMarker
class Employee{
	
	//Field
	@AnnoField(fieldType="Integer", Min_Value= Integer.MIN_VALUE, Max_Value = Integer.MAX_VALUE)
	public int eID;
		
	//Constructor
		@AnnoConstructor(number_of_para=0, para_type="")
		Employee(){}
		
		@AnnoConstructor(number_of_para=1, para_type="String")
		Employee(String s){
			System.out.println("Employee Name: " + s);
		}
		
	//Method
	@AnnoMethod(about = "This is salary method") 
	public void salary(){
		System.out.println("I am salary method");
	}
	
	//Method with parameter
	//@AnnoMethod(about = "This is salary Method with parameter") 
	public void getDesignation(int eID){
		System.out.println("Designation is Java Developer");
	}
	
	//Method with local variable
	//@AnnoMethod(about = "This is salary  Method with local variable") 
	public void getCTC(){
		int ctc = 5000000;
	}
	
	public static void main(String...a){
		new Employee("Ahmad Sayeed");
	}
}





