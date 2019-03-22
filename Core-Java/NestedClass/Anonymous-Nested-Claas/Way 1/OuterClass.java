// Anonymous Nested Class:  OuterClass.java

class OuterClass{
	
	int x =100;
	static int y = 200;

	My display(){	  // returning reference type data that's why "My" is return type

	// Anonymous Inner Class

		return(
			new My(){    // Class does have any name that's why to create memory giving iterface name with constructor systex
				public void show(){
					System.out.println("X is: " + x);
					System.out.println("Y is: " + y);
				}
			}
		);
	}

	public static void main(String...a){
		OuterClass o = new OuterClass();
		My m = o.display();
		m.show();

		new OuterClass().display().show();	
	}
}

interface My{
	void show();
}