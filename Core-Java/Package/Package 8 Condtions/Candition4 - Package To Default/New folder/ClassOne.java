//Using the class of one Package into the class of default package.
//This is default package because not mentioning the package making command

// set classpath=C:\PackageFolder\Condition4 - Package To Default

//  import p1.*; // It will create error

import p1.PackageClass;  //force Java to use package to default

public class ClassOne{

	public static void main(String...a){
		new PackageClass().show();
	}
}