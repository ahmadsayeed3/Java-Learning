// Way 2 

class OuterClass{

	int x = 100;
	static int y = 200;
	
	// m is holding reference id of annonymous class
	void display(My m){
		m.show();
	}
	
	public static void main(String...a){
		
		//Using Way2: Making and class. but that class will garbage after using
		OuterClass oc = new OuterClass();
		oc.display(new Temp());

		//Another Way:
		OuterClass oc1 = new OuterClass();
		oc1.display(
			new My(){
				public void show(){
					System.out.println("From Anonymous Class Show");		
				}
			}
		);

		//Also can do
		new OuterClass().display(
			new My(){
				public void show(){
					System.out.println("From Anonymous Class Show");		
				}
			}
		);
		
	}

}

interface My{
	void show();
}

class Temp implements My{
	public void show(){
		System.out.println("From Temp Class Show");		
	}
}