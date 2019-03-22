// Exchanger: can swap values between two threads
/*
	Exchanger is synchronization point at which threads can pair and swap elements within pairs.
	Each thread presents some object, and receive its partners object on return.
	An Exchanger may be viewed as a bi-directional form of a synchronousQueue.

	This Java program creates 2 threads passing them an exchanger and a message. 
	Each threads print its own message, then exchange with it the other thread, then print out
	its new exchange message.
*/

import java.util.concurrent.*;

public class ExchangerExample{
	
	public static void main(String...a){
		
		Exchanger<String> exchanger = new Exchanger<String> ();
		
		Thread t1 = new MyThread(exchanger, "I Like Coffee");
		Thread t2 = new MyThread(exchanger, "I Like Tea");
		t1.start();
		t2.start();
	}
}


// User Defined Thread Class
class MyThread extends Thread{
	
	Exchanger<String> exchanger;
	String message;
	
	//Constructor
	MyThread(Exchanger<String> exchanger, String message){
		this.exchanger = exchanger;
		this.message = message;
	}
	
	public void run(){
		try{
			System.out.println(this.getName() + " Message: " + message);
			
			//exchange the message
			message = exchanger.exchange(message);
			
			System.out.println(this.getName() + " Message: " + message);
			
		}catch(Exception e){ e.printStackTrace();	}
	}
}