/*//We can't keep all classes in sigle file, becasue to acces the class outside it requires to make class as "public".
// We can't make all classes as public becuase rule says we have to save the .java file with "public class name".
//As we will have many public classes so obvious it is not possible.

//Why .java file name must be same as class?
//Whenever we make package and don't compile then .class file won't generate.
//then the class that is importing package will implicitly compile, generate .class and use that package.

  // package making command requires*/

package p1;

import p3.ClassThree;
public class ClassOne{

	public void show(){
		System.out.println("Show From ClassOne p1");
	}

	public static void main(String...a){
		ClassThree().display();
	}
}
