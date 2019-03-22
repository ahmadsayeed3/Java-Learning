package p1;  //package command

public class PackageOne{

	public void show(){
		System.out.println("Show From Package One");
	}

	public static void main(String...a){
		PackageOne po = new PackageOne();
		po.show();
	}
}