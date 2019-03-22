enum Friends{
	PREM, VINEET, JAVED, TAUSHIF, LOVELY, PARUL
};

enum MoreFriends{
	ANIKA, PREM, VINEET, JAVED, TAUSHIF, LOVELY, PARUL
};

class MyFriends{
	
	public static void main(String...a){
		
// Enum class has also overridden the equals() method that compares the reference id.
		Friends f1, f2, f3;
		f1 = Friends.VINEET;
		f2 = Friends.VINEET;
		f3 = Friends.PREM;
		
		if(f1.equals(f2)) { System.out.println(f1 + " and " + f2 + " is equal...");  }
		if(!f1.equals(f3)) { System.out.println(f1 + " and " + f3 + " is not equal...");  }
		
// As we know it compares the reference id then we can compare it through ( == ) operator
		System.out.println("\n========== Via Operators ============\n");
		if(f1 == f2 ) { System.out.println(f1 + " and " + f2 + " is equal...");  }
		if(f1 != f3) { System.out.println(f1 + " and " + f3 + " is not equal...");  }
		
		// Let's compare the different "Enum" class with the same constant value.
		System.out.println("\n====== Comparison Between Two Enum Classes Constants =====\n");
		Friends fj = Friends.JAVED;
		MoreFriends mfj = MoreFriends.JAVED;
		
		if(fj.equals(mfj)){
			System.out.println(Friends.JAVED + " is equal to " + MoreFriends.JAVED);
		}else { System.out.println(Friends.JAVED + " is not equal to " + MoreFriends.JAVED); }
		
		/* I don't know why it says at compile: error: incomparable types: */
		/* if(fj == mfj){
			System.out.println(Friends.JAVED + " is equal to " + MoreFriends.JAVED);
		}else { System.out.println(Friends.JAVED + " is not equal to " + MoreFriends.JAVED); }
		*/
	}
}