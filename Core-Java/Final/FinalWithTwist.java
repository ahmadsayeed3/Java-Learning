class FinalWithTwist{
	
	final int x = getValue();
	final static int y = getY();

	int getValue(){
		
		//It should create error but it prints 0 then return 500
		System.out.println("From getValue X is: " + x);
		return 500;
	}

	static int getY(){
		System.out.println("From getValue Y is: " + y);
		return 900;
	}

	FinalWithTwist(){
		// x is assigned two times first 0 and then 500.
		//but final rule says it can only assign one time.
		
		System.out.println("From Constructor X is :" + x);
		System.out.println("From Constructor y is :" + y);
	}

	public static void main(String...a){
		new FinalWithTwist();
	}

}

/*
Output:
From getValue X is: 0
From Constructor X is :500

Just accepts that it is working. No Answer by Manish Sir
*/