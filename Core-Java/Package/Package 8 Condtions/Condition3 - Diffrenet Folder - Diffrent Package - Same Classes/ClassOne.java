//Different Folder Different Package Same Classes. Will import all classes of both packages.
// set classpath=C:\PackageFolder\Condition3 - Different Folder - Different Package - Same - Classes\Folder 1;C:\PackageFolder\Condition3 - Different Folder - Different Package - Same - Classes\Folder 2;

// But it will create error if both package class have same name. 
// so to use this we need to write package name before class name

// like util and sql both have same name class "Date". It creates also creates error if import both package in a class.

package P3;

import P1.*;
import P2.*;

public class ClassOne{

	public static void main(String...a){

		//new PackageClass().show();  // Will Create Error
		
		new P1.PackageClass().show();  // will call P1 Package Show() Folder 1

		new P2.PackageClass().show();  // will call P1 Package Show()	Folder 2

		new P1.PackageClass().display();
		new P2.PackageClass().draw();
		
	}

}