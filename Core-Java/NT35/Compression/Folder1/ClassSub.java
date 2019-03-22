//This is how inheritance works.
// java only support single inheritance
class ClassSub extends ClassSuper{
	ClassSub(){
		super(25);
		System.out.println("ClassSub Constructor and " + this.x);
	}

	public static void main(String...d){
		new ClassSub();
	}
}

class ClassSuper{
	int x;
	ClassSuper(int y){
		this.x = y;   
		System.out.println("ClassSuper Constructor");
	}
}