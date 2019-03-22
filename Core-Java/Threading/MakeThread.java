class MakeThread extends Thread{

	public void run(){
		System.out.println("My Thread is running Now");
	}
	public static void main(String...a){
		
		MakeThread mt = new MakeThread();
		mt.start();
	}
}


class MakeThreadTwo implements Runnable{
	
	public static void main(String...a){
		MakeThreadTwo mt2 = new MakeThreadTwo();
		Thread t1 = new Thread(mt2);
		t1.start();
	}
	
	public void run(){
		System.out.println("My Thread is running via implementing the Runnable Interface");
	}
}