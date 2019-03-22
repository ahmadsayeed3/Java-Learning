import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.CyclicBarrier;
class TechLeads extends Thread{
	
	ReentrantLock[] qp;
	String[] topic;
	String[] topicDone = new String[3];
	CyclicBarrier[] cb;
	//Constructor
	public TechLeads(ReentrantLock[] re, String[] topic, String threadName, CyclicBarrier[] cb){
		super(threadName);
		this.qp = re;
		this.topic = topic;
		this.cb = cb;
	}
	
	
	@Override
	public void run(){
		
		System.out.println(getName() + " is waiting for question paper");
		try{
			while(topicDone[0] != "done" && topicDone[1] != "done" && topicDone[2] != "done"){
				//cb[0].await();
				for(int i=0; i<qp.length; i++){
					if(qp[i].isLocked() == false && topicDone[i] != "done"){
						qp[i].lock();
						
						System.out.println(getName() + " got the " + topic[i] + " and taking test");
						// sleeping so other we get chance to get other question paper
						try{  Thread.sleep(2000); }
						catch(Exception e){ System.out.println("Thread is interrupted");	}
						
						
						System.out.println(getName() + " has taken the test and returning the " + topic[i]);
						
						// Test has taken, unlock the paper so other tech-leads will be able to conduct test.
						topicDone[i] = "done";
						qp[i].unlock();
						try{  Thread.sleep(2000); }
						catch(Exception e){ System.out.println("Thread is interrupted");	}
					}
					
				}
			}
		}catch(Exception e){	e.printStackTrace();	}
	}
}

public class RunThread{
	
	public static void main(String...a){
		
		CyclicBarrier[] cb = {new CyclicBarrier(3), new CyclicBarrier(3), new CyclicBarrier(3)};
		// Predefined class given by java.
		ReentrantLock[] qp = {new ReentrantLock(), new ReentrantLock(), new ReentrantLock()};
		String[] topic = {"Math", "Science", "English"};
		
		new TechLeads(qp, topic, "Tech Lead 1", cb).start();
		new TechLeads(qp, topic, "Tech Lead 2", cb).start();
		new TechLeads(qp, topic, "Tech Lead 3", cb).start();
	}
}