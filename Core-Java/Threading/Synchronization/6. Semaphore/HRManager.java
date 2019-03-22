/* Semaphore 6th way to achieve synchronization.

Semaphore class is in concurrent package is used as a pool that can be acquired and release very much like
Lock but with a difference. When a thread acquires lock not other thread can enter synchronized block.

Here in Semaphore we can define the pool size and threads can acquire lock till there is resource left in the pool.
If we want to enter more than one thread in synchronized/Critical block then we can do this via Semaphore.

let's see how it work:

The organization needs to recruit 4 Java developers. HR manager asks 4 TechLeads to conduct test and recruit the
candidates. The problem here is that TechLeads have only 2 test paper and the photo copy machine is down.
That means at runtime only two candidates can give the test and other two have to wait.
Let's simulate this by Semaphore example:
*/

import java.util.concurrent.Semaphore;

public class HRManager{
	
	public static void main(String...a){
		/* make an object and give it TechLeads. We can define at a time how many threads can go to inside
		critical situation. In above scenario 2 TechLeads can take test. */
		Semaphore sp = new Semaphore(2);
		
		TechLeads tL1 = new TechLeads(sp, "Raju TL");
		TechLeads tL2 = new TechLeads(sp, "Tahera TL");
		TechLeads tL3 = new TechLeads(sp, "Pawan TL");
		TechLeads tL4 = new TechLeads(sp, "Shayam TL");
		
		tL1.start();	tL2.start();	tL3.start();	tL4.start();
		
		System.out.println("HR Manager has no work now and main thread will dead");
	}
}

class TechLeads extends Thread{
	
	Semaphore sp;
	
	// constructor
	TechLeads(Semaphore sp, String ThreadName){
		super(ThreadName);
		this.sp = sp;
	}
	
	@Override
	public void run(){
		try{
			
			System.out.println(Thread.currentThread().getName() + " is waiting for the test paper");
			
			// Acquiring a question paper, one more thread can acquire it as we defined.
			sp.acquire();
			
			System.out.println(Thread.currentThread().getName() + "acquired the question paper");
			
			// sleeping for 2 seconds to know that if 2nd TechLeads get the question paper
			Thread.sleep(2000);
			
			System.out.println(Thread.currentThread().getName() + " Test done giving back the paper" );
			sp.release();	// first thread has done the work and now third thread will get the test paper and so on.
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}