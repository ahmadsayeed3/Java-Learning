import p1.*;
import p1.ClassOne;
import p1.ClassThree;

class ClassTwo{
	
	public static void main(String... a){
		new ClassOne().show(); // From ClassOne
		new ClassThree().display(); // From ClassThree
	}
}