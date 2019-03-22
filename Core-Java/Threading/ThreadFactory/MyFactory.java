// ThreadFactory Class:  can create new thread using this class.

import java.util.concurrent.*;

public class MyFactory implements ThreadFactory{
		
		@Override
		public Thread newThread(Runnable r){
			return new Thread(r);
		}
	
	
	public static void main(String...a){
		MyFactory mf = new MyFactory();
		Thread t = mf.newThread(new MyThread());
		t.start();
	}
}


// User defined thread
class MyThread implements Runnable{
	
	@Override
	public void run(){
		System.out.println("Inside: " + Thread.currentThread().getName());
	}
}