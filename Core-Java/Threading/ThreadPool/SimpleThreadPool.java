// From JDK5
/*
	Thread Pool are useful when we need to limited number of threads in our program at the same time.
	There is a performance overhead associated with starting a new thread, and each thread is also allocated some memory
	for its stack.
	
	Servers that processing request can spend more time and consume more system resource in creating an deploying
	threads that it would processing actual client requests.
	
	Instead of starting a new thread for every tasks to execute concurrently, the task can be passed to a thread pool.
	As soon as the pool has any idle threads the task is assigned to one of them and executed.
	Internally the tasks are inserted into a Blocking Queue which the threads in the pool are dequeuing from.
	When a new task is inserted into the queue one of the idle threads will dequeue it successfully and execute it. The rest
	of the idle threads in the pool will be blocked waiting to dequeue tasks.
	
	It's pool of worker threads with life cycle as follows:
	1. Get a new task to execute.
	2. Execute it
	3. Go back waiting for next task.
	
	ThreadPool are often used in Multi-Threaded servers. Each connection arriving at the server via the network is wrapped
	as a task and passed on to a thread pool. The threads in the thread pool will process the request on the connections
	concurrently.
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
	
	private String command;
	
	//Constructor
	public WorkerThread(String s){
		this.command = s;
	}
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() + " Start command: " + command);
		procesCommand();
		
		System.out.println(Thread.currentThread().getName() + " End");
	}
	
	private void procesCommand(){
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e) { e.printStackTrace(); }
	}
	
	public String toString(){
		return this.command;
	}
}


public class SimpleThreadPool{
	
	public static void main(String...args){
		
		// this line defines how many number of threads i want in thread pool. 
		//It will create 5 Thread Object and put them in ThreadPool.
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		// now let's give them work to execute.
		for(int i=0; i<10; i++){
			Runnable worker = new WorkerThread("Thread-" + i);
			executor.execute(worker);
		}
		/*As you can see in the above loop we have assigned 10 job and threads in the threadPool is 5
			So its like when a thread goes idle or finish the job, the next job given to him. Here we are doing 10 jobs
			with 5 thread object. Here we are reusing the thread objects instead of destroying and re-creating. 
		*/
		
		executor.shutdown();	// When all job done it will shutdown.
		
		// If we don't want to dead the main thread until all jobs are done then we can set a while loop and check if
		//all jobs are done or not.
		
		while(!executor.isTerminated()){	}
		
		
		System.out.println("Finished all threads");
	}
}