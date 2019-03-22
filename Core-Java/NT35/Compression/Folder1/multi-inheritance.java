//Let's proof thatjava does not support multi-inheritance
//This program will show error becasue java does not multi-inheritance
class MultiInheritance extends ClassSuper, ClassSuperSuper{
	MultiInheritance(){
		System.out.println("MultiInheritance Constructor");
	}

	public static void main(String...d){
		new MultiInheritance();
	}
}

class ClassSuper{
	ClassSuper(){
		System.out.println("ClassSuper Constructor");
	}
}

class ClassSuperSuper{
	ClassSuperSuper(){
		System.out.println("ClassSuperSuper Constructor");
	}
}