//To make package: javac -d . ClassName.java
//To Compile javac FileName.java, To Run: java PackageName.ClassName

package p1; // Package Making Command.

public class ClassOne{	// class be public if wanted to access outside.
	
	public void show(){	//function must be public explicitly
		System.out.println("Show From p1");
	}

	public static void main(String...a){
		ClassOne co = new ClassOne();
		co.show();
	}

}