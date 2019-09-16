import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

public class Program1{
	public static void main(String...a){
		System.out.println("Hwllo Java....");
	 	List<String> myList = new ArrayList<String>();
		myList.add("Welcome!!!");
		myList.add("Welcome to home!!!");
		myList.add("Welcome to home again!!!");
	
	
		// Way 1
		/* MyConsumer myc = new MyConsumer();
		myList.forEach(myc); */
		
		// Way 2
		myList-> System.out.println(s);
		
	}
}

class MyConsumer<String> implements Consumer<String>{
	public void accept(String str){
		System.out.println("Message: " + str);
	}
}