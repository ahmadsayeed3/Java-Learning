class ClassLevel{
	
	int x =  this.funcNum();

	//funcNum();
	int funcNum(){
		return 50;
	}
	
	public static void main(String... a){
		ClassLevel cl = new ClassLevel();
		System.out.println(cl.x);
	}
}