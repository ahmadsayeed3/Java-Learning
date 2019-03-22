import p1.PackageOne;
import p1.PackageTwo;
//import p1.*;

class ClassOne{
	
	public static void main(String...a){
		PackageOne po = new PackageOne();
		po.show();

		new PackageTwo().display();
	}
}