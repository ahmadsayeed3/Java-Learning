class MainThread {

	public static void main(String...a){
		Thread t = Thread.currentThread();
		System.out.println("Thread Name " + t.getName());
		System.out.println("Prority: " + t.getPriority());
		//System.out.println("Group: " + t.getThreadGroup);
		System.out.println("Thread ID: " + t.getId());
		System.out.println("Thread Status: " + t.getState());
		//System.out.println("Check If Thread is Daemon Thread: " + t.isDeamon());
		
		// t.suspend(); // (Deprecated) Only suspend the thread does not terminate the program
		//t.stop(); // (Deprecated) // stop thread and terminate the program
		System.out.println(t);
		
		System.out.println("No Of Active Threads are: " + Thread.activeCount());
		
		
		// Change the thread name
		t.setName("Sayeed Thread");
		t.setPriority(1);
		System.out.println(t);
		try{
			t.start();
		}catch(IllegalThreadStateException e){
			System.out.println("Once a thread is started, you can't start again");
			System.out.println(e);
		}
		
	}
}