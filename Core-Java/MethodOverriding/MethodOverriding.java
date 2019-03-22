// Understand the role of Access Modifier In case of Method Overriding: 4th Condition

class MethodOverriding{
	//Only for file saving
}

class Parent{
	
	//Same to same to overriding: Allowed
	protected void sameToSame(){
		System.out.println("I am SameToSame From Parent");
	}

	//Weakest To Strong: Allowed
	protected void weakToStrong(){
		System.out.println("I am weakToStrong From Parent");
	}

	//Strong to Weak: Not Allowed
	protected void strongToWeak(){
		System.out.println("I am strongToWeak From Parent");
	}

	//Static To Static: Allowed: But it is not Overriding, It is Function Hidding
	static void staticToStatic(){
		System.out.println("I am staticToStatic (Function Hidding) From Parent");
	}

	//Static To Non Static: Not Allowed
	//Non-Static To Static: Now Allowed

	//Final: We can't override this parent function
	final public void finalToAny(){
		System.out.println("I am finalToAny From Parent");
	}
	
}

class Child extends Parent{
	
	protected void sameToSame(){
		System.out.println("I am SameToSame From Child");
	}

	public void weakToStrong(){
		System.out.println("I am weakToStrong From Child");
	}

	// It will create compile time error becasue we can't overriding from strongToWeak 
	//So i am commenting
	/*private void strongToWeak(){
		System.out.println("I am strongToWeak from Child");
	}*/

	static void staticToStatic(){
		System.out.println("I am staticToStatic (Function Hiding) From Child");
	}

	/* //Will create error becasue with final we can't method overriding
	public void finalToAny(){
		System.out.println(" I am finalToAny From Child");
	}	
	*/
	
	public static void main(String...a){

		Child c = new Child();
	
		// Same to Same MethodOverriding
		c.sameToSame();
		// Let's proof that overriding is having
		((Parent)c).sameToSame();

		// Weak To Strong MethodOverriding
		c.weakToStrong();
		// Let's Proof that overriding is having
		((Parent)c).weakToStrong();

		// StrongToWeak : Not allowed
		/*
			c.strongToWeak();
		*/

		//StaticToStatic: Allowed (Function Hiding)
		c.staticToStatic();
		//Let's Proof that it is only function hidding not overriding
		((Parent)c).staticToStatic();

		//final To Any: can't happen overriden with final modifier
		//c.finalToAny();
		
	}
}

