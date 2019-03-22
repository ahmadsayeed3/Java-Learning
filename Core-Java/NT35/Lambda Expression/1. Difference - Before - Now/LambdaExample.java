/* Difference between normal interface implementation and functional programming. */
/*	LambdaExample.java*/

@FunctionalInterface
interface Drawable{
	public void draw();		// Abstract method.
	
	/* register method */
	default void register(Drawable o){
		o.draw();
	}
}

class OldImplementation implements Drawable{
	
	@Override
	public void draw(){
		System.out.println("I old Implementation.");
	}
	
	public static void main(String...a){
		/* 1. Normal Way. Implement -> Override -> call the register method. */
		OldImplementation oi = new OldImplementation();
		oi.register(oi);
		
		/* 2. We have also had another option via anonymous class. */
		Drawable d = new Drawable(){
			public void draw(){
				System.out.println("I Old implementation via anonymous class.");
			}
		};
		
		d.draw();
	}
}

/* Let's check out the new implementation via lambda expression. */
class NewImplementation{
	
	public static void main(String...a){
		
		Drawable d2 = () -> {
			System.out.println("I new implementation");
			System.out.println("I new implementation With More lines.");
		};
		d2.draw();
	}
}