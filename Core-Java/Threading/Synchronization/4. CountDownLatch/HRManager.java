/* This is a more advance type of synchronization that can be done with concurrent package.
	Consider this example where an organization needs to recruit 3 Java developers. 
	For this HR manager has asked 3 Tech Leads to take interview.
	
	The HR manager only wants to distribute the offer letter only after all the 3 Java developers have been recruit.
	It means if any thread has done the work then it has to wait for others to finish and all will report the HR together.
	In threading terminology the HR manager should will wait till 3 developers have been recruited.
	
	We can't use join() concept here because once we join() the main() thread, The main() won't run until 
	thread ends completely.	if in run() method after recruiting the developers more work is available
	then main() method has to wait unnecessary. 

*/

// concurrent package: very asked in Interview.

import java.util.concurrent.CountDownLatch;
class HRManager{
	
	public static void main(String...s){
		// make object of CountDownLatch object. We can also define number of threads to wait.
		CountDownLatch cdL = new CountDownLatch(4);
		
		// give the reference id to threads and start all threads
		TechLead tL1 = new TechLead(cdL, "Sachin");
		TechLead tL2 = new TechLead(cdL, "Yuvraj");
		TechLead tL3 = new TechLead(cdL, "MS Dhoni");
		TechLead tL4 = new TechLead(cdL, "Virak Kohli");
		
		tL1.start();	tL2.start();	tL3.start();	tL4.start();
		
		try{
			System.out.println("The HR Manager is waiting for recruitment to complete");
			cdL.await();		// It will wait/pause the main thread until all threads done the required job.
			
			System.out.println("HR is now available and distributed the offer letter");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class TechLead extends Thread{
	
	CountDownLatch cdL;
	
	//Constructor
	TechLead(CountDownLatch cdL, String ThreadName){
		super(ThreadName);
		this.cdL = cdL;
	}
	
	@Override
	public void run(){
		
		// This is only to see the result slow (Nothing to do)
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + ": recruited");
		
		cdL.countDown();	// this will --1 decrement that one thread has done job and so on. 
		
		// This is only to see the result slow (Nothing to do)
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " is continuing the job and will be dead");
	}
}