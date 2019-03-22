// All conditions applied in case of static only.
//set classpath=C:\PackageFolder\StaticImportPackage;

package p2;

import static p1.PackageClass.*; // now I can only get all static things of p1 package and PackageClass. We can access only one class from a package if import statically
//import static p1.PackageClass.display; //now it will only have display function, same apply on data member
//import static p1.*; can't work
//import p1.PackageClass ; // however I can import statically as well as non-statically. All class members will available

import static java.lang.System.*; // now i have done statically import System class So I will access without className.

class StaticImport{

	public static void main(String...a){
		
		//Calling Static Method
		

		//PackageClass.display(); //does not work: becasue don't know where the PackageClass is.
			//PackageClass().display(); //does not work: becasue don't know where the PackageClass is.
		p1.PackageClass.display(); //does work Why?: becasue it knows class is inside p1 package
		//display(); // works fine becasue Why?: static function store inside method area so calling direct

		//Calling non-static function
		
			//new PackageClass().show(); // can't use becasue I have done statically import
						// If we do normal import then it will work

		//Using "out" function without ClassName "System"
		out.println("I am Out Function Without ClassName System");
	}

}