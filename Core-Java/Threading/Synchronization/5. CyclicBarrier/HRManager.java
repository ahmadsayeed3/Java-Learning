/* Cyclic Barrier: A 5the way to achieve synchronization.
	
	Cyclic Barrier a synchronization aid that allows a set of threads to all wait for each other to reach a
	common barrier point. CyclicBarrier are useful in programs involving a fixed size party of threads that
	must occasionally wait for each other.
	The barrier is called cyclic barrier because it can be re-use after the waiting threads are released. 
	
	CountDownLatch we saw how a master or main thread waits till the worker thread finish their work. 
	CyclicBarrier class is also a flavor of CountDownLatch with single change that it can re-use.

	Let's continue the same example as CountDownLatch:
	An organization has to recruit 3 Java developers. And so the HR manager asks 3 Tech leads to interview the 
	candidates. In CountDownLatch example the HR manager wanted to distribute the offer letter to all the 3
	candidates, that's the reason we made him to wait. Here the HR manager wants the TechLeads to give the offer 
	letter once they have selected the candidates.
	
	But the TechLeads decide among themselves that they will give the offer letter to their respective candidate
	only when all interviews are done.
	
	Sare threads ko kisi ek jagah pe roke rehna aur tabhi aaage badhan jab sari us jagah pe pahuch jaye.
	Ye aise hai jese ke sare friends ek jagah pe pahuch jayenge tabhi sare ek sath jayenge.
*/

import java.util.concurrent.CyclicBarrier;

class HRManager{
	
	public static void main(String...a){
		
		// make object of cyclic barrier with thread size and give it to all threads
		CyclicBarrier cb = new CyclicBarrier(4);
		
		TechLeads tL1 = new TechLeads(cb, "Sachin");
		TechLeads tL2 = new TechLeads(cb, "Yuvraj");
		TechLeads tL3 = new TechLeads(cb, "MS Dhoni");
		TechLeads tL4 = new TechLeads(cb, "V Kohli");
		
		tL1.start();	tL2.start();	tL3.start();	tL4.start();
		
		System.out.println("No work of HR here so main is dead now");
	}
}

// TechLeads Thread
class TechLeads extends Thread{
	
	CyclicBarrier cb;
	
	// Constructor
	TechLeads(CyclicBarrier cb, String ThreadName){
		super(ThreadName);
		this.cb = cb;
	}
	
	@Override
	public void run(){
		
		// To see things let's make it slow down
		try{
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() 
			+ " recruited developer and waiting for others to complete");
			
			cb.await();  // this pause/wait for others thread to finish their task

			// Once All done the job, the bellow line will execute.
			System.out.println("All finished recruiting. " + Thread.currentThread().getName() + 
			" gives offer letter to candidate");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}