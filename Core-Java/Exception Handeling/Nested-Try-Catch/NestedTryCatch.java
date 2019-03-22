class NestedTryCatch{

	public static void main(String...a){
		// In try Block if One Exception comes then all code will skip so we should create
		// diferent tryCatch for diferent task Like below:
		
		// Task 1
			try{
				int x = 10/a.length;
				System.out.println(x);
			}catch(ArithmeticException e){
				System.out.println("AE: " + e);
				
				/* CODE Lines That May Create Exception*/
				/* CODE Lines That May Create Exception*/
				/* CODE Lines That May Create Exception*/
				/* CODE Lines That May Create Exception*/
				
				// Close The Resource
			}
			
		//Task 2
			try{
				int y[] = new int[a.length];
				y[2] = 123456;
				System.out.println(y[2]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("AIOBE: " + e);
				
				/* CODE Lines That May Create Exception*/
				/* CODE Lines That May Create Exception*/
				/* CODE Lines That May Create Exception*/
				/* CODE Lines That May Create Exception*/
				
				// Close The Resource
			}
		
		// But Still we don't know what kind of Exception can come so we add Exception class in Catch block
			try {
				String s = a[0];
				System.out.println(s.length());
			}catch(NullPointerException e){
				System.out.println("NPE: " + e);
			}catch(Exception e){
				System.out.println("E: " + e);
			}
			
		// As we can notice, if we create seperate tryCatch for every task then we need to add
		// Exception Class catch with evry Try. To solve it we can use Nested Try.
		
		try{
		
		//Task 1 
			try {
				
				// here we expecting to come NullPointerException but something else comes.
				// then out exception will handle that and program won't terminate.
				
				String ss[] = new String[a.length];
				ss[2] = "Ahmad Sayeed";
				
				String s = a[0];
				System.out.println(s.length());
			}catch(NullPointerException e){
				System.out.println("NPE: " + e);
			}
			
			
		// Task 2
			try{
				int m = 10/a.length;
				System.out.println(m);
			}catch(ArithmeticException e){
				System.out.println("AE: " + e);
			}
			
		//Task 3
			try{
				int n[] = new int[a.length];
				n[2] = 123456;
				System.out.println(n[2]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("AIOBE: " + e);
			}
			
		}catch(Exception e){
			System.out.println("Outer Exception: " + e);
		}
	}
}