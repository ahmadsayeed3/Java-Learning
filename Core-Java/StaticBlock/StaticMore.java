/*System.exit accepts int data. no matter whatever it is.*/
class StaticMore{
	
	static{
		System.out.println("I am Static Block and I am going to exit");
		/*Working Same*/
		//System.exit(0);
		//System.exit(1);
		//System.exit('A');
		//System.exit((int) 1.5);
		//System.exit((int) 1.5d);
		//System.exit((int) 1.5f);
		//System.exit((int) 1L);
		
		/*Not Working*/
		//System.exit(1.5);
		//System.exit(Integer.parseInt("Ahmad"));
		//System.exit("Ahmad");
		//System.exit(true);
		//System.exit(false);
	}	

	public static void main(String... a){
		/*Main Won't run and this program will terminate from static block.*/
		System.out.println("I am Main Function Block");
	}
}