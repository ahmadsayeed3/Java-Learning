// before compiling: 
//set classpath=C:\PackageFolder\Condition1 - Diffrenet-Folder-Same-Package-Class\Folder1;C:\PackageFolder\Condition1 - Diffrenet-Folder-Same-Package-Class\Folder2;

		// if PackageClass is available in first path then it will use path.
		// if not foud in first path then it will go second path like PackageClassTwo in this program

package p2;
import p1.*; // both have this package and same class.

//import p1.PackageClassTwo; // only inside Folder2\p1\

public class ClassOne{
	
	public static void main(String...a){

		//this is coming from Folder1\ p1 \ PackageClass
		new PackageClass().show();

		//this is coming from Folder2\ p1 \ PackageClass
		//new PackageClass().display(); // doesn't work. only class comes from second path
		
		// this class coming from Folder2 \ p1 \ PackageClassTwo
		new PackageClassTwo().draw();
	}

}