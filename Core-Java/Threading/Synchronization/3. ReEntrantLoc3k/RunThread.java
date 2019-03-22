// 3rd way to achieve to synchronization: lock() method
/*	As we know we use synchronized method or synchronized block when we want to share an object and wants to perform 
	task one by one. Here we achieve this via object lock. Only one thread can have object at a time.
	
	But requirement came to perform Thread tasks one by one but they are not sharing the same object. They all have
	different resource (object) so synchronized block won't fulfill the requirement. Because synchronized block
	do this via object lock and in this case all threads have different object lock.
	
	To solve this perform ReEntrantLock came.

*/

	// Question paper is one and and three interviewer is going to use it one by one.
/*
	HR of a company wants to hire a 3 Java developers. For this he selects 3 Tech-Leads 
	that will conduct the test and select candidates. One Tech Leads will select only one candidate.
	The problem is there is only one Question-Paper and xerox machine is not working. 
	So now at time only one Tech-Lead is having question-paper. One Tech-Lead will conduct the test
	and other tech-leads have to wait for question-paper. 
	When one tech-lead has taken the test then he gives question-paper back. Now other tech-leads
	can take the question-paper and conduct the test.
*/

// Tips: We can't use more than one unlock method in a single method.
	
import java.util.concurrent.locks.ReentrantLock;
class ThreadOne extends Thread{
	
	ReentrantLock qp;
	
	ThreadOne(ReentrantLock qp, String s){
		super(s);
		this.qp = qp;
	}
	
	public void run(){
		System.out.println(getName() + " is waiting for question paper");
		// Lock the question-paper
		System.out.println("In " + getName() + " qp is  locked " + qp.isLocked());
		qp.lock();
		
		
		
		System.out.println(getName() + " got the question paper");
		System.out.println(getName() + " Start taking test");
		
		
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println("Thread is interrupted");
		}
		
		System.out.println(getName() + " has taken the test and returning the lock");
		// Test has taken, unlock the paper so other tech-leads will be able to conduct test.
		qp.unlock();
	}
	
}

class RunThread{
	
	public static void main(String...a){
		// Predefined class given by java.
		ReentrantLock qp = new ReentrantLock();
		
		new ThreadOne(qp, "Tech Lead 1").start();
		new ThreadOne(qp, "Tech Lead 2").start();
		new ThreadOne(qp, "Tech Lead 3").start();
	}
}
