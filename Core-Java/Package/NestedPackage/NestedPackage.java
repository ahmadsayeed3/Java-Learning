//Nested Package

//set classpath=C:\PackageFolder\NestedPackage;

package p3;

import p1.*; 	// It will only import classes of p1 Package. It won't import Sub Packages
import p1.p2.*; // Now It will import p2 package (Sub Package)

class NestedPackage{

	public static void main(String...a){
		new PackageOne().show(); // from p1
		new PackageTwo().showTwo(); // from p2
	}
}

