class methodOverLoading{
	
	public static void main(String... arg){
		AddClass ac = new AddClass();
		System.out.println("string: " + ac.add("Ahmad ", "Sayeed"));
		System.out.println("int: " + ac.add(15, 20));
		System.out.println("Float: " + ac.add(7.5f, 8.0f));
		System.out.println("Double: " + ac.add(5.5d, 9.90d));
		System.out.println("Long:" + ac.add(5L,6L));
		System.out.println("Boolean:" + ac.add(true,false));
		System.out.println("Char: " + ac.add('C', 'R'));
		
	}
}

class AddClass{
	
	String add(String s1, String s2){
		return s1 + s2;
	}
	
	int add(int n1, int n2){
		return n1 + n2;
	}
	
	float add(float f1, float f2){
		return f1 + f2;
	}
	
	double add(double d1, double d2){
		return d1 + d2;
	}
	
	long add(long l1, long l2){
		return l1 + l2;
	}
	
	int add(char c1, char c2){
		return c1 + c2;
	}
	/* We can't do this
	char/String add(char c1, char c2){
		return c1 + c2;
	}
	*/
	/* We can't do this
	boolean add(boolean b1, boolean b2){
		return b1 + b2;
	}*/
	
}