// If we have only primitive data at the class then it will be simple cloning...
class SimpleClone implements Cloneable{

	int x = 10;
	int y = 20;
	
	// overriding the clone() of object class...
	@Override
	public SimpleClone clone(){
		try{  return (SimpleClone) super.clone();  }
		catch(CloneNotSupportedException e){
			System.out.println(e);
			return null;
		}
	}
	
	public static void main(String...a){
		
		SimpleClone s1 = new SimpleClone();
		SimpleClone s2 = s1.clone();
		System.out.println(s2.x);
	}
}