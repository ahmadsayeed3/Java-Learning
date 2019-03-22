// Create Annonymous Array Of Reference Variable

class ClassOne{

	int x = 50;

	void show(ClassOne z[]){
		for(int i =0; i< z.length; i++){
			System.out.println(z[i].x);
		}
	}

	public static void main(String...a){
		
		ClassOne c = new ClassOne();		

		//normal way
		ClassOne co[] = {new ClassOne(), new ClassOne(), new ClassOne()};
		System.out.println(co[1].x);
		c.show(co);				

		//Annonymous way
		
		c.show( new ClassOne[] {
				new ClassOne(),
				new ClassOne(),
				new ClassOne()
			}
		);
	}
}