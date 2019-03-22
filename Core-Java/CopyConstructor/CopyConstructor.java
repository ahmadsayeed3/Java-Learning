class CopyConstructor{
	
	int x;
	int y;

	/*Constructor*/
	CopyConstructor(int x, int y){
		this.x = x;
		this.y = y;
	}

	/*Constructor*/
	CopyConstructor(CopyConstructor z){
		this.x = z.x;
		this.y = z.y;
	}

	/*Function*/
	void show(){
		System.out.println(x +" And " + y);
	}

	
	public static void main(String... a){
		CopyConstructor cc = new CopyConstructor(20, 50);
		cc.show();
		
		/*Copy Constructor in c++, Parameterized Constructor in java.*/
		CopyConstructor cc1 = new CopyConstructor(cc);
		cc1.show();
		
		cc1.x = 5600;
		
		System.out.println(cc.x);
		

	}
}