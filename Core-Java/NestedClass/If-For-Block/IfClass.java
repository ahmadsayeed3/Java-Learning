class IfClass{
	
	void display(){
		
		if(1==1){
			class Inner{
				void show(){
					System.out.println("I am Show");
					for(int i =0; i<5; i++){
						class InnerFor{
							void show(){
								System.out.println("Show From Loop");
							}
						}
						new InnerFor().show();
					}
				}
			}
			new Inner().show();
		}	
	}
			

	final public static void main(String...a){
		new IfClass().display();
	}

}