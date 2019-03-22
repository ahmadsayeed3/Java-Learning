class ExplicitlyCallMain{
	public static void main(String a[]){
		System.out.println("Hello, I am From Class One");
	}
}

class ClassTwo{
	public static void main(String a[]){
		System.out.println("Hello, I am From Class Two");
		String z[] = {"Amad"};
		ExplicitlyCallMain.main(z);
	}
}