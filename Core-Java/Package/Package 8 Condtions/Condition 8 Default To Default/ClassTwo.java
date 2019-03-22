class ClassTwo{

	public void show(){
		System.out.println("ShowFrom ClassOne");
	}

	public static void main(String...a){
		new ClassOne().show();
	}

}