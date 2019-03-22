// OwnCloseableClass.java

// Own Closeable Class
class ClassOne implements AutoCloseable{
	void show(){
		System.out.println("Show From ClassOne");
	}
	/* Overriding the close method that inside AutoCloseable interface */
	public void close(){
		System.out.println("Close From ClassOne");
	}
}

class ClassTwo implements AutoCloseable{
	void display(){
		System.out.println("Display From ClassTwo");
	}
	/* Overriding the close method that inside AutoCloseable interface */
	public void close(){
		System.out.println("Close From ClassTwo");
	}
}


/* Automatic Resource Handling (ARE): Don't need to close the resource explicitly */
class ClassThree{
	
	public static void main(String...a){
		
		/* Automatic Resource Handling: notice we have not call close() but it will done by JVM
			The resources will be close in reverse order. ClassTwo resources will be close the ClassOne Resources will be close.*/
		try(ClassOne co = new ClassOne(); ClassTwo ct = new ClassTwo()){
			co.show();
			ct.display();
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}