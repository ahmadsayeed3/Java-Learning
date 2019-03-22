// Nested Local Class With Function: - NestedLocalClassWithFunction.java

class OuterClass{

	int x = 100;
	static int y = 200;

//	non-static function
	void func(){
		class InnerLocal{
			
			public void show1(){
				System.out.println("Static Function X is: " + x);		
				System.out.println("Static Function Y is: " + y);
			}
		}
		InnerLocal il = new InnerLocal();
		il.show1();
	}

//	Static function
	static void funcStatic(){
		class InnerLocal{
			public void show1(){
				//System.out.println("Static Function X is: " + x);		
				System.out.println("Static Function Y is: " + y);
			}
		}
		InnerLocal il = new InnerLocal();
		il.show1();
	}
	
//	non-static 
	My funcOne(){
		class InnerLocal implements My
		{
				int mi = 6;
				public void showOne(){
					System.out.println("Direct Going To Call Show One Function");
				}
				
				public void showTwo(){
					System.out.println("Direct Going To Call Show Two Function");
				}
		}
		
		My z = new InnerLocal();
		return z;
	}
	
	public static void main(String...a){
		new OuterClass().func(); 
		funcStatic();
		
		//now let's call function of local class without calling that function inside local Class.
		OuterClass oc = new OuterClass();
		My m = oc.funcOne();
		m.showOne();
		
		//also this way
		new OuterClass().funcOne().showOne();
		new OuterClass().funcOne().showTwo();
		
		
	}

}

interface My{
	void showOne(); // by default public and abstract
	void showTwo();
}