// Way 3: We can hold reference id of anonymous class

class OuterClass{

	public static void main(String...a){
		My m = new My(){
				public void show(){
					System.out.println("From Anonymous Class Show");		
				}
				
				/*public void display(){
					System.out.println("From Anonymous Class Display");
				}*/
			};
		
		m.show();	
		//m.display();	
	}

}

interface My{
	void show();
}