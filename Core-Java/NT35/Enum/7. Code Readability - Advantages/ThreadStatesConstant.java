// Code Readability and Advantages:

// Via Enum
enum ThreadStates {
	START,	RUNNING, WAITING, DEAD;
}

// via final static constants

public class ThreadStatesConstant {
	
	// same as enum with final static data members
	public static final int START = 1;
	public static final int WAITING = 2;
	public static final int RUNNING = 3;
	public static final int DEAD = 4;

	
	// main
	public static void main(String...a) {
		//Enum values are fixed
		simpleEnumExample(ThreadStates.START);
		simpleEnumExample(ThreadStates.WAITING);
		simpleEnumExample(ThreadStates.RUNNING);
		simpleEnumExample(ThreadStates.DEAD);
		simpleEnumExample(null);
		
		
		/* we can’t figure out what 1 or other numbers are denoting. As we can see above that explains what parameter is about. */
		simpleConstantsExample(1);	
		simpleConstantsExample(2);
		simpleConstantsExample(3);
		simpleConstantsExample(4);
		//we can pass any int constant but not in case of enum
		simpleConstantsExample(5);
	}

	/* This method shows the benefit of using Enum over Constants */
	private static void simpleEnumExample(ThreadStates th) {
		if(th == ThreadStates.START) System.out.println("Thread started");
		else if (th == ThreadStates.WAITING) System.out.println("Thread is waiting");
		else if (th == ThreadStates.RUNNING) System.out.println("Thread is running");
		else System.out.println("Thread is dead");
	}
	
	private static void simpleConstantsExample(int i) {
		if(i == ThreadStatesConstant.START) System.out.println("Thread started");
		else if (i == ThreadStatesConstant.WAITING) System.out.println("Thread is waiting");
		else if (i == ThreadStatesConstant.RUNNING) System.out.println("Thread is running");
		else System.out.println("Thread is dead");
	}
}

