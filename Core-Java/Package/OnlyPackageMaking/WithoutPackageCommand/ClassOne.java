We can command -d without making package. It will create default package that we can't see.

//To make package: javac -d . ClassName.java
//To Compile javac FileName.java, To Run: java PackageName.ClassName

//javac -d . ClassOne.java

//package p1;
public class ClassOne{
	
	public static void show(){
		System.out.println("Show ClassOne");
	}
	public static void main(String...a){
		show();
	}
}