public class LambdaTest
{
  public static void main(String... s){
	LambdaTest tester=new LambdaTest();
	/* with type declaration */
	MathOperation addition=(int a,int b)->a+b;
	
	/* without type declaration */
	MathOperation subtraction=(a,b)->a-b;
	
	/* with return statement along with curly braces */
	MathOperation multiplication=(int a,int b)->{return a*b;};
	
	/* without return statement and without curly braces */
	MathOperation division=(int a,int b)->a/b;
	
	System.out.println("10+5= "+tester.operate(10,5,addition));
	System.out.println("10-5= "+tester.operate(10,5,subtraction));
	System.out.println("10*5= "+tester.operate(10,5,multiplication));
	System.out.println("10/5= "+tester.operate(10,5,division));
	
	GreetingService greetService1=message->System.out.println("hello "+message);
	GreetingService greetService2=message->{System.out.println("hello "+message);
	System.out.println("hai "+message);};
	
	greetService1.sayMessage("Mahesh");
	greetService2.sayMessage("Suresh");
  }

	interface MathOperation {
		int operation(int a,int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a,int b,MathOperation mathOperation) {
		return mathOperation.operation(a,b);
	}
}
	