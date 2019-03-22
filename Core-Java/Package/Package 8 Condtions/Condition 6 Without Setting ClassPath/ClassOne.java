// Using a class of one package into the class of another package without setting the classpath.

// To Compile: javac -classpath PackagePath; -d . FileName.java
// To Run: java -classpath PackagePath; -d PackageName.ImportClassName

package p2;
import p1.*;

class ClassOne{
	
	public static void main(String...a){
		new PackageOne().show();
	}

}
