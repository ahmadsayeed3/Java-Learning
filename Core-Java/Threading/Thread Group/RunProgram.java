// Thread Group: Whenever we want to perform a common task like stop, suspend, interrupt
//  on more than one thread then we can make group of those threads and apply changes by group object.

class Vineet implements Runnable{
	
	public void run(){
		for(int i =0; i<5; i++){
			System.out.println(Thread.currentThread().getName() + " is playing");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		//System.out.println("Won't reach here because i am going to suspend it");
		System.out.println(Thread.currentThread().getName() + " is cheating");
	}
}

class Javed implements Runnable{
	
	public void run(){
		for(int i =0; i<5; i++){
			System.out.println(Thread.currentThread().getName() + " is playing");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		//System.out.println("Won't reach here because i am going to suspend it");
		System.out.println(Thread.currentThread().getName() + " is cheating");
	}
}

class Prem implements Runnable{
	
	public void run(){
		for(int i =0; i<2; i++){
			System.out.println(Thread.currentThread().getName() + " is playing");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		//System.out.println("Won't reach here because i am going to suspend it");
		System.out.println(Thread.currentThread().getName() + " is cheating");
	}
}


class RunProgram extends ThreadGroup{
	
	public void ChalLudoKhelteHai(){
		System.out.println("Chal Ludo Khelete Hai");
	}
	
	RunProgram(String s){
		super(s);
	}
	
	public static void main(String...a){
		
		RunProgram friends = new RunProgram("Ducat Group");
		
		Thread t1 = new Thread( friends, new Prem(), "SemiColon (;)" );
		Thread t2 = new Thread( friends, new Javed(), "Business Man" );
		Thread t3 = new Thread( friends, new Vineet(), "NotePad++" );
		
		t1.start(); t2.start(); t3.start();
		
		friends.ChalLudoKhelteHai();
		
		System.out.println("Threading" + " is playing");
		
		try {t1.join(); t2.join(); t3.join();}
		catch(Exception e){}
		System.out.println("Threading" + " ne Luda Faad Diya ");
		friends.stop();
		Thread.currentThread().stop();
		
		
		/*try{
			Thread.sleep(1000);
		}catch(Exception e ){
			System.out.println(e);
		}
		
		
		//System.out.println(Thread.currentThread().getName());
		//friends.stop();*/
	}
}