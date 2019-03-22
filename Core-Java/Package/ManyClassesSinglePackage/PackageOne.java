// Keep a seperate .java file for each public class.
// To compile single class javac -d . FileName.java;
// To compile all clases at a time javac -d . *.java;

package p1; // package making command

public class PackageOne{

	public void show(){
		System.out.println("Show From PackageOne");
	}

	public static void main(String...a){
	}
}