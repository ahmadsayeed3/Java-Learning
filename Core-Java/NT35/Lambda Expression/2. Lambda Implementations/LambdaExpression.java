/* Different Examples of Lambda Expression */
@FunctionalInterface
interface Sayable{
	public String say();
}

interface Sayable1{
	public String say(String name);
}

@FunctionalInterface
interface Addable{
	int add (int a, int b);  /* by default public and abstract */
}

/* via functional programming we don't need to even implement the interface. */
class LambdaExpression{
	
	public static void main(String...args){
		
		/* 1. With no parameter */
		Sayable s = () -> { return "Nothing to say";};
		System.out.println(s.say());
		
		/* 2. With Single parameter */
		Sayable1 s1 = (name)->{ return "Hello " + name; };
		System.out.println(s1.say("Sayeed"));
		
		/* Can Also write: omit parentheses */
		s1 = name -> { return "Hii " + name; };
		System.out.println(s1.say("Ahmad"));
		System.out.println(s1.say("Ahmad Sayeed"));
		
		/* 3. With Multiple Parameters. if single statement there then JVM figure out itself what type of data has to return. */
		Addable ad1 = (int a, int b) -> (a+b);
		System.out.println("10+20: " + ad1.add(10, 20));
		
		/* we can also eliminate parameter type */
		ad1 = (a,b) -> (a+b);
		System.out.println("50+40: " + ad1.add(50, 40));
		
		/* With return keyword:  {} required */
		ad1 = (a,b) -> { return a+b; };
		System.out.println("35+25: " + ad1.add(35, 25));
		
		/* 4. With Multiple Statement */
		Sayable s2 = () -> {
			System.out.println("My First Statement");
			System.out.println("My Second Statement");
			System.out.println("My Third Statement");
			return "I am also returning an statement";
		};
		System.out.println(s2.say());
	}
}