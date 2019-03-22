//Local Nested Class - NestedLocalClass.java
//If a class is made inside any block except class the it is local class.
// Local class is same as local variable. as can see here, we have made same className in every block.

class OuterClass{
	
	int x = 100;
	static int y = 200;
	
	//1. Local Class Inside Static Block
	static {
		class ClassOne{
			
			//Constructor
			ClassOne(){
				System.out.println("I am Constructor Of ClassOne From Static Block");
			}
			
			void show(){
				System.out.println("Inside Static Block Yis: " + y);
			}
		}
		ClassOne co = new ClassOne();
		co.show();
	}	

	//2. Local Class Inside Init Block
	{
		class ClassOne{
			void show(){
				System.out.println("Inside Init Block X is: " + x);
			}
		}
		ClassOne co = new ClassOne();
		co.show();
	}
	
	
	//3. Local class inside Constructor
	OuterClass(){
		class InnerOne{
			public void show(){
				System.out.println("Inside Constructor X is: " + x);
			}
		}
		InnerOne io = new InnerOne();
		io.show();
	}
	
	//4. Local Class Inside Function
	void display(){
		class InnerTwo{
			public void show(){
				System.out.println("Inside display function X is: " + x);
			}
		}
		InnerTwo it = new InnerTwo();
		it.show();
	}

	
	public static void main(String...a){
		new OuterClass().display();
		new OuterClass();
	}

}