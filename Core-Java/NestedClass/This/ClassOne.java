class ClassOne{

	int x = 100;
	
	class Inner{
		int x = 200;
		void show(){
			
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(ClassOne.this.x);
			
			System.out.println(this);
			System.out.println(ClassOne.this);
		}
	}
	public static void main(String...a){
		new ClassOne().new Inner().show();	
		ClassOne o = new ClassOne();
		Inner i = o.new Inner();
		i.show();

		new ClassOne().new Inner().show();
	}

}