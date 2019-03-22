// wait(), notify() and notifyAll are methods of object class.
	// suspend method only releases a processor life cycle from any Thread State
    	// but wait() releases both processor life cycle and a lock from any Thread.
		

class Shared{
	
	int flag = 0;
	int data = 0;
	
	synchronized public void submit(){
		
		// Proper ways is first submit the amount then withdraw.
		// setting the flag value 1 so withdraw() won't call wait()
			// because flag=1 means I have already visited submit() and value is submitted
		
		// setting flag value 1
		flag = 1;
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		// submitting data and returning.
		this.data = 10;
		System.out.println("Value Deposited");
		// It will resume the Submit Thread. there is no problem if calling notify() without calling wait()
		notify(); 	
		// notifyAll resumes the all threads from blocked pool.
	}
	
	synchronized public int withdraw(){
		// If flag is 0, it means submit method is not called yet. So I need to call wait() 
			// that will leave the processor and a lock and submit() will call.
		if(flag == 0){
			try{
				System.out.println("Sending to wait so the submit() will run");
				// will wait until 
				wait();
			}catch(Exception e){ e.printStackTrace(); }
		}
		
		
		return this.data;
	}
}		
		
class Withdraw extends Thread{
	
	Shared s;
	
	Withdraw(Shared s, String str){
		super(str);
		this.s = s;
	}
	
	public void run(){
		s.withdraw();
	}
}

class Submit extends Thread{
	
	Shared s;
	
	Submit(Shared s, String str){
		super(str);
		this.s = s;
	}
	
	public void run(){
		s.submit();
	}
}



class RunThread3{
	public static void main(String...a){
		Shared s = new Shared();
		Withdraw wt = new Withdraw(s, "Withdraw Thread");
		Submit sb = new Submit(s, "Submit Thread");
		
		// Want to run withdraw method first so i will be able to see a scenario.
		wt.setPriority(10);
		
		wt.start();
		sb.start();
		
	}
}
