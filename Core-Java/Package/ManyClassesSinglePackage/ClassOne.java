//package p2;
//import p1.*;	// To link all classes of "p1" packages. However Not Recommended.

// Recommended
import p1.PackageOne; 
import p1.PackageTwo;
import p1.PackageThree;


class ClassOne{

	public static void main(String...a){
		new PackageOne().show();
		new PackageTwo().display();
		new PackageThree().draw();
	}
}