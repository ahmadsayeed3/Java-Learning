/* One Class using another class (PackageClass) which is paralled to it.
If The class also getting a class from another package. */

// set classpath=C:\PackageFolder\Condition 8 - Priority GoesToLocal;E:\Java\JavaPrograms\Package\Package 8 Condtions\Condition 8 - Priority GoesToLocal;

//First path is different directory(Outside the Package). and the second is parallel path.
//Priority goes to always local even if classpath is set in first.

import p1.PackageOne; // Outer Package and Parallel both have same package and class (PackageOne).

class ClassOne{
	
	public static void main(String...a){
		new PackageOne().show();
	}

}

