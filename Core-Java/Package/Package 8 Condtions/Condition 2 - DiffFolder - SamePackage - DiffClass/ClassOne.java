//Two Diiferent folder having a same package with a different classes.

// set classpath=C:\PackageFolder\Condition2 - DiffFolder - SamePackage - DiffClass\Folder1;C:\PackageFolder\Condition2 - DiffFolder - SamePackage - DiffClass\Folder2;

package p2;
import p1.*; // It will import all classes from both package (From folder1 and folder2).

class ClassOne{

	public static void main(String...a){
		new PackageOne().show();
		new PackageTwo().display();
	}

}