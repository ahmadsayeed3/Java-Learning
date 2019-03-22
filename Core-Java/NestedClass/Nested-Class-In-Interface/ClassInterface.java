interface My1{
	
	//1. Nested Class
	class Inner{
		void display(){
			System.out.println("Inner Class From Display");
		}
	}
	
	
	
	//2. Local Class in Interface
	default void xyz(){
		class Local{
			void display(){
				System.out.println("Display From Local Class");
			}
		}

		Local l = new Local();
		l.display();	
	}

	//3. Annonymouse Class
	My z = new My(){
		public void show(){
			System.out.println("Show From Annonymouse Class");
		}
	};
}

interface My{
	void show();
}

class ClassInterface implements My1{

	public static void main(String...a){
		ClassInterface ci = new ClassInterface();
		ci.xyz();
		z.show();

		Inner i = new Inner();
		i.display();
	}

}