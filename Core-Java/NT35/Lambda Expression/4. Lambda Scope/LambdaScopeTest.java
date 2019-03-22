// Lambda Scope with Inner classes

import java.util.function.Consumer;		// an interface

public class LambdaScopeTest{
	
	public int x = 0;
	
	// Inner Class
	class FirstLevel{
		public int x =1;
		
		void methodInFirstLevel(int x){
			Consumer<Integer> MyConsumer = (y) -> {
				System.out.println("X = " + x);
				System.out.println("Y = " + y);
				System.out.println("this.x = " + this.x);
				System.out.println("LambdaScopeTest.this.x = " + LambdaScopeTest.this.x);
			};
			
			MyConsumer.accept(x);
		}
	}
	
	public static void main(String...a){
		LambdaScopeTest st = new LambdaScopeTest();
		LambdaScopeTest.FirstLevel f1 = st. new FirstLevel();
		f1.methodInFirstLevel(11);
	}
}